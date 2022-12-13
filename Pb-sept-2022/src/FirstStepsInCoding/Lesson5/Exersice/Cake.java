package FirstStepsInCoding.Lesson5.Exersice;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int totalPeaces = width * length;
        int peaces = 0;
        int restPeaces = 0;
        String input = scanner.nextLine();

        while (!(input.equals("STOP"))){
            peaces = Integer.parseInt(input);
            restPeaces += peaces;
            if (totalPeaces <= restPeaces) {
                break;
            }
            input = scanner.nextLine();
        }

        if (totalPeaces > restPeaces) {
            System.out.printf("%d pieces are left.", totalPeaces - restPeaces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPeaces - restPeaces));
        }


    }
}
