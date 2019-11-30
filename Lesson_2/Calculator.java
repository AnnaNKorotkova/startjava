public class Calculator {
    int a;
    int b;
    String mathOperation;

    public int calculate(int a, String mathOperation, int b) {
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