package com.tech.consumer;

import com.tech.provider.PhonePay;

public class ICICIBank extends PhonePay {
    @Override
    public void credit() {
        System.out.println("ICICIBank credit()");
    }

    @Override
    public void debit() {
        System.out.println("ICICIBank debit()");
    }

    @Override
    public void balanceCheck() {
        System.out.println("ICICIBank balanceCheck()");
    }
}
