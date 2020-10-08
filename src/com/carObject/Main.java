package com.carObject;

public class Main {

    public static void main(String[] args) {
        Die die = new Die();
        Dice myRoll = new Dice(6, die.getValue());


//        System.out.println(myRoll.getDieValue(0));
        System.out.println(myRoll);
        Game.userInput();
//        myRoll.userInteraction();
        }
    }

