package org.example.homework.lesson16.task1_2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class Validator {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
    private static final Pattern DIGITS_ONLY = Pattern.compile("\\d*");

    public void validate(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();
        for (Field declaredField : clazz.getDeclaredFields()) {
            for (Annotation annotation : declaredField.getAnnotations()) {
                if (annotation.annotationType().equals(Email.class)) {
                    validateEmail(object, declaredField);
                }
                if (annotation.annotationType().equals(OnlyDigits.class)) {
                    validateOnlyDigits(object, declaredField);
                }
            }
        }
    }

    private void validateEmail(Object object, Field field) throws IllegalAccessException {
        if (!field.getType().equals(String.class)) {
            throw new EmailValidationException("Email should have type String");
        }
        field.setAccessible(true);
        String value = (String) field.get(object);
        if (!EMAIL_PATTERN.matcher(value).matches()) {
            String message = String.format("Email '%s' has wrong format", value);
            throw new EmailValidationException(message);
        }
    }

    private void validateOnlyDigits(Object object, Field field) throws IllegalAccessException {
        if (!field.getType().equals(String.class)) {
            throw new OnlyDigitsValidationException("Phone should have type String");
        }
        field.setAccessible(true);
        String value = (String) field.get(object);
        if (!DIGITS_ONLY.matcher(value).matches()) {
            String message = String.format("Phone '%s' has wrong format", value);
            throw new OnlyDigitsValidationException(message);
        }
    }
}
