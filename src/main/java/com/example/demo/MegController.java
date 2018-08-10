package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MegController {
    @GetMapping("/")
    public String meglove(){
        return "welcome";
    }

}
