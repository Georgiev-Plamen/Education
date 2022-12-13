package FirstStepsInCoding.Lesson2.Lab;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer digit = Integer.parseInt(scanner.nextLine());

        if ( digit % 2 == 0){
            System.out.println("even");
        } else {
            System.out.print("odd");
        }
    }
}
