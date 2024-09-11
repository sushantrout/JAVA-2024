package com.bip;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set elements = new HashSet(); //Plumorphim

        //add
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
        elements.add(6);
        System.out.println("Insert : " + elements.add(7)); //boolean
        System.out.println("Insert : " + elements.add(7)); //boolean


        //System.out.println(elements.remove(7)); //java.lang.IndexOutOfBoundsException
        System.out.println(elements.remove(6)); //7

        System.out.println(elements);



        elements.add(5);

        System.out.println(elements.isEmpty()); //true

        System.out.println(elements.size()); //7

        System.out.println(elements);

        //Satya will explain sushant
        for(Object data : elements) {
            System.out.println(data);
        }
    }
}
