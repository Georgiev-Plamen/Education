package BasicSyntax;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        while(!input.equals("End")) {

            switch (input) {
                case "Nuts":
                    sum -= 2.0;
                    if (sum >= 0) {
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                        sum += 2.0;
                    }
                    break;
                case "Water":
                    sum -= 0.7;
                    if (sum >= 0) {
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                        sum += 0.7;
                    }
                    break;
                case "Crisps":
                    sum -= 1.5;
                    if (sum >= 0) {
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                        sum += 1.5;
                    }
                    break;
                case "Soda":
                    sum -= 0.8;
                    if (sum >= 0) {
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                        sum += 0.8;
                    }
                    break;
                case "Coke":
                    sum -= 1.0;
                    if (sum >= 0) {
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.println("Sorry, not enough money");
                        sum += 1.0;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        if (sum >= 0) {
            System.out.printf("Change: %.2f", sum);
        } else {
            sum = 0;
            System.out.printf("Change: %.2f", sum);
        }

    }

}
