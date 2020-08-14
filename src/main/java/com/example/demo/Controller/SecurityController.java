package com.example.demo.Controller;

import com.example.demo.Models.User;
import com.example.demo.Security.SecurityConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;


@Controller
@SessionAttributes("numId")
public class SecurityController {

    @Autowired
    private SecurityConfiguration securityConfiguration;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHomePage(HttpSession httpSession, Model model, @ModelAttribute User user) {
        httpSession.getId();
        System.out.printf(httpSession.getId());
        model.addAttribute("numId", httpSession.getId());
        model.addAttribute("user", user.getId());

        return "pageForm";
    }

}
