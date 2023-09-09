package org.example.homework.lesson2;

/*
Task 2.
Написать программу, которая преобразует строки "77", "12587", "-78945627", "123.6789", "-8965.876655" в значения типов
byte, short, int, float, double и выводит полученные значения в консоль

 */
public class StringParsing {
    private static final String BYTE_STRING = "77";
    private static final String SHORT_STRING = "12587";
    private static final String INT_STRING = "-78945627";
    private static final String FLOAT_String = "123.6789";
    private static final String DOUBLE_STRING = "-8965.876655";

    public static void main(String[] args) {

        Byte parsedByte = Byte.parseByte(BYTE_STRING);
        Short parsedShort = Short.parseShort(SHORT_STRING);
        Integer parsedInteger = Integer.parseInt(INT_STRING);
        Float parsedFloat = Float.parseFloat(FLOAT_String);
        Double parsedDouble = Double.parseDouble(DOUBLE_STRING);

        System.out.println(parsedByte);
        System.out.println(parsedShort);
        System.out.println(parsedInteger);
        System.out.println(parsedFloat);
        System.out.println(parsedDouble);
    }
}
