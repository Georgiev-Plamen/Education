package FirstStepsInCoding.Lesson6.Exersice;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String moveName = scanner.nextLine();
        String freePlace = "";
        String typeTicket = "";
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;
        int counter = 0;
        double usePlace = 0.0;
        int freePlaceInt =0;
        int countAll = 0;
        int countStudentsAll = 0;
        int countStandardAll = 0;
        int countKidAll = 0;
        boolean fullHall = false;

        while (!moveName.equals("Finish")) {
            freePlace = scanner.nextLine();

            while (!freePlace.equals("End")){
                freePlaceInt = Integer.parseInt(freePlace);
                typeTicket = scanner.nextLine();
                if (typeTicket.equals("End")){
                    break;
                }
                switch (typeTicket) {
                    case "student":
                        studentCount++;
                        counter++;
                        countStudentsAll++;
                        countAll++;
                        break;
                    case "standard":
                        standardCount++;
                        counter++;
                        countStandardAll++;
                        countAll++;
                        break;
                    case "kid":
                        kidCount++;
                        counter++;
                        countKidAll++;
                        countAll++;
                        break;
                }
                if ( counter >= freePlaceInt ) {
                    fullHall = true;
                    break;
                }

            }

            if ( counter >= freePlaceInt ) {
                System.out.printf("%s - 100.00%% full.%n", moveName);

                counter = 0;
                studentCount = 0;
                standardCount = 0;
                kidCount = 0;
            } else {
                // когато не е пълна
                double full = 1.0 * counter / freePlaceInt * 100;
                System.out.printf("%s - %.2f%% full.%n", moveName, full);

                counter = 0;
                studentCount = 0;
                standardCount = 0;
                kidCount = 0;
            }

            moveName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", countAll);
        double studentPercet = 1.0 * countStudentsAll / countAll * 100;
        double standardPercet = 1.0 * countStandardAll / countAll * 100;
        double kidPercet = 1.0 * countKidAll / countAll * 100;
        System.out.printf("%.2f%% student tickets.%n", studentPercet);
        System.out.printf("%.2f%% standard tickets.%n", standardPercet);
        System.out.printf("%.2f%% kids tickets.%n", kidPercet);
    }
}
