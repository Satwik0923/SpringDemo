package com.satwik.spring.constructorinjection;

public class Patient {

    private int id;
    private String name;
    private Test tests;

    public Patient(int id, String name, Test tests) {
        this.id = id;
        this.name = name;
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tests=" + tests +
                '}';
    }
}
