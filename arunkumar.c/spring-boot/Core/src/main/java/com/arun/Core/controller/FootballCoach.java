package com.arun.Core.controller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Lazy
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FootballCoach implements Coach{
    FootballCoach(){
        System.out.println("Hi from football");
    }
    @PostConstruct
    void initialize(){
        System.out.println("Initializing method football coach");
    }
    @Override
    public String getWorkout() {
        return "Goal keeping for 10 mins";
    }
    @PreDestroy
    void destroy(){
        System.out.println("Byee from football");
    }

}
