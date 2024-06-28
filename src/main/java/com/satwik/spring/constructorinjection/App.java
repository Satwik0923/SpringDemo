package com.satwik.spring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("patienttest.xml");
        Patient patient = (Patient) context.getBean("patient");
        System.out.println(patient);

    }
}
