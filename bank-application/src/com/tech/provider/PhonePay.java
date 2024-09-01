package com.tech.provider;

public class PhonePay {
    public void credit() {
        System.out.println(this.getClass().getName()+"credit()");
    }

    public void debit() {
        System.out.println(this.getClass().getName()+"debit()");
    }

    public void balanceCheck() {
        System.out.println(this.getClass().getName()+"balanceCheck()");
    }
}
