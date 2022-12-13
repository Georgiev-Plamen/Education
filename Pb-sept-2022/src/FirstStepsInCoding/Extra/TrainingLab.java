package FirstStepsInCoding.Extra;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 2 числа, по едно на ред: w (дължина в метри) и h (широчина в метри).
        //Ограничения: 3 ≤ h ≤ w ≤ 100.

        Double w = Double.parseDouble(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());

        Double wInCm = w * 100;
        Double hInCm = h * 100;

        //. Едно работно място заема 70 на 120 cm (маса с размер 70 на 40 cm + място за стол и преминаване с
        // размер 70 на 80 cm). Коридорът е широк поне 100 cm. Изчислено е, че заради входната врата
        // (която е с отвор 160 cm) се губи точно 1 работно място, а заради катедрата (която е с размер 160 на 120 cm)
        // се губят точно 2 работни места. Напишете програма,
        // която въвежда размери на учебната зала и изчислява броя работни места в нея при описаното разположение

//        Double freeEriaW = wInCm / 120;
//        int value1 = freeEriaW.intValue();
//        Double freeEriaH = hInCm - 100;
//        Double pcsInH = freeEriaH / 70;
//        int value = pcsInH.intValue();

        int freeEriaW = (int) (wInCm / 120);
        int freeEriaH = (int) (hInCm - 100);
        int pcsInH = freeEriaH / 70;

        Integer result = freeEriaW * pcsInH - 3;

        System.out.println(result);


    }
}
