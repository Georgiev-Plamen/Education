package FirstStepsInCoding.Lesson5.Exersice;

import java.io.PrintStream;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int coinsCount = 0;
        double restDouble = change * 100.0;
        int rest = (int)restDouble;

        while (!(rest <= 0)) {
            if (rest >= 200) {
               rest = rest - 200;
               coinsCount++;
            } else if (rest >= 100) {
                rest -= 100;
                coinsCount++;
            } else if (rest >= 50) {
                rest -= 50;
                coinsCount++;
            } else if (rest >= 20) {
                rest -= 20;
                coinsCount++;
            } else if (rest >= 10) {
                rest -= 10;
                coinsCount++;
            } else if ( rest >= 5) {
                rest -= 5;
                coinsCount++;
            } else if (rest >= 2 ) {
                rest -= 2;
                coinsCount++;
            } else if (rest >= 1) {
                rest -= 1;
                coinsCount++;
            }
        }

        System.out.printf("%d", coinsCount);

    }
}
