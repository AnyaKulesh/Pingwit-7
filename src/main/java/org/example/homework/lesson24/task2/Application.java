package org.example.homework.lesson24.task2;
/*
Task 2.
Возьмите класс Address и создайте список адресов. (в списке сделайте повторяющиеся адреса, несколько адресов в одном городе,
несколько адресов на одной улице, улицы с одинаковыми названиями в разных городах)
Найдите в списке все адреса из города Киев и соберите их в список.
 */

import java.util.List;
import java.util.function.Predicate;

public class Application {

    private static final String CITY_TO_FIND = "Kiev";
    public static void main(String[] args) {
        List<Address> addressList = List.of(
                new Address("Minsk", "Mayskaya", 2, 77),
                new Address("Minsk", "Karla Marksa", 8, 42),
                new Address("Minsk", "Karla Marksa", 5, 23),
                new Address("Kiev", "Mayskaya", 2, 77),
                new Address("Minsk", "Nemiga", 7, 56),
                new Address("Minsk", "Nemiga", 7, 56),
                new Address("Kiev", "Azovskaya", 7, 187),
                new Address("Kiev", "Darvin", 13, 18),
                new Address("Kiev", "Darvin", 156, 98),
                new Address("Kiev", "Kazanskaya", 78, 9),
                new Address("Kiev", "Darvin", 156, 98)
        );

        addressList.stream()
                .filter(address -> address.getCity().equals(CITY_TO_FIND))
                .forEach(System.out::println);
    }
}
