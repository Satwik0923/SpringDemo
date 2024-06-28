package com.satwik.spring.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Patient {
    private String name;
    private int age;

    @Autowired
    private Dig prescription;

    /*@Autowired
    public Patient(String name, int age, Dig prescription) {
        this.name = name;
        this.age = age;
        this.prescription = prescription;
    }@Autowired By using constructor*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dig getPrescription() {
        return prescription;
    }

    //@Autowired
    public void setPrescription(Dig prescription) {
        this.prescription = prescription;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", prescription=" + prescription +
                '}';
    }
}
