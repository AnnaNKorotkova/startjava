package com.startjava.lesson_2_3.calculator;

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
                return a - b;
            case "*":
               return a * b;
            case "/":
                return a / b;
            case "^":
                int c = 1;
                for (int i = 1; i <= b; i++) {
                    c *= a;
                }
                return c;
            case "%":
                return a % b;
            default:
                System.out.println("Невозможно распознать действие");
                return 0;
        }
    }
}