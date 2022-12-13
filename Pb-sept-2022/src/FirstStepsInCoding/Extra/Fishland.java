package FirstStepsInCoding.Extra;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double priceMackerel = Double.parseDouble(scanner.nextLine());
        Double priceSprinkle = Double.parseDouble(scanner.nextLine());
        Double bonito = Double.parseDouble(scanner.nextLine());
        Double safrid = Double.parseDouble(scanner.nextLine());
        Integer mussels = Integer.parseInt(scanner.nextLine());
        Double priceMussels = 7.50;

        Double priceBonito = priceMackerel + (priceMackerel * 0.6);
        Double priceSafrid = priceSprinkle + (priceSprinkle * 0.8);
        Double sumSafrid = safrid * priceSafrid;
        Double sumBonito = bonito * priceBonito;
        Double sumMussels = mussels * priceMussels;

        Double result = sumSafrid + sumBonito + sumMussels;

        System.out.printf("%.2f", result);
    }
}
