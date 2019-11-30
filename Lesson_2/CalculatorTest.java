import java.util.*;

public class CalculatorTest {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "";

        do {
            System.out.print("Введите первое число: ");
            calc.a = scanner.nextInt();
            System.out.print("Введите операцию: ");
            calc.mathOperation = scanner.next();
            System.out.print("Введите второе число: ");
            calc.b = scanner.nextInt();

            System.out.println("Результат операции: " + calc.calculate(calc.a, calc.mathOperation, calc.b));

            do {
                System.out.print("Хотите продолжить? [Да/Нет]: ");
                answer = scanner.next().trim().toLowerCase();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}