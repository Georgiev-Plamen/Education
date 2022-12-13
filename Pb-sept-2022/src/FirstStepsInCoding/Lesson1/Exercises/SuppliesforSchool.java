package FirstStepsInCoding.Lesson1.Exercises;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)

        //•	Брой пакети химикали - цяло число в интервала [0...100]
        //•	Брой пакети маркери - цяло число в интервала [0...100]
        //•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        //•	Процент намаление - цяло число в интервала [0...100]

        Integer pens = Integer.parseInt(scanner.nextLine());
        Integer markers = Integer.parseInt(scanner.nextLine());
        Integer liters = Integer.parseInt(scanner.nextLine());
        Integer discount = Integer.parseInt(scanner.nextLine());

        Double sumPens = pens * 5.80;
        Double sumMarkers = markers * 7.20;
        Double sumLiter = liters * 1.2;
        Double percent = discount / 100.0;

        Double result = (sumPens + sumMarkers + sumLiter);
        Double total = result - (result * percent);

        System.out.println(total);
    }
}
