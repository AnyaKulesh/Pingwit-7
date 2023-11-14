package org.example.homework.lesson12.task5;

public class Application {
    private static final String DOCUMENT = "Hello world!";
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.turnOn();
        try {
            printer.print(DOCUMENT);
        } finally {
           printer.turnOff();
        }
    }
}
