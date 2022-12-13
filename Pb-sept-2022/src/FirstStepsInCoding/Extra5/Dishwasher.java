package FirstStepsInCoding.Extra5;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergentCount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int dishes = 0;
        int dishesCount = 0;
        int potsCount = 0;
        int detergent = detergentCount * 750;
        int count = 1;
        int count3 = 0;

        while (!input.equals("End")) {
        dishes = Integer.parseInt(input);
            if (detergent >= 0) {
                if (count == count3 + 3) {
                    count3 = count;
                    detergent -= dishes * 15;
                    potsCount += dishes;
                } else {
                    detergent -= dishes * 5;
                    dishesCount += dishes;
                }
            } else {
                break;
            }

            if(detergent >= 0) {
                input = scanner.nextLine();
                count++;
            } else {
                break;
            }

        }

        if (detergent >= 0) {
            System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %d ml.",
                    dishesCount, potsCount, detergent);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
        }
    }
}
