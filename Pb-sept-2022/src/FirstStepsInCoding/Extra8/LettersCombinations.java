package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        char skip = scanner.nextLine().charAt(0);

        int count = 0;
        char[] combinationArray = new char[4];
        combinationArray[3] = ' ';

        for (char i = start; i <= end; i++) {
            if (i == skip) {
                continue;
            }
            combinationArray[0] = i;
            for (char j = start; j <= end; j++) {
                if (j == skip) {
                    continue;
                }
                combinationArray[1] = j;
                for (char k = start; k <= end; k++) {
                    if (k == skip) {
                        continue;
                    } else {
                        combinationArray[2] = k;
                        System.out.print(combinationArray);
                        count++;
                    }

                }
            }
        }
        System.out.print(count);
    }
}