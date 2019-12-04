package com.startjava.lesson_2_3.game;

import java.util.*;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);

    private Player playerOne;
    private Player playerTwo;
    private int secretNumber;

    GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        boolean result = false;
        secretNumber = (int)(Math.random() * 101);

        do {
            System.out.print(playerOne.getName() + ", введите число: ");
            playerOne.setNumber(scan.nextInt());
            result = checkNumber(playerOne.getNumber());
            if (result) {
                break;
            }
            System.out.print(playerTwo.getName() + ", введите число: ");
            playerTwo.setNumber(scan.nextInt());
            result = checkNumber(playerTwo.getNumber());
            if (result) {
                break;
            }
        } while (!result);
    }

    private boolean checkNumber(int currentNumber) {
        if (currentNumber > secretNumber) {
            System.out.println ("Введенное вами число больше загаданого компьютером");
            return false;
        } else if (currentNumber < secretNumber) {
            System.out.println ("Введенное вами число меньше загаданого компьютером");
            return false;
        } else {
            System.out.println ("Вы угадали!");
            return true;
        }
    }
}