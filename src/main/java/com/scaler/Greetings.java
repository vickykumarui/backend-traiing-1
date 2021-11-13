package com.scaler;

import java.util.Random;

public class Greetings {
    String[] greetings = {"Hella", "Hello", "Helo", "Hola", "TestHello"};
    Random r = new Random();

    String getRandomGreetings(){

        return greetings[r.nextInt( 4)];
    }
}
