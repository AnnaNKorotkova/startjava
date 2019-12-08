package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
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

    public void addNumber(int number, int index) {
        tryNumber[index] = number;
    }

    public void clear(int index) {
        Arrays.fill(tryNumber, 0, index, 0);
    }
}