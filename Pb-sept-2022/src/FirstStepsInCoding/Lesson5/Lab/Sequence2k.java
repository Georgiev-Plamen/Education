package FirstStepsInCoding.Lesson5.Lab;

import java.util.Scanner;

public class Sequence2k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());
        int count = 0;

        while (true) {
            count = count * 2 + 1;
            if (count <= digit) {
                System.out.println(count);
            } else {
                break;
            }

        }

    }
}
