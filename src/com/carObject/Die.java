package com.carObject;

import java.util.Random;

public class Die {

    private int sides;
    private int value;

    public Die()
    {
        sides = 6;
        value = 1;
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

    public void setNumSides(int numSides) {
        this.sides = numSides;
    }

    public int getValue() {
        return value;
    }

    public int setValue(int value) {
        return this.value;
    }

}
