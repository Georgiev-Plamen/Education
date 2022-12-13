package FirstStepsInCoding.PreExam;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double dayMoney = Double.parseDouble(scanner.nextLine());
        double costs = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double sumPocketMoney = pocketMoney * 5;
        double sumDayMoney = dayMoney * 5;
        double sumAll = sumDayMoney + sumPocketMoney;
        double needMoney = costs + giftPrice;

        if (sumAll >= needMoney ) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", sumAll - costs);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", needMoney - sumAll);
        }
    }
}
