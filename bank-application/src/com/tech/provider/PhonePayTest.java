package com.tech.provider;

import com.tech.consumer.HDFCBank;
import com.tech.consumer.ICICIBank;

import java.util.Scanner;

public class PhonePayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER Bank name");
        String next = scanner.next();

        System.out.print("Operation type:");
        String type = scanner.next();

        PhonePay bank = new PhonePay();

        if("HDFC".equalsIgnoreCase(next)) {
            bank = new HDFCBank(); //p1
        } else if("ICICI".equalsIgnoreCase(next)) {
            bank = new ICICIBank(); //p2
        }

        if(type.equalsIgnoreCase("debit")) {
            bank.debit();
        } else if (type.equalsIgnoreCase("credit")) {
            bank.credit();
        } else {
            bank.balanceCheck();
        }
    }
}
