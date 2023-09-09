package org.example.practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.regex.Pattern;

/*
Task 2.
Написать программу, которая преобразует строки "77", "12587", "-78945627", "123.6789", "-8965.876655" в значения типов
byte, short, int, float, double и выводит полученные значения в консоль

 */
public class StringParsingWithReflection {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<?>[] types = new Class[] {
                Byte.class,
                Short.class,
                Integer.class,
                Float.class,
                Double.class,
                Long.class
        };
        String[] values = new String[] {
                "77", "12587", "-78945627", "123.6789", "-8965.876655", "1249182409182401123"
        };
        parseStringToTypes(values, types);
    }

    private static void parseStringToTypes(String[] values, Class<?>[] types) throws InvocationTargetException, IllegalAccessException {
        final Pattern pattern = Pattern.compile("parse.*");

        for (int i = 0; i < types.length; i++) {
            Method method = Arrays.stream(types[i].getMethods())
                    .filter(x -> pattern.matcher(x.getName()).matches() && x.getParameterCount() == 1)
                    .findAny()
                    .orElse(null);
            if (method != null) {
                System.out.println(method.getName() + " : " + method.invoke(null, values[i]));
            }
        }
    }

}
