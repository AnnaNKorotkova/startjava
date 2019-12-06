package com.startjava.lesson_2_3.game;

public class Player {

    private String name;
    private int[] tryNumbers;

    Player(String name, int[] tryNumbers) {
        this.name = name;
        this.tryNumbers = tryNumbers;
    }

    public int[] getTryNumbers() {
        return tryNumbers;
    }

    public void setTryNumbers(int[] tryNumbers) {
        this.tryNumbers = tryNumbers;
    }

    public String getName() {
        return name;
    }

}