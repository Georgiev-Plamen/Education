package BasicSyntax;

import java.util.Scanner;

public class VendingMachineVersion2 {

    double priceNuts = 2.1;
    double priceWater = 0.7;
    double priceCrisps = 1.5;
    double priceSoda = 0.8;
    double priceCoke = 1.0;

    public static void check(double sum, String input) {
        if (sum >= 0) {
            System.out.printf("Purchased %s%n", input);
        } else {
            System.out.println("Sorry, not enough money");
            sum += 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VendingMachineVersion2 machine = new VendingMachineVersion2();

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            switch (input) {
                case "0.1":
                    sum += 0.1;
                    break;
                case "0.2":
                    sum += 0.2;
                    break;
                case "0.5":
                    sum += 0.5;
                    break;
                case "1":
                    sum += 1;
                    break;
                case "2":
                    sum += 2;
                    break;
                default:
                    double input1 = Double.parseDouble(input);
                    System.out.printf("Cannot accept %.2f%n", input1);
                    break;

            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {

            switch (input) {
                case "Nuts":
                    sum -= machine.priceNuts;
                    check(sum, input);
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
        }
    }
}

