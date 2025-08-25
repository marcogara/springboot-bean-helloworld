package com.example.beanlifecycle.controller;

import com.example.beanlifecycle.bean.HelloBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller   // NOTE: not @RestController here
public class HomeController {

    private final HelloBean helloBean;

    public HomeController(HelloBean helloBean) {
        this.helloBean = helloBean;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", helloBean.getMessage());
        return "index"; // Spring Boot will look for index.html in templates/
    }
}