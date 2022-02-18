package com.example.testapp.Controllers;


import com.example.testapp.Service.fredagsservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {
    @GetMapping("/hello")
    public String hello(){
        return "Eow dig";
    }

    @GetMapping("/input")
    public String input(@RequestParam String test){
        return "Dit input var: " + test;
    }

    @GetMapping("/erdetfredag")
    public String fredag(){
        return new fredagsservice().erdetfredag();
    }


}
