package FirstStepsInCoding.PreExam;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fat = Integer.parseInt(scanner.nextLine());
        int protein = Integer.parseInt(scanner.nextLine());
        int carbs = Integer.parseInt(scanner.nextLine());
        int calorie = Integer.parseInt(scanner.nextLine());
        int water = Integer.parseInt(scanner.nextLine());

        double fatGram = ( fat / 100.0 * calorie) / 9  ;
        double proteinGram = (protein / 100.0 * calorie ) / 4;
        double carbsGram = (carbs / 100.0 * calorie ) / 4;
        double weight = fatGram + proteinGram + carbsGram;
        double gramOfCalorie = 1.0 * calorie / weight * 1.0;
        double waterPercent = (100 - water) * gramOfCalorie / 100;
        System.out.printf("%.4f", waterPercent);

    }
}
