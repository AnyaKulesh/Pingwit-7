package org.example.homework.lesson2;

/*
Написать программу, которая выводит в консоль максимальные и минимальные значения для типов byte,
short, char, int, long, float, double. (для решения использовать типы-обертки)

 */
public class MaxMinValue {

    public static void main(String[] args) {
        System.out.println("Byte max value: " + Byte.MAX_VALUE);
        System.out.println("Byte min value: " + Byte.MIN_VALUE);
        System.out.println("Short max value: " + Short.MAX_VALUE);
        System.out.println("Short min value: " + Short.MIN_VALUE);
        System.out.println("Character max value: " + ((int) Character.MAX_VALUE));
        System.out.println("Character min value: " + ((int)Character.MIN_VALUE));
        System.out.println("Integer max value: " + Integer.MAX_VALUE);
        System.out.println("Integer min value: " + Integer.MIN_VALUE);
        System.out.println("Long max value: " + Long.MAX_VALUE);
        System.out.println("Long min value: " + Long.MIN_VALUE);
        System.out.println("Float max value: " + Float.MAX_VALUE);
        System.out.println("Float min value: " + Float.MIN_VALUE);
        System.out.println("Double max value: " + Double.MAX_VALUE);
        System.out.println("Double min value: " + Double.MIN_VALUE);
    }

}
