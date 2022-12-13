package FirstStepsInCoding.Extra2;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        //•	Брой магнолии – цяло число в интервала [0 … 50]
        //•	Брой зюмбюли – цяло число в интервала [0 … 50]
        //•	Брой рози – цяло число в интервала [0 … 50]
        //•	Брой кактуси – цяло число в интервала [0 … 50]
        //•	Цена на подаръка – реално число в интервала [0.00 … 500.00]

        Integer magnolia = Integer.parseInt(scanner.nextLine());
        Integer hyacinth = Integer.parseInt(scanner.nextLine());
        Integer rose = Integer.parseInt(scanner.nextLine());
        Integer cactus = Integer.parseInt(scanner.nextLine());
        Double giftPrice = Double.parseDouble(scanner.nextLine());

        Double priceMagnolia = magnolia * 3.25;
        Double priceHyacinth = hyacinth * 4.0;
        Double priceRose = rose * 3.50;
        Double priceCactus = cactus * 8.0;
        Double tax = (priceMagnolia + priceHyacinth + priceRose + priceCactus) * 0.05;
        Double total = (priceMagnolia + priceHyacinth + priceRose + priceCactus) - tax;

        if (total >= giftPrice){
            System.out.printf("She is left with %.0f leva.", Math.floor(total - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice- total));
        }

    }
}
