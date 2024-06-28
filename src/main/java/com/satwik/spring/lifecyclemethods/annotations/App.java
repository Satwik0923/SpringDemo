package com.satwik.spring.lifecyclemethods.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("patientlcanno.xml");
        Patient patient = (Patient) context.getBean("patient");
        System.out.println(patient);
        context.registerShutdownHook(); //This will make the container to invoke destroy method

    }
}
