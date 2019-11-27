public class Cycle {
	public static void main(String[] arg) {

		for (int i = 0; i < 21 ; i++) {
			System.out.print(i + " ");
		}

		int i = -6;
		while (i <= 6) {
			System.out.print(i + " ");
			i += 2;
		}

		i = 11;
		int sum = 0;
		do {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		} while (i < 21);
		System.out.print(sum);
	}
}