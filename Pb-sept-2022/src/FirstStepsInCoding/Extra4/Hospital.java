package FirstStepsInCoding.Extra4;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	На първия ред – периода, за който трябва да направите изчисления. Цяло число в интервала [1 ... 1000]
        //•	На следващите редове(равни на броят на дните) –
        // броя пациенти, които пристигат за преглед за текущия ден. Цяло число в интервала [0…10 000]

        int period = Integer.parseInt(scanner.nextLine());
        int unexaminedPatients = 0; // непрегледани пациенти
        int examinedPatients = 0;  // прегледани пацианти
        int doctors = 7; // доктори
        int test = 0; // контолно число за +3 дни

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i == test + 3) {
                test = i;
                if (unexaminedPatients > examinedPatients){
                    doctors++;
                }
            }
            if ( patients > doctors) {
                    unexaminedPatients += patients - doctors;
                    examinedPatients += doctors;
            } else {
                    examinedPatients += patients;
            }
        }

            System.out.printf("Treated patients: %d.%n", examinedPatients);
            System.out.printf("Untreated patients: %d.",unexaminedPatients);
    }
}
