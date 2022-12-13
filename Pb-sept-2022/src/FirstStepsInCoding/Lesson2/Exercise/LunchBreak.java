package FirstStepsInCoding.Lesson2.Exercise;

import java.util.Scanner;

import static java.lang.Math.*;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name  = scanner.nextLine();
        Integer durationEpisode = Integer.parseInt(scanner.nextLine());
        Integer durationPause = Integer.parseInt(scanner.nextLine());

        Double lunchTime = durationPause * 0.125;
        Double restTime = durationPause * 0.25;
        Double freeTime = durationPause - lunchTime - restTime;
        Double total = 0.0;

        if (freeTime >= durationEpisode ){
            total = Math.ceil(freeTime - durationEpisode);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, total);
        } else {
            total = Math.ceil(durationEpisode-freeTime);

            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name , total);
        }

    }
}
