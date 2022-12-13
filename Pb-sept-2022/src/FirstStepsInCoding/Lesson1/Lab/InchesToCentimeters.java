package FirstStepsInCoding.Lesson1.Lab;

import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double digit = Double.parseDouble(scanner.nextLine());
        //умножете инчовете по 2.54 (1 инч = 2.54 сантиметра).
        Double result = digit * 2.54;

        System.out.println( result );

    }
}
