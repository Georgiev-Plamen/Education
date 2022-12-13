package FirstStepsInCoding.Extra2;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer holiday = Integer.parseInt(scanner.nextLine());

        //•	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
        //•	Когато почива, стопанинът му си играе с него  по 127 минути на ден.
        //Напишете програма, която въвежда броя почивни дни и отпечатва дали Том може да се наспи добре и колко
        // е разликата от нормата за текущата година, като приемем че годината има 365 дни.
        //Пример: 20 почивни дни -> работните дни са 345 (365 – 20 = 345). Реалното време за игра е 24 275 минути
        // (345 * 63 + 20 *127).
        // Разликата от нормата е 5 725 минути (30 000 – 24 275 = 5 725) или 95 часа и 25 минути.

        Integer tomHappiness  = 30000;
        Integer ownerWork = 365 - holiday;
        Integer gameTimeOnWorkDay = ownerWork * 63;
        Integer gameTimeOnHoliday = holiday * 127;
        Integer gameTime = gameTimeOnHoliday + gameTimeOnWorkDay;
        Integer tomStatus = tomHappiness - gameTime;
        Integer hMore = tomStatus / 60;
        Integer mMore = tomStatus % 60;

        //Работи, не е направено форматираноето на часове и минути

        if( gameTime >= tomHappiness )
            System.out.printf("Tom will run away %n%d hours and %d minutes more for play", hMore * -1, mMore * -1);

        else if ( tomHappiness >= gameTime )
             System.out.printf("Tom sleeps well %n%d hours and %d minutes less for play", hMore, mMore);
    }
}
