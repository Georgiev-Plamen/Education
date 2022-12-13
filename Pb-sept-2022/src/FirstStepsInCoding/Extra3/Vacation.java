package FirstStepsInCoding.Extra3;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";          // дистанция
        String accommodation = "";  // място за настаняване
        double total = 0.0;

        switch ( season ) {
            case "Summer":
                place = "Alaska";
                if (budget <= 1000) {
                    accommodation = "Camp";
                    total = budget * 0.65;
                } else if (budget > 1000 && budget <= 3000){
                    accommodation = "Hut";
                    total = budget * 0.80;
                } else if (budget > 3000) {
                    accommodation = "Hotel";
                    total = budget * 0.90 ;
                }
                break;
            case "Winter":
                place = "Morocco";
                if (budget <= 1000) {
                    accommodation = "Camp";
                    total = budget * 0.45;
                } else if (budget > 1000 && budget <= 3000){
                    accommodation = "Hut";
                    total = budget * 0.60;
                } else if (budget > 3000) {
                    accommodation = "Hotel";
                    total = budget * 0.90;
                }
                break;

        }

        System.out.printf("%s - %s - %.2f",place ,accommodation, total);
    }
}
