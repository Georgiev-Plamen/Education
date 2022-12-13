package FirstStepsInCoding.Extra8;

import java.util.Scanner;

public class ChallengeTheWedding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int male = Integer.parseInt(scanner.nextLine());
        int female = Integer.parseInt(scanner.nextLine());
        int places = Integer.parseInt(scanner.nextLine());
        int placeSum = 0;

        for (int i = 1; i <= male  ; i++) {
            for (int j = 1; j <= female ; j++) {
                if(placeSum == places) {
                    break;
                } else {
                    System.out.printf("(%d <-> %d) ",i, j);
                    placeSum++;
                }

            }
        }
    }
}
