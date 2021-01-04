package com.example.beardbalmbeast.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
    @GetMapping("/error")
    public String getErrorPage(){
        return "error";
    }
}
