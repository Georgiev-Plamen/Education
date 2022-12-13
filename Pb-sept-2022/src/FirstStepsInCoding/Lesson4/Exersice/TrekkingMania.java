package FirstStepsInCoding.Lesson4.Exersice;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroup = Integer.parseInt(scanner.nextLine());
        int musalaGropup = 0;       //•	Група до 5 човека
        int monblanGroup = 0;       //•	Група от 6 до 12 човека
        int kilimanjaroGroup = 0;   //•	Група от 13 до 25 човека
        int k2Group = 0;            //•	Група от 26 до 40 човека
        int everestGroup = 0;       //•	Група от 41 или повече човека
        int allPeople = 0;

        for (int i = 1; i <= countGroup; i++) {
            int peopleOnGroup = Integer.parseInt(scanner.nextLine());
            if (peopleOnGroup <= 5) {
                musalaGropup += peopleOnGroup;
                allPeople += peopleOnGroup;
            } else if (peopleOnGroup <= 12) {
                monblanGroup += peopleOnGroup;
                allPeople += peopleOnGroup;
            } else if (peopleOnGroup <= 25 ) {
                kilimanjaroGroup += peopleOnGroup;
                allPeople += peopleOnGroup;
            } else if (peopleOnGroup <= 40 ) {
                k2Group += peopleOnGroup;
                allPeople += peopleOnGroup;
            } else if (peopleOnGroup > 40) {
                everestGroup += peopleOnGroup;
                allPeople += peopleOnGroup;
            }
        }


        double percentMusala = (1.00 * musalaGropup / allPeople) * 100.00;
        double percentMonblan = (1.00 * monblanGroup / allPeople) * 100.00;
        double percentKilimanjaro = (1.00 * kilimanjaroGroup / allPeople) * 100.0;
        double percentK2 = (1.00 * k2Group / allPeople) * 100.0;
        double percentEverest = (1.00 * everestGroup / allPeople) * 100.0;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMonblan);
        System.out.printf("%.2f%%%n", percentKilimanjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);

    }
}
