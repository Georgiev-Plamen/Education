package BasicSyntax;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;


        for (int j = 1; j <= 100 ; j++) {
            if (count == num)  {
                break;
            } else {
                if (j % 2 != 0) {
                    System.out.println(j);
                    sum += j;
                    count++;
                }
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
