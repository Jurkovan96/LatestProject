package com.example.demo.Controller;

import com.example.demo.Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("LoggedUsr")
public class AthController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String doTheGodDamnLogin(Model model) {
        model.addAttribute("LoggedUsr", new User());
        return "loginForm";
    }


    @RequestMapping(value = "/someplace", method = RequestMethod.GET)
    public String doTheSomePage() {

        return "pageForm";
    }


}
