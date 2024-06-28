package com.satwik.spring.lifecyclemethods.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inisde setter method");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Inside init method lol");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("Inside destroy method lol");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
