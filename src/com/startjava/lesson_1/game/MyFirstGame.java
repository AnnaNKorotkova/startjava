package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] arg) {
        int secretNamber = 59;
        int playerNamber = 50;
        int delta = 100 - playerNamber;

        while (playerNamber != secretNamber) {
            if (playerNamber > secretNamber) {
                System.out.println("Введенное вами число: " + playerNamber + " больше того, что загадал компьютер");
                playerNamber /= 2;
            } else {
                System.out.println("Введенное вами число: " + playerNamber + " меньше того, что загадал компьютер");
                if (delta > 1) {
                    delta /= 2;
                } else {
                    delta = 1;
                }
                playerNamber += delta;
            }
        }
        System.out.println("Вы угадали!");
    }
}