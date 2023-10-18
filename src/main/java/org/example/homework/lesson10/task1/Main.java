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

        UserDataValidator validationService = new UserDataValidator();
        printUserValidation(validationService, user);

        // если запустить валидацию с такими данными - получим проблему.
        UserData ivanov = new UserData(null, null, "Ivanov", "ii@mail.com", "325599", "899898");
        // я предлагаю воспользоваться String.format для составления сообщения
        printUserValidation(validationService, ivanov);
    }

    private static void printUserValidation(UserDataValidator validator, UserData user) {
        if (validator.validateUserData(user)) {
            String message = String.format("User data %s is valid", user);
            System.out.println(message);
        } else {
            String message = String.format("User data %s is invalid", user);
            System.out.println(message);
        }
    }
}
