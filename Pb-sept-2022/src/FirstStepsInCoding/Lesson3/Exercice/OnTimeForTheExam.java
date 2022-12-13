package FirstStepsInCoding.Lesson3.Exercice;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minutesArrive = Integer.parseInt(scanner.nextLine());

        int sumExam = hour * 60 + minutes;
        int sumArrive = hourArrive * 60 + minutesArrive;
        int difference = sumExam - sumArrive;
        int hoursDifference = 0;
        int minutesDifference = 0;

        // навреме -  ако е пристигнал в часа на изпита или до половин час преди това
        if (difference == 0) {
            System.out.println("On time");
        } else if ( difference > 0 && difference <= 30) {
            System.out.printf("On time%n%d minutes before the start", difference);
        }
        // подранил - ако е пристигнал по-рано повече от 30 минути
        if (difference > 30) {
            hoursDifference = difference / 60;
            minutesDifference = difference - ( hoursDifference * 60);
            if ( hoursDifference > 0) {
                System.out.printf("Early%n%d:%02d hours before the start", hoursDifference , minutesDifference);
            } else if (hoursDifference <= 0) {
                System.out.printf("Early%n%d minutes before the start", minutesDifference);
            }

        }
        // закаснял - ако е дошъл след часа на изпита.
        if (difference <0 ) {
            hoursDifference = Math.abs(difference / 60);
            minutesDifference = Math.abs(difference) - ( hoursDifference * 60);
            if (hoursDifference > 0){
                System.out.printf("Late%n%d:%02d hours after the start",hoursDifference, minutesDifference);
            } else if (hoursDifference <= 0 ) {
                System.out.printf("Late%n%d minutes after the start", minutesDifference);
            }

        }

    }
}
