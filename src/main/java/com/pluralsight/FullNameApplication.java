package com.pluralsight;

import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String firstName = "";
        String middleName = "";
        String lastName = "";
        String suffix = "";

        System.out.println("Please enter your name");
        System.out.println("First name: ");
        firstName = inputScanner.next();

        System.out.println("Middle name: ");
        middleName = inputScanner.next();

        System.out.println("Last name: ");
        lastName = inputScanner.next();

        System.out.println("Suffix: ");
        suffix = inputScanner.next();

    }
}
