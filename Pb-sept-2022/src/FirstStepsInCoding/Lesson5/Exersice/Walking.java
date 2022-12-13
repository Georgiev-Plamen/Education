package FirstStepsInCoding.Lesson5.Exersice;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        String steps = "";
        int totalSteps = 0;

        while (!(totalSteps >= goal)) {
            steps = scanner.nextLine();
            if (steps.equals("Going home")) {
                int goHomeSteps = Integer.parseInt(scanner.nextLine());
                totalSteps += goHomeSteps;
                break;
            }
            int input = Integer.parseInt(steps);
            totalSteps += input;
        }
            if (totalSteps >= goal) {
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", totalSteps - goal);
            } else {
                System.out.printf("%d more steps to reach goal.", goal - totalSteps);
            }
    }

}
