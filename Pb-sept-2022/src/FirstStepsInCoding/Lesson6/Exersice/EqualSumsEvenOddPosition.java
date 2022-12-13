package FirstStepsInCoding.Lesson6.Exersice;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String start = scanner.nextLine();
        int startNum = Integer.parseInt(start);
        int parseStartNum = startNum;
        String end = scanner.nextLine();
        int endNum = Integer.parseInt(end);
        int startDigit = 0;
        int endDigit = 0;
        int startSumOdd = 0;
        int startSumEven = 0;

        for (int i = startNum; i <= endNum; i++) {

            for (int j = 0; j < 6; j++) {
                if (j % 2 == 0) {
                    char letter = start.charAt(j);
                    int startDigitOdd = letter - '0';
                    startSumOdd += startDigitOdd;

                } else {
                    char letter = start.charAt(j);
                    int startDigitЕven = letter - '0';
                    startSumEven += startDigitЕven;
                }

            }
            parseStartNum++;
            start = String.valueOf(parseStartNum);
            if (startSumOdd == startSumEven) {
                System.out.printf("%d ", i);

            }
            startSumEven = 0;
            startSumOdd = 0;
        }
    }
}
