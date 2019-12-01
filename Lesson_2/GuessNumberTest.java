import java.util.*;

public class GuessNumberTest {  

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.nextLine());
        GuessNumber number = new GuessNumber(playerOne, playerTwo);

        number.play();
    } 
}