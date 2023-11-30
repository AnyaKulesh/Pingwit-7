package org.example.homework.lesson16.task1_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
Task 1
Создайте аннотацию @Email. Пометьте этой аннотацией поле email в классе CustomerDetails. Создайте валидатор, который
проверит поля, помеченные этой аннотацией ( через regexp) и если поле невалидно - бросайте ошибку (создайте новый тип
 эксепшена для валидационных ошибок). В классе Application создайте объект типа CustomerDetails и провалидируйте его валидатором.

 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {
}
