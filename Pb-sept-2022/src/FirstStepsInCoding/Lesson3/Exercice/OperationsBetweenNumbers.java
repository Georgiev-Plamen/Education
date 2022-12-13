package FirstStepsInCoding.Lesson3.Exercice;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int digitTwo = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        Integer result = 0;
        String evenOdd = "";

        switch (operation) {
            case "+" :
                result = digit + digitTwo ;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d + %d = %d - %s", digit, digitTwo, result, evenOdd);
                break;
            case "-" :
                result = digit - digitTwo;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d - %d = %d - %s", digit, digitTwo, result, evenOdd);
                break;
            case "*" :
                result = digit * digitTwo;
                if (result % 2 == 0) {
                    evenOdd = "even";
                } else {
                    evenOdd = "odd";
                }
                System.out.printf("%d * %d = %d - %s", digit, digitTwo, result, evenOdd);
                break;
            case "/" :
                if (digitTwo == 0){
                    System.out.printf("Cannot divide %d by zero", digit);
                } else {
                    double digitD = digit;
                    double digitTwoD = digitTwo;
                    Double result1 = digitD / digitTwoD;
                    System.out.printf("%d / %d = %.2f", digit, digitTwo, result1);
                }
                break;
            case "%":
                if (digitTwo == 0){
                    System.out.printf("Cannot divide %d by zero", digit);
                } else {
                    result = digit % digitTwo;
                    int resultModul = 0;
                    System.out.printf("%d %% %d = %d", digit, digitTwo, result);
                }
                break;
        }



    }
}
