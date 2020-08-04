package com.example.demo.Controller;

import com.example.demo.Config.ExceptionHandler;
import com.example.demo.Models.User;
import com.example.demo.Service.UserService;
import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;


@Controller
@SessionAttributes("ValidId")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private ApplicationContext applicationContext;

    Logger logger = LoggerFactory.getLogger(AuthController.class);
//    Logger logger2 = LogManager.getLogger();


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String doDisplyaLoginForm() {
        return "loginForm";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLoginAction(Model model, @RequestParam String email, @RequestParam String password) {

        try {
            userService.checkCredentials(email, password);
            User user = userService.getUserByEmail(email);

            //test
            userService.checkUserEmailAvailable(email);


            model.addAttribute("ValidId", user.getId());
            return "redirect:/homepage";


        } catch (ExceptionHandler exceptionHandler) {


            model.addAttribute("e", applicationContext.getMessage(exceptionHandler.getCode(), new Object[]{}, Locale.forLanguageTag("RO")));

            logger.info("this is a INFO type Log", exceptionHandler.getCode(), email);
            logger.error(exceptionHandler.getCode());

            return "loginForm";
        }

    }

    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public String doDisplayHomePage(Model model) {
        long id = (long) model.getAttribute("ValidId");
        model.addAttribute("user", userService.getById(id));

        return "homePageForm";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String doInvalidateSession(HttpSession httpSession) {
        httpSession.invalidate();
        return "redirect:/login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String doDisplayRegister(Model model) {
        model.addAttribute(new User());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void doRegister(@ModelAttribute User user) {

    }


}
