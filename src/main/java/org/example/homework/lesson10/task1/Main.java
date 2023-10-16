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
        System.out.println(user);
        ValidationService validationService = new ValidationService();
        System.out.println(validationService.validateUserData(user));

        // если запустить валидацию с такими данными - получим проблему.
        UserData ivanov = new UserData(null, null, "Ivanov", "ii@mail.com", "325599", "899898");
        // я предлагаю воспользоваться String.format для составления сообщения
        if (validationService.validateUserData(ivanov)) {
            String message = String.format("User data %s is valid", ivanov);
            System.out.println(message);
        } else {
            String message = String.format("User data %s is invalid", ivanov);
            System.out.println(message);
        }
    }
}
