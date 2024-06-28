package com.satwik.spring.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.xml"); //Creating spring container with xml config which have dependencies of Student and Address bean
        Student student = (Student) context.getBean("student");
        System.out.println(student);

    }
}
