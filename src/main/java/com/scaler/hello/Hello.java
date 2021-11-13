package com.scaler;

public class Hello {
    public static void main(String[] args) {

        Greetings gr = new Greetings();
        StringBuilder sr = new StringBuilder();

        sr.append(gr.getRandomGreetings());
        sr.append(" - ");
        sr.append(args[0]);
        System.out.println(sr);
    }
}
