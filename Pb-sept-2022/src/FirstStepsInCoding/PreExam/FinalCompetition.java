package FirstStepsInCoding.PreExam;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancer = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();
        double profit = 0;
        double profitAdroad = 0;

        switch (place) {
            case "Bulgaria":
                profit =  dancer * points;
                switch (season) {
                    case "summer":
                        profit = profit * 0.95;
                        break;
                    case "winter":
                        profit = profit * 0.92;
                        break;
                }
                break;
            case "Abroad":
                profit = dancer * points;
                profitAdroad = profit + (profit * 0.5);
                switch (season) {
                    case "summer":
                        profitAdroad = profitAdroad * 0.90;
                        break;
                    case "winter":
                        profitAdroad = profitAdroad * 0.85;
                        break;
                }
                profit = profitAdroad;
                break;


        }

        double donation = profit * 0.75;
        double peopleProfit = (profit - donation) / dancer;

        System.out.printf("Charity - %.2f%n", donation);
        System.out.printf("Money per dancer - %.2f", peopleProfit);
    }
}
