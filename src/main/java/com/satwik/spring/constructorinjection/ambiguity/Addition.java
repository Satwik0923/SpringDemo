package com.satwik.spring.constructorinjection.ambiguity;

public class Addition {

    private int a;
    private int b;

    public Addition(double a, double b)
    {
        System.out.println("Inside double constructor");
    }

    public Addition(int a, int b) {
        System.out.println("Inside Int constructor");
    }

    public Addition(String a, String b)
    {
        System.out.println("Inside String constructor");
    }

    public Addition (int x , double y)
    {
        System.out.println("inside int double constructor");
    }

}
