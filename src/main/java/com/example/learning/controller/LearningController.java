package com.example.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learning")
public class LearningController {
    @GetMapping("/get")
    public String  getCall(){
        System.out.println();
        return "Come to Learning part";
    }


}
