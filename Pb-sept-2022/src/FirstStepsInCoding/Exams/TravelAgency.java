package FirstStepsInCoding.Exams;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String typeHolliday = scanner.nextLine();
        String discountCard = scanner.nextLine();
        int day = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        boolean error = true;
        if ( day < 1) {
            System.out.println("Days must be positive number!");
            error = false;

        } else if (day >= 7 ) {
            day -= 1;
        }


        switch (city) {
            case "Bansko":
            case "Borovets":
                switch (typeHolliday) {
                    case "noEquipment":
                        sum = day * 80;
                        break;
                    case "withEquipment":
                        sum = day * 100;
                        break;
                    default:
                        System.out.printf("Invalid input!");
                        error = false;

                }
                break;
            case "Varna":
            case "Burgas":
                switch (typeHolliday) {
                case "withBreakfast":
                    sum = day * 130;
                    break;
                case "noBreakfast":
                    sum = day * 100;
                    break;
                default :
                    System.out.printf("Invalid input!");
                    error = false;
                }
                break;
            default:
                System.out.printf("Invalid input!");
                error = false;
        }

        if (discountCard.equals("yes")) {
            if (city.equals("Bansko") || city.equals("Borovets")) {
                if(typeHolliday.equals("withEquipment")) {
                    sum = sum - (sum * 0.10 );
                } else {
                    sum = sum - (sum * 0.05);
                }

            } else if (city.equals("Varna") || city.equals("Burgas"))
                if (typeHolliday.equals("withBreakfast")) {
                    sum = sum - (sum * 0.12);
                } else {
                    sum = sum - (sum * 0.07);
            }
        }
        if (error) {
            System.out.printf("The price is %.2flv! Have a nice time!", sum);
        }

    }
}
