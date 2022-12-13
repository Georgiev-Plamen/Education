package FirstStepsInCoding.Lesson3.Exercice;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        Integer row = Integer.parseInt(scanner.nextLine());
        Integer columns = Integer.parseInt(scanner.nextLine());

        Double total = 0.0;

        switch (type) {
            case "Premiere":
                total = row * columns * 12.00;
                break;
            case "Normal" :
                total = row * columns * 7.50;
                break;
            case "Discount":
                total = row * columns * 5.00;
                break;
        }

        System.out.printf("%.2f leva", total);



    }

}
