import java.util.*;

public class GuessNumberTest {  

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.nextLine());

        GuessNumber number = new GuessNumber();

        int currentPlayerOneNumber;
        int currentPlayerTwoNumber;
        String resultOne;
        String resultTwo;
        String answer = "";

        do {    
            do {
                System.out.print(playerOne.name + ", введите число: ");
                currentPlayerOneNumber = scan.nextInt();
                resultOne = number.chekNumber(currentPlayerOneNumber);
                if (resultOne.equals("равно")) {
                    break;
                }
                System.out.print(playerTwo.name + ", введите число: ");
                currentPlayerTwoNumber = scan.nextInt();
                resultTwo = number.chekNumber(currentPlayerTwoNumber);
                if (resultTwo.equals("равно")) {
                    break;
                }
            } while (!resultOne.equals("равно") && !resultTwo.equals("равно"));
            do {
                System.out.print("Хотите продолжить? [Да/Нет]: ");
                answer = scan.next().trim().toLowerCase();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}