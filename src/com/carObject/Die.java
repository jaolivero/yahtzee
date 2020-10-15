package com.carObject;

import java.util.Random;

public class Die {

    private int value;
    private int sides;

    public Die()
    {
        sides = 6;
    }

    public Die(int sides, int value)
    {
        this.sides = sides;
        this.value = value;
    }


        public int roll()
    {
        Random random = new Random();
        value = random.nextInt(sides) + 1;
        return value;
    }

    public int getNumSides() {
        return sides;
    }

    public int getValue() {
        return this.value;
    }
}
