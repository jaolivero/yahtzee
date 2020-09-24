package com.carObject;

public class Main {

    public static void main(String[] args) {
        Die die = new Die();
        Dice dice = new Dice(6, die.getValue());

        System.out.println(dice.assignValue());
        System.out.println(die.roll());


        }
    }

