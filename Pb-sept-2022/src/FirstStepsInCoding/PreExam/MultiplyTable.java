package FirstStepsInCoding.PreExam;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String digit = scanner.nextLine();
        char oneDigitChar = digit.charAt(2);
        int oneDigit = Integer.parseInt(String.valueOf(oneDigitChar));
        char twoDigitChar = digit.charAt(1);
        int twoDigit = Integer.parseInt(String.valueOf(twoDigitChar));
        char threeDigitChar = digit.charAt(0);
        int threeDigit = Integer.parseInt(String.valueOf(threeDigitChar));
        int result = 0;

        for (int i = 1; i <= oneDigit ; i++) {
           for (int j = 1; j <= twoDigit; j++) {
                for (int k = 1; k <= threeDigit ; k++) {
                    result = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n",i, j, k, result);
                }
            }
        }




    }
}
