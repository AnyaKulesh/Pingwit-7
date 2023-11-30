package org.example.homework.lesson16.task3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.time.LocalDate;

public class DefaultValueProcessor {
    public void process(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();
        for (Field declaredField : clazz.getDeclaredFields()) {
            for (Annotation annotation : declaredField.getAnnotations()) {
                if (annotation.annotationType().equals(DefaultValue.class) && declaredField.get(object) == null) {
                    declaredField.setAccessible(true);
                    if (declaredField.getType().equals(String.class)) {
                        declaredField.set(object, "DefaultValue");
                    }
                    if (declaredField.getType().equals(LocalDate.class)) {
                        declaredField.set(object, LocalDate.now());
                    }
                    if (declaredField.getType().equals(Integer.class)) {
                        declaredField.set(object, 0);
                    }
                }
            }
        }
    }
}
