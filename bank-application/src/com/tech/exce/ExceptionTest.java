package com.tech.exce;

import java.util.Scanner;

public class ExceptionTest {
    public static final String NAME = "SUSHANT";
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter Name: ");
            String name = scanner.next();

            System.out.println("Enter age: ");
            int age = scanner.nextInt();


            if (age < 18) {
                try {
                    throw new AgeException(name + " :)");
                } catch (AgeException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Congr......");
            }

            //Class.forName("");
        } catch (Exception e) {

        } finally {
            scanner.close();
        }

    }
}
