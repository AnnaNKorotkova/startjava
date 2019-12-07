package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private int a;
    private int b;
    private String mathOperation;

    public void setA(int a) {
        this.a = a;
    }

    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }    

    public void setB(int b) {
        this.b = b;
    }

    public int calculate() {
        switch (mathOperation) {
            case "+":
                return a + b;
            case "-":
                return subtractExact(a, b);
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "^":
                return (int) pow(a, b);
            case "%":
                return a % b;
            case "hypot":
                return (int) hypot(a, b);
            case "min":
                return min(a, b);
            default:
                System.out.println("Невозможно распознать действие");
                return 0;
        }
    }
}