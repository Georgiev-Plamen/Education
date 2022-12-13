package FirstStepsInCoding.Lesson4.Exersice;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWasher = Double.parseDouble(scanner.nextLine());
        int priceToys = Integer.parseInt(scanner.nextLine());
        int giftMoney = 0;
        int sumGiftMoney = 0;
        int giftToys = 0;

        for (int i = 1; i <= age ; i++) {
            if ( i % 2 == 0) {
                giftMoney += 10;
                sumGiftMoney = sumGiftMoney + giftMoney - 1;
            } else {
                giftToys++;
            }
        }

        int sellToys = giftToys * priceToys;
        double total = sellToys + sumGiftMoney;

        if (total - priceWasher >= 0) {
            System.out.printf("Yes! %.2f", Math.abs(priceWasher - total));
        } else
            System.out.printf("No! %.2f", Math.abs(total - priceWasher));

    }
}
