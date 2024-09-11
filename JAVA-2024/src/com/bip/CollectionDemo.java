package com.bip;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List elements = new ArrayList();

        //add
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
        elements.add(6);
        elements.add(7);


        System.out.println(elements.indexOf(10)); //-1 //get index of element
        System.out.println(elements.indexOf(5)); //4 //

        //System.out.println(elements.get(10)); //java.lang.IndexOutOfBoundsException
        System.out.println(elements.get(5)); //6

        //System.out.println(elements.remove(7)); //java.lang.IndexOutOfBoundsException
        System.out.println(elements.remove(6)); //7

        System.out.println(elements);

        System.out.println(elements.getFirst()); //1

        System.out.println(elements.getLast()); //6

        elements.add(5);
        System.out.println(elements.lastIndexOf(5)); //6

        System.out.println(elements.isEmpty()); //true

        System.out.println(elements.size()); //7

        System.out.println(elements);
    }
}
