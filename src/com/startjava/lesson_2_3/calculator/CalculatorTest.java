package com.startjava.lesson_2_3.calculator;

import java.util.*;

public class CalculatorTest {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String[] mathExpression = new String[3];
        String answer = "";

        do {
            System.out.print("Введите математическое выражение через пробел: ");
            mathExpression = (scanner.nextLine()).trim().split(" ");
            calc.setA(Integer.parseInt(mathExpression[0]));
            calc.setMathOperation(mathExpression[1]);
            calc.setB(Integer.parseInt(mathExpression[2]));
            System.out.println("Результат операции: " + calc.calculate());

            do {
                System.out.print("Хотите продолжить? [Да/Нет]: ");
                answer = scanner.nextLine().trim().toLowerCase();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}