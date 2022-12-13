package FirstStepsInCoding.Lesson3.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        Double pcs = Double.parseDouble(scanner.nextLine());

        //coffee	water	beer	sweets	peanuts

        switch (product) {
            case ("coffee"):
                if (city.equals("Sofia")) {
                    System.out.printf("%.2f",0.50 * pcs);
                } else if (city.equals("Plovdiv")) {
                    System.out.printf("%.2f",0.40 * pcs);
                } else if (city.equals("Varna")) {
                    System.out.printf("%.2f",0.45 * pcs );
                }
                break;
            case ("water"):
                if (city.equals("Sofia")) {
                    System.out.printf("%.2f",0.80 * pcs);
                } else if (city.equals("Plovdiv")) {
                    System.out.printf("%.2f",0.70 * pcs );
                } else if (city.equals("Varna")) {
                    System.out.printf("%.2f",0.70 * pcs );
                }
                break;
            case ("beer"):
                if (city.equals("Sofia")) {
                    System.out.printf("%.2f",1.20 * pcs);
                } else if (city.equals("Plovdiv")) {
                    System.out.printf("%.2f",1.15 * pcs);
                } else if (city.equals("Varna")) {
                    System.out.printf("%.2f",1.10 * pcs);
                }
                break;
            case ("sweets"):
                if (city.equals("Sofia")) {
                    System.out.printf("%.2f",1.45 * pcs);
                } else if (city.equals("Plovdiv")) {
                    System.out.printf("%.2f",1.30 * pcs);
                } else if (city.equals("Varna")) {
                    System.out.printf("%.2f",1.35 * pcs);
                }
                break;
            case ("peanuts"):
                if (city.equals("Sofia")) {
                    System.out.printf("%.2f",1.60 * pcs);
                } else if (city.equals("Plovdiv")) {
                    System.out.printf("%.2f",1.50 * pcs );
                } else if (city.equals("Varna")) {
                    System.out.printf("%.2f",1.55 * pcs);
                }
                break;
            }
        }

    }

