package com.bip;

import java.util.ArrayList;
import java.util.List;

public class SumOfList {
    public static void main(String[] args) {
        List<Integer> datas = new ArrayList<>();

        datas.add(1);
        datas.add(2);
        datas.add(3);
        datas.add(4);
        datas.add(5);
        datas.add(6);
        datas.add(7);

        int sum = 0;
        for (Integer data : datas) {
            sum = sum + data; //x as HtmlElement
        }

        System.out.println("Sum: " + sum);



    }
}
