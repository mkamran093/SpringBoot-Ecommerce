package com.kamran.ECommerce.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("")
    public String home(HttpServletRequest request) {
        return "Home Page " + request.getSession().getId();
    }

    @GetMapping("/about")
    public String about() {
        return "about page";
    }
}
