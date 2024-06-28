package com.satwik.spring.requiredannotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    // Required annotation should be only set for setter methods of respective field that we want to make mandatory
    // If the id field is empty we will get checked exception the program will not compile
    @Required
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
