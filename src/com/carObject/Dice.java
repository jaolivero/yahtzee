package com.carObject;

import java.util.*;

public class Dice extends Die {
    private int numberDice;
    private int dieValue;
    private static Scanner scan = new Scanner(System.in);
    public boolean value;
    public List<Die> dice = new ArrayList<Die>();

    public Dice() {
        numberDice = 0;
        dieValue = 0;
    }

    public Dice(int numberDice, int dieValue) {
        this.numberDice = numberDice;
        this.dieValue = dieValue;
    }

    public void assignValue() {
        for (int i = 0; i < 5; i++) {
            // var newDie = new Die();
            dice.add(new Die());
            // inline. Only user variable once.
        }
    }

    public void reRoll(int random) {
        while (true) {
            System.out.println("Would you like to reroll the first dice?");
            String firstDice = scan.nextLine();
            System.out.println(firstDice);
            if(firstDice == "yes") {
                dice.set(1, new Die());
            }


            // Access array, create random, random = array[index]
            System.out.println("Which dice would you like to roll a specific dice");
            int specificDie = scan.nextInt();
            // Access array[index], make it equal to random.

            System.out.println("Reroll multiple dice");
            int multipleDice = scan.nextInt();


            //break
        }
    }

        public int getDieValue (int pos){
            return dice.get(pos).getValue();
        }
    }
//    public int getDieValue(int numberDice)
//    {
//
    //public int multiRoll() {
    // access the all index of the dices we desire to reroll
    //}

    //    public int toString() {
//        return Integer.toString(Dice);
//    }


