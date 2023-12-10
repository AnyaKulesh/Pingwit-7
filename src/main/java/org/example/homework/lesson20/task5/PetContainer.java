package org.example.homework.lesson20.task5;

import org.example.homework.lesson11.task1.Pet;

import java.util.Arrays;

/*

Напишите generic класс, который может хранить и возвращать массив объектов-наследников класса Pet из заняти 12.
 */
public class PetContainer<T extends Pet> {
    private T[] pets;

    public PetContainer(T[] pets) {
        this.pets = pets;
    }

    public T[] getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return "PetContainer{" +
                "pets=" + Arrays.toString(pets) +
                '}';
    }
}
