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
                showNumbers(playerTwo, i);
                playerOne.clear(i + 1);
                playerTwo.clear(i);
                break;
            }
            if (i == 9) {
                System.out.println("Игрок, " + playerOne.getName() + ", у вас закончились попытки");
            }
            if (makeMove(playerTwo, i)) {
                showNumbers(playerOne, i + 1);
                playerTwo.clear(i + 1);
                playerOne.clear(i + 1);
                break;
            }
            if (i == 9) {
                System.out.println("Игрок, " + playerTwo.getName() + ", у вас закончились попытки");
            }
        }
    }

    private boolean makeMove(Player player, int index) {
        enterNumber(player, index);
        return checkNumber(player.getTryNumber()[index], player, index);
    }

    private void enterNumber(Player player, int index) {
        System.out.print(player.getName() + ", введите число: ");
        player.addNumber(scan.nextInt(), index);
    }

    private boolean checkNumber(int currentNumber, Player player, int index) {
        if (currentNumber != secretNumber) {
            if (currentNumber > secretNumber) {
                System.out.println("Введенное вами число больше загаданого компьютером");
            } else {
                System.out.println("Введенное вами число меньше загаданого компьютером");
            }
            return false;
        } else {
            System.out.println("Вы угадали!");
            showNumbers(player, index + 1);
            System.out.println("Игрок " + player.getName() + " угадал число "
                    + secretNumber + " с " + (index + 1) + " попытки");

            return true;
        }
    }

    private void showNumbers(Player player, int index) {
        int[] numbers;
        StringBuilder sb = new StringBuilder(100);
        numbers = Arrays.copyOf(player.getTryNumber(), index);
        for (int num : numbers) {
            sb.append(num + " ");
        }
        System.out.println("Попытки игрока " + player.getName() + ": " + sb);
    }
}