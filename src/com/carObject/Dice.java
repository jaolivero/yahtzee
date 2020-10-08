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
        assignValue();
    }

    private void assignValue() {
        for(int i = 0; i < 5; i++){
            dice.add(new Die());
            dice.get(i).roll();
            System.out.print(getDieValue(i) + " ");
        }
        rounds++;
        System.out.println("Round " + rounds);
        System.out.println();
        System.out.println(dice);
        }

    public void userInteraction() {
        do {
            System.out.println("Would you like to reroll the first dice?");
            String response = scan.nextLine();
            if(response == "yes") {
                dice.set(1, new Die());
                dieList.set(0, getDieValue(0));
            }
            System.out.println(dieList);
            System.out.println(Die.getValue());
            System.out.println("Which specific dice would you like to reroll?");
            int specificDie = scan.nextInt();
            dice.set(specificDie, new Die());
            System.out.println(dice);

            // Access array[index], make it equal to random.

            System.out.println("Reroll multiple dice");
            int multipleDice = scan.nextInt();


            //break
        } while(true);
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


