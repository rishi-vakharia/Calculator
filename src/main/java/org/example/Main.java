package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);


    public static double addition(double a, double b) {

        logger.info("[ADDITION OPERATION] [START] " + a + " " + b);

        double res = a+b;

        logger.info("[ADDITION OPERATION] [END] " + res);

        return res;
    }

    public static double subtraction(double a, double b) {

        logger.info("[SUBTRACTION OPERATION] [START] " + a + " " + b);

        double res = a-b;

        logger.info("[SUBTRACTION OPERATION] [END] " + res);

        return res;
    }

    public static double multiplication(double a, double b) {

        logger.info("[MULTIPLICATION OPERATION] [START] " + a + " " + b);

        double res = a*b;

        logger.info("[MULTIPLICATION OPERATION] [END] " + res);

        return res;
    }

    public static double division(double a, double b) {

        logger.info("[DIVISION OPERATION] [START] " + a + " " + b);

        double res = a/b;

        logger.info("[DIVISION OPERATION] [END] " + res);

        return res;
    }


    public static void main(String[] args) {
    
    	Scanner scanner = new Scanner(System.in);
        int choice;
        double a, b;

        do {

            System.out.println("MENU:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println();

            System.out.printf("Enter choice: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.printf("Enter a: ");
                    a = scanner.nextDouble();
                    System.out.printf("Enter b: ");
                    b = scanner.nextDouble();
                    System.out.printf("Result: %.2f + %.2f is %.2f \n", a, b, addition(a,b));
                    break;
                case 2:
                    System.out.printf("Enter a: ");
                    a = scanner.nextDouble();
                    System.out.printf("Enter b: ");
                    b = scanner.nextDouble();
                    System.out.printf("Result: %.2f - %.2f is %.2f \n", a, b, subtraction(a,b));
                    break;
                case 3:
                    System.out.printf("Enter a: ");
                    a = scanner.nextDouble();
                    System.out.printf("Enter b: ");
                    b = scanner.nextDouble();
                    System.out.printf("Result: %.2f * %.2f is %.2f \n", a, b, multiplication(a,b));
                    break;
                case 4:
                    System.out.printf("Enter a: ");
                    a = scanner.nextDouble();
                    System.out.printf("Enter b: ");
                    b = scanner.nextDouble();
                    System.out.printf("Result: %.2f / %.2f is %.2f \n", a, b, division(a,b));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice...");
                    break;
            }
            System.out.println();

        } while(choice != 5);       
    }
}
