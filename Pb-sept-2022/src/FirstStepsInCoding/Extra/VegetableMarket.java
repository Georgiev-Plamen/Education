package FirstStepsInCoding.Extra;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]

        Double priceVegi =  Double.parseDouble(scanner.nextLine());
        Double priceFruits = Double.parseDouble(scanner.nextLine());
        Integer vegiKilos = Integer.parseInt(scanner.nextLine());
        Integer fruitsKilos = Integer.parseInt(scanner.nextLine());

        Double sumVegi = priceVegi * vegiKilos;
        Double sumFruirs = priceFruits * fruitsKilos;
        Double result = (sumVegi + sumFruirs) / 1.94;

        System.out.printf("%.2f", result);


    }
}
