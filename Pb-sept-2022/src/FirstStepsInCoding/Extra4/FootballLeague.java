package FirstStepsInCoding.Extra4;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int fens = Integer.parseInt(scanner.nextLine());
        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 1; i <= fens ; i++) {
            String sector = scanner.nextLine();

                switch (sector) {
                    case "A":
                        sectorA++;
                        break;
                    case "B":
                        sectorB++;
                        break;
                    case "V":
                        sectorV++;
                        break;
                    case "G":
                        sectorG++;
                        break;
                }
        }

        double percentSectorA = 1.0 * sectorA / fens * 100.0;
        double percentSectorB = 1.0 * sectorB / fens * 100.0;
        double percentSectorV = 1.0 * sectorV / fens * 100.0;
        double percentSectorG = 1.0 * sectorG / fens * 100.0;

        System.out.printf("%.2f%%%n",percentSectorA);
        System.out.printf("%.2f%%%n",percentSectorB);
        System.out.printf("%.2f%%%n",percentSectorV);
        System.out.printf("%.2f%%%n",percentSectorG);
        System.out.printf("%.2f%%%n",1.0 * fens / capacity * 100.0);

    }
}
