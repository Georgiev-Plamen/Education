package BasicSyntax;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();
        int sum = 0;
        int result = 1;
        int strongNum = 0;

        for (int i = 0; i < num.length() ; i++) {
            char digit = num.charAt(i);
            sum = Integer.parseInt(String.valueOf(digit));
            if (sum != 0) {
                for (int j = 1; j <= sum; j++) {
                    result = (result) * j;
                }
            }
//            } else {
//                result = 0;
//            }
            strongNum += result;
            result = 1;
        }
        if (strongNum == Integer.parseInt(String.valueOf(num))) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
