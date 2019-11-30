public class GuessNumber {

    int secretNumber = (int)(Math.random() * 101);

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