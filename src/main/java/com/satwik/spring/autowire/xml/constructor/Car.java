package com.satwik.spring.autowire.xml.constructor;



public class Car {
    private String name;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
