package com.tech.consumer;

import com.tech.provider.PhonePay;

public class HDFCBank extends PhonePay {
    @Override
    public void credit() {
        System.out.println("HDFCBank credit()");
    }

    @Override
    public void debit() {
        System.out.println("HDFCBank debit()");
    }

    @Override
    public void balanceCheck() {
        System.out.println("HDFCBank balanceCheck()");
    }
}
