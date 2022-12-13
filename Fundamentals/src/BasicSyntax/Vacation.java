package BasicSyntax;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count =  Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double sum = 0;

        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        sum = count * 8.45;
                        break;
                    case "Saturday":
                        sum = count * 9.80;
                        break;
                    case "Sunday":
                        sum = count * 10.46;
                        break;
                }
                if (count >= 30) {
                    sum = sum * 0.85;
                }
            break;
            case "Business":
                if (count >= 100){
                    count = count - 10;
                }
                switch (day) {
                    case "Friday":
                        sum = count * 10.90;
                        break;
                    case "Saturday":
                        sum = count * 15.60;
                        break;
                    case "Sunday":
                        sum = count * 16;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        sum = count * 15;
                        break;
                    case "Saturday":
                        sum = count * 20;
                        break;
                    case "Sunday":
                        sum = count * 22.50;
                        break;
                }
                if (count >= 10 && count <= 20) {
                    sum = sum * 0.95;
                }
                break;
        }

        System.out.printf("Total price: %.2f", sum);

    }
}
