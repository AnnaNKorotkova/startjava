package com.startjava.lesson_2_3.game;

public class Player {

    private String name;
    private int number;

    Player(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}