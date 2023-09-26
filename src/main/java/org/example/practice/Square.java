package org.example.practice;

import java.util.Scanner;

public class Square {
    private static final String SIGN = "*";
    private static final String Space = " ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter square size" );
            int size = scanner.nextInt();
            String line = "";
            int numSpaces = size -2;

            for (int i = 1; i<= size; i++){



        } for(int j=2; j<= numSpaces; j++) {
            line += Space;
        }
        System.out.println(line);
    }
    private static void printLine(int lineIndex){
        String line = "";

    }

    }

