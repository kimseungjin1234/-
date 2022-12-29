package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String hello(Model model){
        model.addAttribute("username", "강지");
        return "greetings";
    }

    @GetMapping("/bye")
    public String bye(Model model) {
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }

    
}
