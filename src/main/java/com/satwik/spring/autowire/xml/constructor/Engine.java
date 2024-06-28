package com.satwik.spring.autowire.xml.constructor;

public class Engine {
    private String name;
    private String Type;
    private int cc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getCc() {
        return cc;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", Type='" + Type + '\'' +
                ", cc=" + cc +
                '}';
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
