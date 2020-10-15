package com.carObject;



import java.util.*;

public class Dice extends Die {
    private int numberDice;
    public int rounds = 1;
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

        public void reRoll(int numberOfDice) {
            Die die= dice.get(numberOfDice);
            die.roll();
        }

    public void displayScore() {
       for (int j = 0; j < 5; j++) {
           System.out.print(dice.get(j).getValue() + " ");
       }
           System.out.println("Round " + rounds);
    }

    public void userInteraction() {
        while (rounds < 4) {
            System.out.println("Input the dice you would like to reroll");
            String input = scan.nextLine();
            String[] numArray = input.split(" ");
            rounds++;
            for (String number : numArray) {
                int choices = Integer.parseInt(number);
                reRoll(choices);
                displayScore();
                System.out.println(rounds);
            }
            reset();
        }
    }

    public void reset() {
        System.out.println("Would you like to try again? yes or no?");
        String input = scan.nextLine();
        if(input == "yes") {
            rounds = 1;
        }
    }

    public void beginGame() {
        assignValue();
        userInteraction();

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


