import java.util.Scanner;

public class ValidUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String input = "";
        int inputLen = 0;
        boolean contains  = false;

        for (int i = 0; i < count; i++) {
            input = scanner.nextLine();
            inputLen = input.length();

            if (inputLen < 8 || inputLen > 30 ) {
                System.out.printf("Invalid%n");
                continue;
            }

            if ((input.charAt(0) > 0 && input.charAt(0) < 65 || input.charAt(0) > 90 && input.charAt(0) < 97 || input.charAt(0) > 122 && input.charAt(0) < 128)) {
                    System.out.printf("Invalid%n");
                    continue;
            }
            for (int j = 0; j < inputLen ; j++) {

                if ((input.charAt(j) > 47 && input.charAt(j) < 58 || input.charAt(j) > 64 && input.charAt(j) < 91 || input.charAt(j) == 95 || input.charAt(j) > 96 && input.charAt(j) < 123)) {
                    contains  = true;
                } else {
                    contains = false;
                    break;
                }
            }

            if (contains) {
                System.out.printf("Valid%n");
            } else {
                System.out.printf("Invalid%n");
            }
        }
    }
}
