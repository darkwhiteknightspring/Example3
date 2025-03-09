package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*

Spring @configuration annotation is part of the spring core framework.
Spring configuration annotation indicates that the class has @Bean definition methods.
So spring container can process the class and generate Spring beans to be used in the application.

*/



/*
@Configuration annotation is used to define configuration classes, which are sources of bean definitions for the Spring IoC (Inversion of Control) container. It replaces the traditional XML-based configuration with a more modern, type-safe approach

*/

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Toyota");
        return veh;
    }



}
