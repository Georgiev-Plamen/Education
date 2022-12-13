package FirstStepsInCoding.Lesson2.Exercise;

import java.util.Scanner;

import static java.lang.System.*;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer timeFirst = Integer.parseInt(scanner.nextLine());
        Integer timeSecond = Integer.parseInt(scanner.nextLine());
        Integer timeThird = Integer.parseInt(scanner.nextLine());

        int total = timeFirst + timeSecond + timeThird;

        int totalMinute = total / 60;
        int totalSeconds = total % 60;

        if (totalSeconds < 10) {
            System.out.printf("%d:0%d", totalMinute, totalSeconds);
        } else {
            System.out.printf("%d:%d", totalMinute, totalSeconds);
        }


    }
}
