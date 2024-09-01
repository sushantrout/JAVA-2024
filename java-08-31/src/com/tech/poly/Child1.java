package com.tech.poly;

public class Child1 extends Parent {
    public Child1() {
        System.out.println("child1");
    }

    public void m1() {
        System.out.println(this.getClass().getName() + "M1");
    }

    static {
        System.out.println("Child1 Static block");
    }

    {
        System.out.println("Child1 intsance block");
    }
}
