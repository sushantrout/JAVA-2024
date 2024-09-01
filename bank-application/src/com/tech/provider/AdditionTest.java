package com.tech.provider;

public class AdditionTest {
    int add(int i, int i1) {
        return i + i1;
    }

    int add(int i, int i1, int i2) {
        return i + i1 + i2;
    }

    public static void main(String[] args) {
        AdditionTest additionTest = new AdditionTest();
        int add = additionTest.add(1, 2);
        System.out.println(add);

        add = additionTest.add(1, 2, 3);

        System.out.println(add);

    }

}
