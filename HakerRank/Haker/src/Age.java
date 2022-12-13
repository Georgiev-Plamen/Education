import java.util.Scanner;

public class Age {

    int age;
    int initialAge;
    int yearPasses;

    public Age (){
        initialAge =0;
        age =  0;
    }


    public void setInitialAge () {
        if (age < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
//            yearPasses();
//            amIOld();
        }
    }

    public void yearPasses() {
        age++;
        age++;
        age++;
    }

    public void amIOld () {
        if (age < 13 ) {
            System.out.println("You are young.");
        } else if ( age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Age newAge = new Age();
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            newAge.age = Integer.parseInt(scanner.nextLine());
            newAge.setInitialAge();
            newAge.amIOld();
            newAge.yearPasses();
            newAge.amIOld();
            System.out.println();
        }

    }
}
