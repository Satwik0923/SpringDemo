package com.satwik.spring.lifecyclemethods.xml;

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

    public void hi() //init method
    {
        System.out.println("Inside hi method");
    }

    public void bye()//destroy method
    {
        System.out.println("Inside bye method");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
