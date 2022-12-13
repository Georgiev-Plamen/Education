package FirstStepsInCoding.Lesson3.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        Double pcs = Double.parseDouble(scanner.nextLine());

        //плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        //цена	2.50	1.20	0.85	1.45	2.70	5.50	3.85

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    System.out.printf("%.2f", pcs * 2.50);
                } else if (fruit.equals("apple")) {
                    System.out.printf("%.2f", pcs * 1.20);
                } else if (fruit.equals("orange")) {
                    System.out.printf("%.2f", pcs * 0.85);
                } else if (fruit.equals("grapefruit")) {
                    System.out.printf("%.2f", pcs * 1.45);
                } else if (fruit.equals("kiwi")) {
                    System.out.printf("%.2f", pcs * 2.70);
                } else if (fruit.equals("pineapple")) {
                    System.out.printf("%.2f", pcs * 5.50);
                } else if (fruit.equals("grapes")) {
                    System.out.printf("%.2f", pcs * 3.85);
                } else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if(fruit.equals("banana")){
                    System.out.printf("%.2f", pcs * 2.70);
                } else if (fruit.equals("apple")){
                    System.out.printf("%.2f", pcs * 1.25);
                } else if (fruit.equals("orange")){
                    System.out.printf("%.2f", pcs * 0.90);
                } else if (fruit.equals("grapefruit")){
                    System.out.printf("%.2f", pcs * 1.60);
                } else if (fruit.equals("kiwi")){
                    System.out.printf("%.2f", pcs * 3.00);
                } else if (fruit.equals("pineapple")){
                    System.out.printf("%.2f", pcs * 5.60);
                } else if (fruit.equals("grapes")) {
                    System.out.printf("%.2f", pcs * 4.20);
                } else {
                    System.out.println("error");
                }
                    break;

            default:
                System.out.println("error");
                break;

        }

    }
}
