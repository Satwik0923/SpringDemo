package com.satwik.spring.autowire.annotations;

import com.satwik.spring.autowire.xml.byname.Bike;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiredannotations.xml");
        Patient patient = (Patient) context.getBean("patient");
        System.out.println(patient);

    }
}
