package FirstStepsInCoding.Lesson4.Exersice;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Брой турнири, в които е участвал – цяло число в интервала [1…20]
        //•	Начален брой точки в ранглистата - цяло число в интервала [1...4000]
        //За всеки турнир се прочита отделен ред:
        //•	Достигнат етап от турнира – текст – "W", "F" или "SF"

        int tournament = Integer.parseInt(scanner.nextLine());
        int startPoint = Integer.parseInt(scanner.nextLine());
        int pointsW = 0;
        int pointsF = 0;
        int pointsSF = 0;
        int wins = 0;

        for (int i = 1; i <= tournament; i++) {
            String stage = scanner.nextLine();

            switch( stage ) {
                case "W":
                    pointsW += 2000;
                    wins++;
                    break;
                case "F":
                    pointsF += 1200;
                    break;
                case "SF":
                    pointsSF += 720;
                    break;
            }
        }

            int allPoints = startPoint+  pointsW + pointsF + pointsSF;
            int averagePoints = (allPoints  - startPoint) / tournament;
            double averageWins = (1.0 * wins / tournament) * 100;

            System.out.printf("Final points: %d%n", allPoints);
            System.out.printf("Average points: %d%n", averagePoints);
            System.out.printf("%.2f%%", averageWins);


    }
}
