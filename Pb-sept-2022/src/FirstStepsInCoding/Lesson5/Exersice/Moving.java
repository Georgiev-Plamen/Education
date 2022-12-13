package FirstStepsInCoding.Lesson5.Exersice;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int totalFreeSpace = width * length * height;
        int totalBox = 0;
        String input = scanner.nextLine();
        int box = 0;

        while (!(input.equals("Done"))) {
            box = Integer.parseInt(input);
            totalBox += box;
            if ( totalBox >= totalFreeSpace) {
                break;
            }
            input = scanner.nextLine();

        }
        if (input.equals("Done")) {
            System.out.printf("%d Cubic meters left.",totalFreeSpace - totalBox );
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.",totalBox - totalFreeSpace);
        }


    }
}
