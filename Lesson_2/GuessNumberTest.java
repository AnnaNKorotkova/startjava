import java.util.*;

public class GuessNumberTest {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String answer = "";

        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.nextLine());
        GuessNumber number = new GuessNumber(playerOne, playerTwo);

        do {
            number.play();
            do {
                System.out.print("Хотите продолжить? [Да/Нет]: ");
                answer = scan.next().trim().toLowerCase();
            } while (!"да".equals(answer) && !"нет".equals(answer));
        } while ("да".equals(answer));
    }
}