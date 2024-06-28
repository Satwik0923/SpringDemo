package com.satwik.spring.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ambiguity.xml");
        Addition add = (Addition) context.getBean("add");
        System.out.println(add);
    }
}
