package FirstStepsInCoding.Exams;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entryTax = Double.parseDouble(scanner.nextLine());
        double priceLounger = Double.parseDouble(scanner.nextLine());
        double priceUmrella = Double.parseDouble(scanner.nextLine());

        double entrance =  people * entryTax;
        double umbrella = Math.ceil(people / 2.0);
        double totalUmbrella = umbrella * priceUmrella;
        double lounger = Math.ceil(people * 0.75);
        double totalLounger = lounger * priceLounger;
        double total = entrance + totalLounger + totalUmbrella;

        System.out.printf("%.2f lv.", total);


    }
}
