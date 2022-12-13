package BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int result = 0;

        if (secondNum <= 10) {
            for (int i = secondNum; i <= 10; i++) {

                result = num * secondNum;
                secondNum++;
                System.out.printf("%d X %d = %d%n", num, i, result);
            }
        } else {
            result = num * secondNum;
            System.out.printf("%d X %d = %d%n", num, secondNum, result);
        }
    }
}
