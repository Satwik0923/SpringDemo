package com.satwik.spring.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("stanalone.xml");
        Products products = (Products) context.getBean("products");
        System.out.println(products);

    }

}
