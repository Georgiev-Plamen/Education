package FirstStepsInCoding.Extra7;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.print('+');
        for (int j = 0; j < num - 2; j++) {
            System.out.print(" -");
        }
        System.out.println(" +");

        for (int i = 0; i < num - 2; i++) {
            System.out.print('|');
            for (int j = 0; j < num - 2; j++) {
                System.out.print(" -");
            }
            System.out.println(" |");
        }

        System.out.print('+');
        for (int j = 0; j < num - 2; j++) {
            System.out.print(" -");
        }
        System.out.println(" +");
    }
}
