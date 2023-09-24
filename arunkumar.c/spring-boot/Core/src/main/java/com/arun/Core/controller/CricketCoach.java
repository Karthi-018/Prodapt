package com.arun.Core.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class CricketCoach implements Coach{
    CricketCoach(){
        System.out.println("Hi from cricket coach");
    }
    @Override
    public String getWorkout() {
        return "Batting practice for 10 mins";
    }
}
