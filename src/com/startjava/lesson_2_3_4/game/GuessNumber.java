package com.startjava.lesson_2_3_4.game;

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
        secretNumber = (int) (Math.random() * 101);

        for (int i = 0; i < 10; i++) {
            System.out.print(playerOne.getName() + ", введите число: ");
            playerOne.addNumber(scan.nextInt(), i);
            result = checkNumber(playerOne.getTryNumber()[i]);
            if (result) {
                System.out.println(arrToString(Arrays.copyOf(playerOne.getTryNumber(), i + 1)));
                System.out.println(arrToString(Arrays.copyOf(playerTwo.getTryNumber(), i)));
                System.out.println("Игрок " + playerOne.getName() + " угадал число "
                        + secretNumber + " с " + (i + 1) + " попытки");
                playerOne.clear(i + 1);
                playerTwo.clear(i);
                break;
            }
            if (i == 9) {
                System.out.println("Игрок, " + playerOne.getName() + ", у вас закончились попытки");
            }
            System.out.print(playerTwo.getName() + ", введите число: ");
            playerTwo.addNumber(scan.nextInt(), i);
            result = checkNumber(playerTwo.getTryNumber()[i]);
            if (result) {
                System.out.println(arrToString(Arrays.copyOf(playerOne.getTryNumber(), i + 1)));
                System.out.println(arrToString(Arrays.copyOf(playerTwo.getTryNumber(), i + 1)));
                System.out.println("Игрок " + playerTwo.getName() + " угадал число "
                        + secretNumber + " с " + (i + 1) + " попытки");
                playerTwo.clear(i + 1);
                playerOne.clear(i + 1);
                break;
            }
            if (i == 9) {
                System.out.println("Игрок, " + playerTwo.getName() + ", у вас закончились попытки");
            }
        }
    }

    private boolean checkNumber(int currentNumber) {
        if (currentNumber > secretNumber) {
            System.out.println("Введенное вами число больше загаданого компьютером");
            return false;
        } else if (currentNumber < secretNumber) {
            System.out.println("Введенное вами число меньше загаданого компьютером");
            return false;
        } else {
            System.out.println("Вы угадали!");
            return true;
        }
    }

    private String arrToString(int[] arr) {
        String str = "";
        for (int num : arr
        ) {
            str += num + " ";
        }
        return str.trim();
    }
}