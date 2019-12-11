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
        secretNumber = (int) (Math.random() * 101);

        for (int i = 0; i < 10; i++) {
            if (makeMove(playerOne, i)) {
                showNumbers(playerTwo, playerTwo.getCount());
                playerOne.clear(playerOne.getCount());
                playerTwo.clear(playerTwo.getCount());
                break;
            }
            if (i == 9) {
                System.out.println("Игрок, " + playerOne.getName() + ", у вас закончились попытки");
            }
            if (makeMove(playerTwo, i)) {
                showNumbers(playerOne, playerOne.getCount());
                playerOne.clear(playerOne.getCount());
                playerTwo.clear(playerTwo.getCount());
                break;
            }
            if (i == 9) {
                System.out.println("Игрок, " + playerTwo.getName() + ", у вас закончились попытки");
            }
        }
    }

    private boolean makeMove(Player player, int index) {
        enterNumber(player, index);
        player.setCount(index + 1);
        return checkNumber(player, index);
    }

    private void enterNumber(Player player, int index) {
        System.out.print(player.getName() + ", введите число: ");
        player.addNumber(scan.nextInt(), index);
    }

    private boolean checkNumber(Player player, int index) {
        int currentNumber = player.getTryNumber()[index];
        if (currentNumber != secretNumber) {
            if (currentNumber > secretNumber) {
                System.out.println("Введенное вами число больше загаданого компьютером");
            } else {
                System.out.println("Введенное вами число меньше загаданого компьютером");
            }
            return false;
        } else {
            System.out.println("Вы угадали!");
            showNumbers(player, player.getCount());
            System.out.println("Игрок " + player.getName() + " угадал число "
                    + secretNumber + " с " + (player.getCount()) + "-й попытки");
            return true;
        }
    }

    private void showNumbers(Player player, int index) {
        int[] numbers;
        numbers = Arrays.copyOf(player.getTryNumber(), index);
        System.out.print("Попытки игрока " + player.getName() + ":  ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}