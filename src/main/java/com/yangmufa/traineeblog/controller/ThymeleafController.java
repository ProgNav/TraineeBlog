package com.yangmufa.traineeblog.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ThymeleafController {
    @GetMapping("/thymeleaf")
    public String hello(
            HttpServletRequest request,
            @RequestParam(value = "description", required = false, defaultValue = "springboot-thymeleaf")
            String description) {
        request.setAttribute("description", description);
        return "thymeleaf";
    }
}
