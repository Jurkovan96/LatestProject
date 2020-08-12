//package com.example.demo.Controller;
//
//import com.example.demo.Models.Comments;
//import com.example.demo.Models.User;
//import com.example.demo.Service.UserService;
//import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
//import com.sun.xml.internal.ws.api.ha.StickyFeature;
//import org.apache.catalina.Session;
//import org.omg.PortableInterceptor.Interceptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpSession;
//import java.net.InetSocketAddress;
//import java.sql.Timestamp;
//import java.time.LocalDateTime;
//import java.util.List;
//
//
//@Controller
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String registerPage(Model model) {
//        model.addAttribute("user", new User());
//        return "userForm";
//    }
//
//    @RequestMapping(value = "/registerSuccess", method = RequestMethod.POST)
//    public String registerSuccess(@ModelAttribute("user") User user) {
//        userService.saveUser(user);
//        return "redirect:/altceva";
//    }
//
//    @RequestMapping(value = "/altceva", method = RequestMethod.GET)
//    public ModelAndView registerSuccess(ModelAndView modelAndView) {
//        modelAndView.setViewName("UserList");
//        List<User> userList = userService.getAllUsers();
//        modelAndView.addObject("userList", userList);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
//    public String deleteUserById(@PathVariable long id) {
//        userService.deleteUser(id);
//        return "redirect:/altceva";
//    }
//
////    @RequestMapping(value = "{id}/get", method = RequestMethod.GET)
////    public ModelAndView getAUser(ModelAndView modelAndView, @PathVariable long id) {
////        modelAndView.setViewName("UserProfile");
////        modelAndView.addObject("singleUser", userService.getById(id));
////        return modelAndView;
////    }
//
//
//    @RequestMapping(value = "{lastname}/get", method = RequestMethod.GET)
//    public ModelAndView getAUserByLanstName(ModelAndView modelAndView, @PathVariable String lastname) {
//        modelAndView.setViewName("UserProfile");
//        modelAndView.addObject("singleUser", userService.findByName(lastname));
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/comments", method = RequestMethod.POST)
//    public String commentsInser(@RequestParam String text, HttpSession httpSession) {
//        Comments comments = new Comments();
//        comments.setText(text);
//        long id = ((long) httpSession.getAttribute("validUserId"));
//        comments.setUser(userService.getById(id));
//        userService.saveCommnets(comments);
//        return "redirect:/ceva";
//    }
//
//}
