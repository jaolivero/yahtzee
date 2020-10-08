package com.carObject;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static Scanner scan = new Scanner(System.in);
    boolean runAgain = true;
    public int rounds = 0;
    boolean rolledYahtzee = false;



    public static void userInput() {
        System.out.println("Input the dice you would like to reroll");
        String input = scan.nextLine();
        System.out.println(input);

    }
//    while(runAgain) {
//        while(!rolledYahtzee) {
//        rounds++;
////        Score = checkForYahtzee(dice);
//        }
//    }

    public static boolean checkForYahtzee(Die[] dieArray) {
        for(int i = 0; i < dieArray.length; i++) {
            for(int j = i+1; j < dieArray.length; j++) {
                if(dieArray[i].getValue() != dieArray[j].getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

}
