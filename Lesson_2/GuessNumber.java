import java.util.*;

public class GuessNumber {

    Player playerOne;
    Player playerTwo;
    int secretNumber;

    GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    Scanner scan = new Scanner(System.in);

    public String chekNumber(int currentNumber) {
        if (currentNumber > secretNumber) {
            System.out.println ("Введенное вами число больше загаданого компьютером");
            return "больше";
        } else if (currentNumber < secretNumber) {
            System.out.println ("Введенное вами число меньше загаданого компьютером");
            return "меньше";
        } else {
            System.out.println ("Вы угадали!");
            return "равно";
        }
    }

    public void play() {
        String answer = "";
        String result = "";

        do {
            secretNumber = (int)(Math.random() * 101);
            do {
                System.out.print(playerOne.name + ", введите число: ");
                playerOne.setNumber(scan.nextInt());
                result = chekNumber(playerOne.getNumber());
                if (result.equals("равно")) {
                    break;
                }
               System.out.print(playerTwo.name + ", введите число: ");
                playerTwo.setNumber(scan.nextInt());
                result = chekNumber(playerTwo.getNumber());
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