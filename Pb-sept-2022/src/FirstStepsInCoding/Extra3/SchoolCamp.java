package FirstStepsInCoding.Extra3;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String season = scanner.nextLine();
        String gender = scanner.nextLine();
        int countStudent = Integer.parseInt(scanner.nextLine());
        int countOvernight = Integer.parseInt(scanner.nextLine());

        String sport = "";
        double total = 0.0;

        switch (season) {
            case "Winter":
            if (gender.equals("boys")) {
                sport = "Judo";
                total = 9.60 * countStudent * countOvernight;
            } else if (gender.equals("girls")){
                sport = "Gymnastics";
                total = 9.60 * countStudent * countOvernight;
            } else if (gender.equals("mixed")) {
                sport = "Ski";
                total = 10 * countStudent * countOvernight;
            }
                break;
            case "Spring":
                if (gender.equals("boys")) {
                    sport = "Tennis";
                    total = 7.20 * countStudent * countOvernight;
                } else if (gender.equals("girls")){
                    sport = "Athletics";
                    total = 7.20 * countStudent * countOvernight;
                } else if (gender.equals("mixed")) {
                    sport = "Cycling";
                    total = 9.50 * countStudent * countOvernight;
                }
                break;
            case "Summer":
                if (gender.equals("boys")) {
                    sport = "Football";
                    total = 15 * countStudent * countOvernight;
                } else if (gender.equals("girls")){
                    sport = "Volleyball";
                    total = 15 * countStudent * countOvernight;
                } else if (gender.equals("mixed")) {
                    sport = "Swimming";
                    total = 20 * countStudent * countOvernight;
                }
                break;
        }

        if (countStudent >= 50) {
            total = total * 0.50;
        } else if (countStudent >= 20){
            total = total - ( total * 0.15);
        } else if (countStudent >= 10){
            total = total - (total * 0.05);
        }

        System.out.printf("%s %.2f lv.",sport,total );
    }
}
