package FirstStepsInCoding.Lesson1.Exercises;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double radians = Double.parseDouble(scanner.nextLine());
        Double degries = radians * 180/ Math.PI;

        System.out.println(degries);

    }
}
