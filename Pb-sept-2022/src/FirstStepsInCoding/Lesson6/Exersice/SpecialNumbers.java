package FirstStepsInCoding.Lesson6.Exersice;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        boolean findDigit = false;

        // Да пробвам да разделя циклите - да се правят многото цикли за осново, а вътре в числото само 4

        for (int i = 1111; i <= 9999; i++) {

            for (int j = 0; j < 4 ; j++) {
               char firstDigit = String.valueOf(i).charAt(j);
               int firstDigitIn = firstDigit - '0';
               if ( firstDigitIn != 0) {
                   if (digit % firstDigitIn == 0) {
                       findDigit = true;
                   } else {
                       findDigit = false;
                       break;
                   }
               } else {
                   findDigit = false;
                   break;
               }
            }
            if (findDigit) {
                System.out.printf("%d ",i);
            }
        }

    }
}
