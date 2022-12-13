package FirstStepsInCoding.Lesson2.Lab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer result = Integer.parseInt(scanner.nextLine());

        if(result >= 5){
            System.out.println("Excellent!");
        }

    }
}
