public class MyFirstGame {
    public static void main(String[] arg) {
        int secret = 59;
        int userInput = 50;
        int delta = 100 - userInput;

        while (true) {
            if (userInput == secret) {
                System.out.println("Вы угадали!");
                break;
            } else if (userInput > secret) {
                System.out.println("Введенное вами число: " + userInput + " больше того, что загадал компьютер");
                userInput /= 2;
            } else {
                System.out.println("Введенное вами число: " + userInput + " меньше того, что загадал компьютер");
                if (delta > 1) {
                    delta /= 2;
                } else {
                    delta = 1;
                }
                userInput += delta;
            }
        }
    }
}