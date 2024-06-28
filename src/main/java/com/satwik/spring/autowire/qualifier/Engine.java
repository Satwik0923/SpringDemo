package com.satwik.spring.autowire.qualifier;

public class Engine {

    private String name;
    private String cc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", cc='" + cc + '\'' +
                '}';
    }
}
