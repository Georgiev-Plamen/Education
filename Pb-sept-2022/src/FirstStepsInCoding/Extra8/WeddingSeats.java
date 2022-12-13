package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sector = scanner.nextLine();
        int sectorInt = sector.charAt(0);
        int rows = Integer.parseInt(scanner.nextLine());
        int places = Integer.parseInt(scanner.nextLine());
        int placesInt = 96 + places;
        int a = 0;
        int count = 0;
        Boolean even = false;


        for (int i = 65; i <= sectorInt ; i++) {
            for (int j = 1; j <= rows + a; j++) {
                if (j % 2 == 0) {
                    placesInt += 2;
                    even = true;
                }
                for (int k = 97; k <= placesInt ; k++) {
                    String sectorPrint = Character.toString((char) i);
                    String placesPrint = Character.toString((char) k);
                    System.out.printf("%s%d%s%n", sectorPrint, j, placesPrint);
                    count++;
                }
                if (even) {
                    placesInt -= 2;
                    even = false;
                }
            }
            a++;
        }
        System.out.println(count);
    }
}
