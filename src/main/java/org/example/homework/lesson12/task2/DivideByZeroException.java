package org.example.homework.lesson12.task2;

public class DivideByZeroException extends Exception{
    public DivideByZeroException() {
        super("Division by zero is not allowed");
    }
}
