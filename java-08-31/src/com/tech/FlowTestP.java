package com.tech;

public class FlowTestP {
    FlowTestP() {
        System.out.println("PC()");
    }
    static {
        System.out.println("Static parent");
    }
    {
        System.out.println("Instaonce block of parent");
    }
}
