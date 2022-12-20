package LabDataAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        BigDecimal bigDicResult = new BigDecimal(0);

        for (int i = 0; i < count; i++) {

            BigDecimal big = new BigDecimal(scanner.next());
            bigDicResult = bigDicResult.add(big);

        }

        System.out.println(bigDicResult);
    }

}
