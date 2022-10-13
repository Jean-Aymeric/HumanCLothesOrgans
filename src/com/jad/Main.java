package com.jad;

public class Main {

    public static void main(String[] args) {
        Human jad = new Human();
        jad.wear(new Slip());
        jad.wear(new Sock());
        jad.wear(new Sock());
        jad.graft(new HeartSteal());
        System.out.println(jad);
    }
}
