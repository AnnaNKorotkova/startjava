public class Cycle {
    public static void main(String[] arg) {
        int j = -6;
        int sum = 0;

        for (int i = 0; i < 21 ; i++) {
            System.out.print(i + " ");
        }

        while (j <= 6) {
            System.out.print(j + " ");
            j += 2;
        }

        j = 11;
        do {
            if (j % 2 != 0) {
                sum += j;
            }
            j++;
        } while (j < 21);
        System.out.print(sum);
    }
}