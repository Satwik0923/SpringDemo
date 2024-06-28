package com.satwik.spring.autowire.xml.byname;

import com.satwik.spring.autowire.xml.bytype.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiredbyname.xml");
        Bike REbike = (Bike) context.getBean("RE");
        System.out.println(REbike);

    }
}
