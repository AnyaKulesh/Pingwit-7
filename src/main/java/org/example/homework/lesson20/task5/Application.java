package org.example.homework.lesson20.task5;

import org.example.homework.lesson11.task1.Cat;
import org.example.homework.lesson11.task1.Dog;
import org.example.homework.lesson11.task1.Parrot;
import org.example.homework.lesson11.task1.Pet;

import java.math.BigDecimal;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        PetContainer<Dog> dogs = new PetContainer<>(new Dog[]{
                new Dog(19290300103L, "Jack", null, "Street", new BigDecimal(12)),
                new Dog(17389293L, "Bob", null, "Street", new BigDecimal(5))
        });
        System.out.println(Arrays.toString(dogs.getPets()));

        PetContainer<Pet> pets = new PetContainer<>(new Pet[]{
                new Cat(1039300009L, "Vasilisa", null, "green", 4),
                new Parrot(19900203004L, "Kesha", null, "Blue", true)
        });
        System.out.println(Arrays.toString(pets.getPets()));
    }
}
