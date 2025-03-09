package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle veh = context.getBean(Vehicle.class);
//        System.out.println("Vehicle name from spring context is:"+ veh.getName());

//        This would give error as there are three beans having the same name


        Vehicle veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from spring context is:"+ veh.getName());

    }
}
