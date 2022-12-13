package BasicSyntax;

import java.util.Scanner;

public class PadawanEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double amountMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        double freeBelts = Math.floor(studentsCount / 6);

        double cost = (priceLightsabers * Math.ceil( studentsCount * 1.1)) + (priceRobes * studentsCount) + (priceBelts * (studentsCount - freeBelts ));



        if (amountMoney >= cost) {
            System.out.printf("The money is enough - it would cost %.2flv.",cost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",cost - amountMoney);
        }

    }
}
