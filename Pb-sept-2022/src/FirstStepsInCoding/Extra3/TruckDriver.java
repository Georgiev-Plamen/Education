package FirstStepsInCoding.Extra3;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine(); //"Spring", "Summer", "Autumn" или "Winter"
        double km = Double.parseDouble(scanner.nextLine()); // Километри за месец
        double total = 0.0;

        switch (season) {
            case "Spring" :
            case "Autumn" :
                if (km <= 5000) {
                    total = km * 4 * 0.75;
                } else if ( km > 5000 && km <= 10000) {
                    total = km * 4 * 0.95;
                } else if ( km > 10000 && km <= 20000) {
                    total = km * 4 * 1.45;
                }
                break;
            case "Summer":
                if (km <= 5000) {
                    total = km * 4 * 0.90;
                } else if ( km > 5000 && km <= 10000) {
                    total = km * 4 * 1.10;
                } else if ( km > 10000 && km <= 20000) {
                    total = km * 4 * 1.45;
                }
                break;
            case "Winter":
                if (km <= 5000) {
                    total = km * 4 * 1.05;
                } else if ( km > 5000 && km <= 10000) {
                    total = km * 4 * 1.25;
                } else if ( km > 10000 && km <= 20000) {
                    total = km * 4 * 1.45;
                }
                break;

        }

        System.out.printf("%.2f", total - (total * 0.1));
    }
}
