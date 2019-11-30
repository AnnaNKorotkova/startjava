public class GuessNumber {

	int secretNumber = (int)(Math.random()*10);
	//int currentNumber;

	public boolean chekNumber(int currentNumber) {
		if (currentNumber > secretNumber) {
			System.out.println ("Введенное вами число больше загаданого компьютером");
			return false;
		} else if (currentNumber < secretNumber) {
			System.out.println ("Введенное вами число меньше загаданого компьютером");
			return false;
		} else {
			System.out.println ("Вы угадали!");
			return true;
		}
	}
}