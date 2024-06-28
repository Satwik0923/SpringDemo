package com.satwik.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("properties.xml");
        LolDAO mydao = (LolDAO) context.getBean("mydao");
        System.out.println(mydao);

    }

}
