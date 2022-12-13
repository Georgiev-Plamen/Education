package BasicSyntax;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit1 = Integer.parseInt(scanner.nextLine());
        int digit2 = Integer.parseInt(scanner.nextLine());
        int digit3 = Integer.parseInt(scanner.nextLine());

        int[] num = { digit1, digit2, digit3 };

        Arrays.sort(num);
        int numLength = num.length;

        for (int i = numLength - 1; i >= 0 ; i--) {
            System.out.println(num[i]);
        }


    }
}
