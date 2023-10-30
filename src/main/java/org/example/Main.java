package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    	Scanner scn = new Scanner(System.in);
    
    	// Show the menu
        System.out.println("MENU:");
        System.out.println("1. Option1");
        System.out.println("2. Option2");
        System.out.println("3. Option3");
        System.out.println("4. Option4");
        System.out.println("5. Exit");
        
        
        // Toke user's input
        System.out.printf("\nEnter your choice: ");
        int choice = scn.nextInt();
        
        
        // Show user his input
        System.out.println("> Your choice is: " + choice);
    }
}
