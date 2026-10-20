package com.pluralsight;

import java.util.*;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Name input
        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName = inputScanner.nextLine();

        System.out.print("Middle name: ");
        String middleName = inputScanner.nextLine();

        System.out.print("Last name: ");
        String lastName = inputScanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = inputScanner.nextLine();

        System.out.println(formatFullName(firstName, middleName, lastName, suffix));
    }
    // Full Name Format Method
    public static String formatFullName(String firstName, String middleName, String lastName, String suffix) {
        String fullName = firstName + " " + lastName;

        if (!middleName.isEmpty()) {
            fullName = firstName + " " + middleName + " " + lastName;
        }
        if (!suffix.isEmpty()) {
            fullName = fullName + "," + suffix;
        }
        return fullName;
    }
}
