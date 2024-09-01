package com.tech.poly;

public class PolyTest {
    public static void main(String[] args) {
        //Parent parent = new Parent();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
    }

    static {
        System.out.println("test static block");
    }

    {
        System.out.println("Test instance block");
    }
}
