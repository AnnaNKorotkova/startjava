import java.util.*;

public class GuessNumberTest {  

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.nextLine());
        GuessNumber number = new GuessNumber();

        String answer = "";
        String result = "";

        do {
            do {
                System.out.print(playerOne.name + ", введите число: ");
                playerOne.setNumber(scan.nextInt());
                result = number.chekNumber(playerOne.getNumber());
                if (result.equals("равно")) {
                    break;
                }
                System.out.print(playerTwo.name + ", введите число: ");
                playerTwo.setNumber(scan.nextInt());
                result = number.chekNumber(playerTwo.getNumber());
                if (result.equals("равно")) {
                    break;
                } 
            } while (!result.equals("равно"));
            do {
                    System.out.print("Хотите продолжить? [Да/Нет]: ");
                    answer = scan.next().trim().toLowerCase();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    } 
}