package com.tts;

import java.util.Scanner;

public class Main {

    public static void main (String[] arg) {
        System.out.println("Hello World!");

        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName = keyboard.nextLine();
        System.out.printf("Hello %s!\n", firstName);

        System.out.println("Would you like to continue?");
        System.out.print("(Y/N) ");
        String response = keyboard.nextLine();
        boolean approved = response.equals("Y") || response.equals("y");

        if (approved){
            System.out.println("Do you have a headache? ");
            String secondAnswer = keyboard.nextLine();
        }

    }
}