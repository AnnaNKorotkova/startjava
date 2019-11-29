import java.util.*;

public class CalculatorTest {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.print("Введите первое число: ");
        calc.a = scanner.nextInt();
        System.out.print("Введите операцию: ");
        calc.mathOperation = scanner.next();
        System.out.print("Введите второе число: ");
        calc.b = scanner.nextInt();

        System.out.println("Результат опрерации: " + calc.resultOperation(calc.a, calc.mathOperation, calc.b));
    }
}