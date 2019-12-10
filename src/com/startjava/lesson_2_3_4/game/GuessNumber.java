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
            enterNumber(playerOne, i);
            result = checkNumber(playerOne.getTryNumber()[i]);
            if (result) {
                showNumber(playerOne, i + 1);
                showNumber(playerTwo, i);
                System.out.println("Игрок " + playerOne.getName() + " угадал число "
                        + secretNumber + " с " + (i + 1) + " попытки");
                playerOne.clear(i + 1);
                playerTwo.clear(i);
                break;
            }
            if (i == 9) {
                System.out.println("Игрок, " + playerOne.getName() + ", у вас закончились попытки");
            }
            enterNumber(playerTwo, i);
            result = checkNumber(playerTwo.getTryNumber()[i]);
            if (result) {
                showNumber(playerOne, i + 1);
                showNumber(playerTwo, i + 1);
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
        if (currentNumber != secretNumber) {
            if (currentNumber > secretNumber) {
                System.out.println("Введенное вами число больше загаданого компьютером");
            } else {
                System.out.println("Введенное вами число меньше загаданого компьютером");
            }
            return false;
        } else {
            System.out.println("Вы угадали!");
            return true;
        }
    }

    private void showNumber(Player player, int index) {
        int[] arr;
        StringBuilder s = new StringBuilder(110);
        arr = Arrays.copyOf(player.getTryNumber(), index);
        for (int num : arr
        ) {
            s.append(num + " ");
        }
        System.out.println(s);
    }

    private void enterNumber(Player player, int index) {
        System.out.print(player.getName() + ", введите число: ");
        player.addNumber(scan.nextInt(), index);
    }
}