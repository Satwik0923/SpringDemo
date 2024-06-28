package com.satwik.spring.autowire.xml.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiredbytype.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);

    }
}
