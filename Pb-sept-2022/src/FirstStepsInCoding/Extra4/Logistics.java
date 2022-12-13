package FirstStepsInCoding.Extra4;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	На първия ред – броя на товарите за превоз – цяло число в интервала [1...1000]
        //•	За всеки един товар на отделен ред – тонажа на товара – цяло число в интервала [1...1000]

        int countLoad = Integer.parseInt(scanner.nextLine());
        int totalWeight = 0;
        int bus = 0;
        int truck = 0;
        int train = 0;

        for (int i = 1; i <= countLoad ; i++) {
            int loadWeight = Integer.parseInt(scanner.nextLine());

            if ( loadWeight <= 3) {
                bus += loadWeight;
                totalWeight += loadWeight;
            } else if (loadWeight <= 11 ) {
                truck += loadWeight;
                totalWeight += loadWeight;
            } else if (loadWeight >= 12 ) {
                train += loadWeight;
                totalWeight += loadWeight;
            }
        }

        int priceBus = bus * 200;
        int priceTruck = truck * 175;
        int priceTrain = train * 120;
        Double totalPrice = 1.0 * priceBus + 1.0 * priceTruck + 1.0 * priceTrain;

        System.out.printf("%.2f%n", totalPrice / totalWeight);
        System.out.printf("%.2f%%%n", (1.0 * bus / totalWeight) * 100 );
        System.out.printf("%.2f%%%n", (1.0 * truck / totalWeight) * 100 );
        System.out.printf("%.2f%%", (1.0 * train / totalWeight) * 100 );

    }
}
