package com.tech.poly;

public class Child2  extends Parent {
    public Child2() {
        System.out.println("child2");
    }

    public void m1() {
        System.out.println(this.getClass().getName() + "M1");
    }

    static {
        System.out.println("Child2 Static block");
    }

    {
        System.out.println("Child2 instance block");
    }
}
