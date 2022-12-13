import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double meal_cost = Double.parseDouble(scanner.nextLine());
        int tip_percent = Integer.parseInt(scanner.nextLine());
        int tax_percent = Integer.parseInt(scanner.nextLine());

        double tip = meal_cost /100.0 * tip_percent ;
        double tax = meal_cost / 100.0 * tax_percent ;
        double total = meal_cost + tip + tax;

        System.out.printf("%.0f",total);
    }
}
