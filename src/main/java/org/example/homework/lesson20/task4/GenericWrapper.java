package org.example.homework.lesson20.task4;

/*
Создать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. Создайте в классе метод,
который бы выводил что это за тип на экран (получить имя класса для переменной getClass().getName())
 */
public class GenericWrapper<T> {
    private T var;

    public GenericWrapper(T var) {
        this.var = var;
    }

    public String getType() {
        return var.getClass().getName();
    }
}
