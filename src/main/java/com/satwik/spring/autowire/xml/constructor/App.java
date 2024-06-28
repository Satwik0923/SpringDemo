package com.satwik.spring.autowire.xml.constructor;

import com.satwik.spring.autowire.xml.bytype.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiredbyconstructor.xml");
        Car mustang = (Car) context.getBean("car1");
        System.out.println(mustang);

    }
}
