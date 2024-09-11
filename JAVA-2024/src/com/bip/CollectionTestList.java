package com.bip;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestList {
    public static void main(String[] args) {
        List list = new ArrayList<>(); //Parent p = new Child()

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum = 0;
        for(Object obj : list) {
            //sum = sum + obj;
        }

        System.out.println(sum);
    }
}