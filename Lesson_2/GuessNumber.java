
public class GuessNumber {

    private int secretNumber = (int)(Math.random() * 10);

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
}