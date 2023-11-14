package org.example.homework.lesson11.task1;

import java.math.BigDecimal;

/*
Создайте класс с методом main, в этом методе содайте по питомцу каждого типа. Поместите всех питомцев в массив типа Pet[].
Проитерируйтесь по массиву, вызывая метод-карточку и выводя полученное сообщение в консоль.
 */
public class Main {
    public static void main(String[] args) {
        Owner anya = new Owner("Anya", "Kulesh", "+37819994", "an19@gmail.com");
        Owner sasha = new Owner("Alex", "Kozlov", " +920048995", "alex23@gmail.com");
        Owner dima = new Owner("Dima", "Maslo", "+37501992993", "dimMa@gmail.com");

        Cat vasilisa = new Cat(71898902003L, "Vasilisa", anya, "green", 4);
        Dog jack = new Dog(19200304L, "Jack", sasha, "Beagle", new BigDecimal("8.76"));
        Parrot kesha = new Parrot(83920300L, "Kesha", dima, "blue", true);
        Hamster seva = new Hamster(2992003L, "Seva", null, new BigDecimal("4.5"), "cream");
        Pet[] pets = new Pet[]{vasilisa, jack, kesha, seva};

        System.out.printf("Cat %s has %s eyes%n", vasilisa.getPetName(), vasilisa.getEyesColor());
        System.out.printf("Dog %s weighs %s%n", jack.getPetName(), jack.getWeight());

        for (Pet pet : pets) {
            System.out.println(pet.getCard());
        }


        seva.setOwner(sasha);
        System.out.println(seva.getCard());
    }
}
