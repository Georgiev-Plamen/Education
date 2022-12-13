package FirstStepsInCoding.Lesson6.Lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stages = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        int apartment = 0;
        int office = 0;
        boolean isApartment = false;
        boolean isOffice = false;

        for (int i = stages; i >= 1; i--) {

                for (int j = 0; j < rooms; j++) {
                    if (i == stages) {
                        System.out.printf("L%d%d ", i, j);
                        continue;
                    }
                    if (i % 2 == 0) {
                        System.out.printf("O%d%d ", i, j);
                    } else {
                         System.out.printf("A%d%d ", i, j);
                    }
                }
            System.out.printf("%n");
        }

    }
}
