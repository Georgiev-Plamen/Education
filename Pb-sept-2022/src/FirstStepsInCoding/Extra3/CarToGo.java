package FirstStepsInCoding.Extra3;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine(); //"Summer" или "Winter"
        double total = 0.0;
        String carType = "";
        String carClass = "";

        switch (season) {
            case "Summer" :
                if ( budget <= 100 ) {
                    carType = "Cabrio" ;
                    carClass = "Economy class";
                    total = budget * 0.35;
                } else if ( budget > 100 && budget <= 500) {
                    carType = "Cabrio" ;
                    carClass = "Compact class";
                    total = budget * 0.45;
                } else if ( budget > 500 ) {
                    carType = "Jeep";
                    carClass = "Luxury class";
                    total = budget * 0.90;
                }
                break;

            case "Winter":
                if ( budget <= 100 ) {
                    carType = "Jeep" ;
                    carClass = "Economy class";
                    total = budget * 0.65;
                } else if ( budget > 100 && budget <= 500) {
                    carType = "Jeep" ;
                    carClass = "Compact class";
                    total = budget * 0.80;
                } else if ( budget > 500 ) {
                    carType = "Jeep";
                    carClass = "Luxury class";
                    total = budget * 0.90;
                }
                break;
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, total);


    }
}
