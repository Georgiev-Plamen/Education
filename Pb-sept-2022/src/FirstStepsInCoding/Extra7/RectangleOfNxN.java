package FirstStepsInCoding.Extra7;

import java.util.Scanner;

public class RectangleOfNxN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                System.out.print('*');
            }
            System.out.println('*');
        }

    }
}
