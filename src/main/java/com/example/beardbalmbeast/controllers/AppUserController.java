package com.example.beardbalmbeast.controllers;

import com.example.beardbalmbeast.models.user.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class AppUserController {

    @Autowired
    AppUserRepository AppUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String directUserHome(Principal principal, Model m){
        m.addAttribute("user", principal);
        return "home";
    }

    @GetMapping("/store")
    public String renderStore(Principal principal, Model m) {
        m.addAttribute("user", principal);
        return "storeMain";
    }

    @GetMapping("/products")
    public String renderProductPage(Principal principal, Model m) {
        m.addAttribute("user", principal);
        return "productPage";
    }
}
