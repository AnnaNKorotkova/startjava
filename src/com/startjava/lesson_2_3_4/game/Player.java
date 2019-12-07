package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] tryNumber = new int[10];

    Player(String name) {
        this.name = name;
    }

    public int[] getTryNumber() {
        return tryNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void pushNumber(int indexArray) {
        tryNumber[indexArray] = number;
    }

    public void clear(int indexArray) {
        Arrays.fill(tryNumber, 0, indexArray, 0);
    }
}