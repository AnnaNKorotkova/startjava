public class MyFirstGame {
    public static void main(String[] arg) { 
        int secret = 68;
        int userInput = 50;
        if (userInput == secret) {
            System.out.println("Вы угадали!");
        } else if (userInput > secret) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        }
    }
}