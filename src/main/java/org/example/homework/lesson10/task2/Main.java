package org.example.homework.lesson10.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter palindrome word");
        String word = scanner.nextLine();

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(word));
        System.out.println(palindrome.checkPalindrome(word));
    }
}
