// package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    	Scanner scanner = new Scanner(System.in);
        int choice, a, b;

        System.out.println("MENU:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println();
        System.out.printf("Enter choice: ");
        choice = scanner.nextInt();
        System.out.println();

        switch(choice) {
            case 1:
                System.out.println("For addition a+b");
                System.out.printf("Enter a: ");
                a = scanner.nextInt();
                System.out.printf("Enter b: ");
                b = scanner.nextInt();
                System.out.printf("Result: %d+%d = %d \n", a, b, a+b);
                break;
            case 2:
                System.out.println("For subtraction a-b");
                System.out.printf("Enter a: ");
                a = scanner.nextInt();
                System.out.printf("Enter b: ");
                b = scanner.nextInt();
                System.out.printf("Result: %d-%d = %d \n", a, b, a-b);
                break;
            case 3:
                System.out.println("For multiplication a*b");
                System.out.printf("Enter a: ");
                a = scanner.nextInt();
                System.out.printf("Enter b: ");
                b = scanner.nextInt();
                System.out.printf("Result: %d*%d = %d \n", a, b, a*b);
                break;
            case 4:
                System.out.println("For division a/b");
                System.out.printf("Enter a: ");
                a = scanner.nextInt();
                System.out.printf("Enter b: ");
                b = scanner.nextInt();
                System.out.printf("Result: %d/%d = %d \n", a, b, a/b);
                break;
            case 5:
                System.out.println("Exiting...");
                break;
        }
    }
}
