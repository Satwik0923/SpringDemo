package com.satwik.spring.autowire.qualifier;

import com.satwik.spring.autowire.annotations.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiredqualifier.xml");
        Bike bike1 = (Bike) context.getBean("bike");
        System.out.println(bike1);

    }
}
