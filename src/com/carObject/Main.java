package com.carObject;

public class Main {

    public static void main(String[] args) {
        Die die = new Die();
        Dice myRoll = new Dice(6, 0);
        myRoll.beginGame();
    }
}

