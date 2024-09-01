package com.tech.poly;

public class Parent {
    public Parent() {
        System.out.println("Parent");
    }

    public void m1() {
        System.out.println(this.getClass().getName() + "M1");
    }

    {
        System.out.println("Parent instance block");
    }

    static {
        System.out.println("Parent Static block");
    }
}
