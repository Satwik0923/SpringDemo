package com.satwik.spring.autowire.xml.byname;

public class Engine {

    private String name;
    private String model;
    private int cc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", cc=" + cc +
                '}';
    }
}
