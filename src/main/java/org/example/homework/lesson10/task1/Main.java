package org.example.homework.lesson10.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name");
        String username = scanner.nextLine();
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your surname");
        String surname = scanner.nextLine();
        System.out.println("Enter your email");
        String email = scanner.nextLine();
        System.out.println("Enter your phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();

        UserData user = new UserData(username, name, surname, email, phoneNumber, password);
        ValidationService validationService = new ValidationService();
        System.out.println(user);
        System.out.println(validationService.validateUserData(user));

    }
}
