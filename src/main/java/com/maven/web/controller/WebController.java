package com.maven.web.controller;

import com.maven.web.model.Konsumen;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String formAdd(Model model) {
        Konsumen konsumen = new Konsumen();
        model.addAttribute("konsumen", konsumen);
        return "register";
    }

    @PostMapping("/register/add")
    public String postAdd(@ModelAttribute("konsumen") Konsumen konsumen) {
        System.out.println(konsumen.getStatus());
        return "result";
    }
}