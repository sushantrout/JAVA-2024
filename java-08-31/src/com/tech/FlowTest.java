package com.tech;

public class FlowTest extends FlowTestP {

    //constructer
    FlowTest() {
        System.out.println("Flow1");
    }

    //main
    public static void main(String[] args) {
        new FlowTest();
        System.out.println("Flow2");
    }

    //instance block
    {

        System.out.println("Instance bkock child");
    }

    //static block : at the time class load to JVN this block will execute
    static {
        System.out.println("Static Child");
    }
}
