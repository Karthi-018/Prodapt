package com.arun.Core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Qualifier("footballCoach")
    @Autowired
    Coach coach;

    @Qualifier("footballCoach")
    @Autowired
    Coach coach1;
    @GetMapping("/getWorkout")
    String hi(){
        System.out.println(coach1);
        System.out.println(coach);
        return coach.getWorkout();
    }
}
