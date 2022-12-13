package FirstStepsInCoding.Lesson2.Exerciseed;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double record = Double.parseDouble(scanner.nextLine()); // Досегашен рекорд
        Double distance = Double.parseDouble(scanner.nextLine()); // Дитанция на рекорда
        Double time = Double.parseDouble(scanner.nextLine()); //Времето за което Иван плува

        //съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди
        Double delay =Math.floor(distance / 15) * 12.5;

        Double distanceAll = distance * time;
        Double distanceMinus = distanceAll + delay;

        if (distanceMinus < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", distanceMinus);

        } else{
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(record - distanceMinus));
        }

    }
}
