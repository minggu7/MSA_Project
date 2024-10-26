package com.example.EurekaClient.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomController {

    @GetMapping("/ms1/home1")
    public String Home(){

        return "home1";
    }
}
