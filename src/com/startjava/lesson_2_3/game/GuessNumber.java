package com.startjava.lesson_2_3.game;

import java.util.*;

public class GuessNumber {

    Scanner scan = new Scanner(System.in);

    private Player playerOne;
    private Player playerTwo;
    private int secretNumber;
    private int[] currentArr;

    GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        boolean result = false;
        secretNumber = (int)(Math.random() * 101);

        for (int i = 0; i < 10; i++) {
            System.out.print(playerOne.getName() + ", введите число: ");
            currentArr = playerOne.getTryNumbers();
            currentArr[i] = scan.nextInt();
            playerOne.setTryNumbers(currentArr);
            result = checkNumber(currentArr[i]);
            if (result) {
                System.out.println(arrToString(Arrays.copyOf(currentArr, i + 1)));
                System.out.println(arrToString(Arrays.copyOf(playerTwo.getTryNumbers(), i)));
                System.out.println("Игрок " + playerOne.getName() + " угадал число "
                        + secretNumber + " с " + (i + 1) + " попытки");
                Arrays.fill(currentArr, 0, i + 1, 0);
                playerOne.setTryNumbers(currentArr);
                Arrays.fill(playerTwo.getTryNumbers(), 0, i, 0);
                playerTwo.setTryNumbers(playerTwo.getTryNumbers());
                break;
            }
            if (i == 9) {
                System.out.println("Игрок, " + playerOne.getName() + ", у вас закончились попытки");
            }
            System.out.print(playerTwo.getName() + ", введите число: ");
            currentArr = playerTwo.getTryNumbers();
            currentArr[i] = scan.nextInt();
            playerTwo.setTryNumbers(currentArr);
            result = checkNumber(currentArr[i]);
            if (result) {
                System.out.println(arrToString(Arrays.copyOf(playerOne.getTryNumbers(), i + 1)));
                System.out.println(arrToString(Arrays.copyOf(currentArr, i + 1)));
                System.out.println("Игрок " + playerTwo.getName() + " угадал число "
                        + secretNumber + " с " + (i + 1) + " попытки");
                Arrays.fill(currentArr, 0, i + 1, 0);
                playerOne.setTryNumbers(currentArr);
                Arrays.fill(playerOne.getTryNumbers(), 0, i + 1, 0);
                playerTwo.setTryNumbers(playerOne.getTryNumbers());
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