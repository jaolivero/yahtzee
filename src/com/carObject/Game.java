package com.carObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private static Scanner scan = new Scanner(System.in);
    boolean runAgain = true;
    boolean rolledYahtzee = false;

//    while(
//runAgain) {
//        while(!rolledYahtzee) {
//        rounds++;
////        Score = checkForYahtzee(dice);
//        }
//    }

    public static boolean checkForYahtzee(ArrayList<Integer> dieList) {
        for(int i = 0; i < dieList.size(); i++) {
            for(int j = i+1; j < dieList.size(); j++) {
                if(dieList.get(i) != dieList.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }

}
