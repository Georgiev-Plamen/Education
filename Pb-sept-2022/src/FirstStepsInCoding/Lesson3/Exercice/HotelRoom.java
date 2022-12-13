package FirstStepsInCoding.Lesson3.Exercice;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month =  scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double costApartments = 0.0;
        double costStudio = 0.0;

        //May, June, July, August, September или October
        switch (month) {
            case "May" :
            case "October":
                costApartments = 65 * nights;
                costStudio = 50 * nights;
                if (nights > 14 ) {
                    costStudio = costStudio * 0.70;
                    costApartments = costApartments * 0.90;
                } else if ( nights > 7){
                    costStudio = costStudio * 0.95;
                }

                break;
            case "June":
            case "September":
                costStudio = 75.20 * nights;
                costApartments = 68.70 * nights;
                if (nights > 14 ) {
                    costStudio = costStudio * 0.80;
                    costApartments = costApartments * 0.90;
                }
                break;
            case "July":
            case "August":
                costStudio = 76 * nights ;
                costApartments = 77 * nights;
                if (nights > 14) {
                    costApartments = costApartments * 0.90;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", costApartments);
        System.out.printf("Studio: %.2f lv.", costStudio);
    }
}
