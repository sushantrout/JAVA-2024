package com.tech.provider;

import com.tech.consumer.HDFCBank;
import com.tech.consumer.ICICIBank;

import java.util.Scanner;

public class PhonePayTestBK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER Bank name");
        String next = scanner.next();

        System.out.print("Operation type:");
        String type = scanner.next();

        if("HDFC".equalsIgnoreCase(next)) {
            HDFCBank hdfcBank = new HDFCBank();
            if(type.equalsIgnoreCase("debit")) {
                hdfcBank.debit();
            } else if (type.equalsIgnoreCase("credit")) {
                hdfcBank.credit();
            } else {
                hdfcBank.balanceCheck();
            }
        } else if("ICICI".equalsIgnoreCase(next)) {
            ICICIBank iciciBank = new ICICIBank();
            if(type.equalsIgnoreCase("debit")) {
                iciciBank.debit();
            } else if (type.equalsIgnoreCase("credit")) {
                iciciBank.credit();
            } else {
                iciciBank.balanceCheck();
            }
        }
    }
}
