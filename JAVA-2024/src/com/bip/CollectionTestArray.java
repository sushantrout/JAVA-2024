package com.bip;

public class CollectionTestArray {
    public static void main(String[] args) {
        //10 -> integer number
        int p[] = {1,2,3,4,5};

        p[6] = 6;

        int sum = 0;
        for (int i=0; i < p.length; i++) {
            sum = sum + p[i];
        }

        System.out.println("Sum : " +sum);

    }
}
