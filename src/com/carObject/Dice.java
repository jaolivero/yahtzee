package com.carObject;



import java.util.*;

public class Dice extends Die {
    private int numberDice;
    public int rounds;
    private static Scanner scan = new Scanner(System.in);
    public List<Die> dice = new ArrayList<Die>();
    public List<Integer> dieList = new ArrayList<Integer>();

    public Dice(int numberDice, int rounds) {
        this.numberDice = numberDice;
        this.rounds = rounds;
        beginGame();
    }

    private void assignValue() {
        for(int i = 0; i < 5; i++){
            dice.add(new Die());
            dice.get(i).roll();
        }
        rounds++;
        System.out.println("Round " + rounds);
        displayScore();
        }

        public void reRoll(int input) {
        if (input <= 5) {
            Die die= dice.get(input - 1);
            die.roll();
        }
    }

    public void displayScore() {
       for (int j = 0; j < 5; j++) {
           System.out.println(dice.get(j).getValue());
       }
    }

    public static List<Integer> userInteraction() {
        System.out.println("Input the dice you would like to reroll");
        String input = scan.nextLine();
        System.out.println(input);
        String[] numArray = input.split(" "); // [ "1", "2", "3" ]
        List<Integer> choices = new ArrayList<Integer>();
        for (String number : numArray) {
            choices.add(Integer.parseInt(number) - 1);
            }
            return choices;
        }

    public void beginGame() {
        assignValue();
        while(rounds < 3) {
            userInteraction();
            rounds++;
        }
        displayScore();
    }

        public int getDieValue (int pos){
            return dice.get(pos).getValue();
    }

    public String toString(){
        return Integer.toString(getValue());
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


