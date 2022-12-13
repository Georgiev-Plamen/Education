package FirstStepsInCoding.Extra5;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int c = 0;
        int o = 0;
        int n = 0;
        String word = "";
//        String specialCharacters = "[!#$%&'()*+,.:;=?@\\[\\]^`{|}~]";

        // ДА пробвам с събиране на букви към дума и печатането и след получаване на ключовата. ДА ПРОВЕРЯ УСЛОВИЕТО

        while (!input.equals("End")) {
            switch (input) {
                case "c":
                    c++;
                    break;
                case "o":
                    o++;
                    break;
                case "n":
                    n++;
                    break;
                default:
            }

            if (input.contains("[") || input.contains("!") || input.contains("#") || input.contains("$") ||
            input.contains("%") || input.contains("&") || input.contains("(") || input.contains("*") ||
                    input.contains("+") || input.contains(",") || input.contains(".") || input.contains(":")
            || input.contains(";") || input.contains("=") || input.contains("?") || input.contains("@") ||
            input.contains("`") || input.contains("^")  || input.contains("{") || input.contains("}") ||
                    input.contains("/") || input.contains(")") || input.contains("\\") ||
                    input.contains("-") || input.contains("~") ) {

                input = scanner.nextLine();
                continue;
            }
            if (c > 1) {
                // System.out.print(input);
                word = word + input;
                c = 1;
            } else if (o > 1) {
                // System.out.print(input);
                word =word + input;
                o = 1;
            } else if (n > 1) {
                //System.out.print(input);
                word = word + input;
                n = 1;
            } else if (!input.equals("c") && !input.equals("o") && !input.equals("n")) {
                //System.out.print(input);
                word = word + input;
            }

            if (c > 0 && o > 0 && n > 0) {
                c = 0;
                o = 0;
                n = 0;

                System.out.printf("%s ",word);
                word = "";
            }

            input = scanner.nextLine();
        }
    }
}

