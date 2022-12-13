package BasicSyntax;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int inputLength = input.length() - 1;

        for (int i = inputLength; i >= 0; i--) {
            char word = input.charAt(i);
            System.out.print(word);
        }

    }
}
