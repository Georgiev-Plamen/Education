package FirstStepsInCoding.Extra4;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = Integer.parseInt(scanner.nextLine());
        int water = 20;
        int internet = 15;
        double electricity = 0.0;
        double total = 0.0;

        for (int i = 1; i <= month ; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            electricity += input ;
        }

        double other = electricity + (water * month) + (internet * month) + (electricity + (water * month) + (internet * month)) * 0.2;
        total = electricity + (water * month) + (internet * month) + other;

        //Electricity: 447.16 lv
        System.out.printf("Electricity: %.2f lv%n", electricity);
        //Water: 100.00 lv
        System.out.printf("Water: %.2f lv%n",1.0 * water * month);
        //Internet: 75.00 lv
        System.out.printf("Internet: %.2f lv%n", 1.0 * internet * month);
        //Other: 746.59 lv
        System.out.printf("Other: %.2f lv%n", other);
        //Average: 273.75 lv
        System.out.printf("Average: %.2f lv",total / month );
    }
}
