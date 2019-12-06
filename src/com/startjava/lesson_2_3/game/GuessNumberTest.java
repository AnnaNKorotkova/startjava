package com.startjava.lesson_2_3.game;

import java.util.*;

public class GuessNumberTest {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        int[] tryNumbersOne = new int[10];
        int[] tryNumbersTwo = new int[10];

        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.nextLine(), tryNumbersOne);
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.nextLine(), tryNumbersTwo);
        GuessNumber number = new GuessNumber(playerOne, playerTwo);

        do {
            number.play();
            do {
                System.out.print("Хотите продолжить? [Да/Нет]: ");
                answer = scan.next().trim().toLowerCase();
            } while (!"да".equals(answer) && !"нет".equals(answer));
        } while ("да".equals(answer));
    }
}