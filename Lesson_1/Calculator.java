public class Calculator {
	public static void main(String[] arg) {
	
		//	syntax a act b = c, где a и b - целые положительные числа, act - математическое действие
		int a = 67; int b = 18; String act = "+";
		if (act == "+") System.out.println(a + b);
		else if (act == "-") System.out.println(a - b);
		else if (act == "*") System.out.println(a * b);
		else if (act == "/") System.out.println(a / b);
		else if (act == "%") System.out.println(a % b);
		else if (act == "^") {
			int c = 1;
			for (int i = 1; i <= b; i++) c *= a;
			System.out.println(c);
		}
		else System.out.println("Невозможно распознать действие");

		a = 36; b = 518; act = "-";
		if (act == "+") System.out.println(a + b);
		else if (act == "-") System.out.println(a - b);
		else if (act == "*") System.out.println(a * b);
		else if (act == "/") System.out.println(a / b);
		else if (act == "%") System.out.println(a % b);
		else if (act == "^") {
			int c = 1;
			for (int i = 1; i <= b; i++) c *= a;
			System.out.println(c);
		}
		else System.out.println("Невозможно распознать действие");

		a = 16; b = 5; act = "*";
		if (act == "+") System.out.println(a + b);
		else if (act == "-") System.out.println(a - b);
		else if (act == "*") System.out.println(a * b);
		else if (act == "/") System.out.println(a / b);
		else if (act == "%") System.out.println(a % b);
		else if (act == "^") {
			int c = 1;
			for (int i = 1; i <= b; i++) c *= a;
			System.out.println(c);
		}
		else System.out.println("Невозможно распознать действие");

		a = 156; b = 51; act = "/";
		if (act == "+") System.out.println(a + b);
		else if (act == "-") System.out.println(a - b);
		else if (act == "*") System.out.println(a * b);
		else if (act == "/") System.out.println(a / b);
		else if (act == "%") System.out.println(a % b);
		else if (act == "^") {
			int c = 1;
			for (int i = 1; i <= b; i++) c *= a;
			System.out.println(c);
		}
		else System.out.println("Невозможно распознать действие");

		a = 21; b = 20; act = "%";
		if (act == "+") System.out.println(a + b);
		else if (act == "-") System.out.println(a - b);
		else if (act == "*") System.out.println(a * b);
		else if (act == "/") System.out.println(a / b);
		else if (act == "%") System.out.println(a % b);
		else if (act == "^") {
			int c = 1;
			for (int i = 1; i <= b; i++) c *= a;
			System.out.println(c);
		}
		else System.out.println("Невозможно распознать действие");

		a = 2; b = 16; act = "^";
		if (act == "+") System.out.println(a + b);
		else if (act == "-") System.out.println(a - b);
		else if (act == "*") System.out.println(a * b);
		else if (act == "/") System.out.println(a / b);
		else if (act == "%") System.out.println(a % b);
		else if (act == "^") {
			int c = 1;
			for (int i = 1; i <= b; i++) c *= a;
			System.out.println(c);
		}
		else System.out.println("Невозможно распознать действие");
	}
}