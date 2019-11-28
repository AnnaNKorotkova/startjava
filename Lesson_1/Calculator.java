public class Calculator {
    public static void main(String[] arg) {
        int a = 67;
        int b = 18;
        String act = "+";

        if (act == "+") {
            System.out.println(a + b);
        } else if (act == "-") {
            System.out.println(a - b);
        } else if (act == "*") {
            System.out.println(a * b);
        } else if (act == "/") {
            System.out.println(a / b);
        } else if (act == "%") {
            System.out.println(a % b);
        } else if (act == "^") {
            int c = 1;
            for (int i = 1; i <= b; i++) {
                c *= a;
            }
            System.out.println(c);
        } else {
            System.out.println("Невозможно распознать действие");
        }
    }
}