package com.company.helloworldspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;

@Controller
public class HelloWorldSpringController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String homePage(Model model, HttpSession session) {
        model.addAttribute("place", "Thunderdome");
        return "index";
    }
}
