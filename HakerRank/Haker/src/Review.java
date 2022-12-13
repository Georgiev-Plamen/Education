import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String odd = "";
        String even = "";


        for (int i = 0; i < num ; i++) {
            String input = scanner.nextLine();
            int length = input.length();
            for (int j = 0; j < length ; j++) {
                char letter = input.charAt(j);
                if (j % 2 == 0) {
                    even = even + letter;
                } else {
                    odd = odd + letter;
                }
            }
            System.out.printf("%s %s%n",even, odd);
            even = "";
            odd = "";
        }
    }
}
