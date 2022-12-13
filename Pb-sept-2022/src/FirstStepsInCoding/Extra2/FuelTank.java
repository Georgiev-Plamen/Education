package FirstStepsInCoding.Extra2;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine(); // "Diesel", "Gasoline" или "Gas"
        Integer volume = Integer.parseInt(scanner.nextLine()); // volume in tank

        if (volume >= 25)  {
            if ( fuel.equals("Gasoline")) {
                System.out.println("You have enough gasoline.");
            } else if ( fuel.equals("Diesel")) {
                System.out.println("You have enough diesel.");
            } else if ( fuel.equals("Gas")) {
                System.out.println("You have enough gas.");
            } else {
                System.out.println("Invalid fuel!");
            }
        } else if ( volume < 25 ) {
            if ( fuel.equals("Gasoline") ) {
                System.out.println("Fill your tank with gasoline!");
            } else if ( fuel.equals("Diesel")) {
                System.out.println("Fill your tank with diesel!");
            } else if ( fuel.equals("Gas")) {
                System.out.println("Fill your tank with gas!");
            } else {
                System.out.println("Invalid fuel!");
            }

        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
