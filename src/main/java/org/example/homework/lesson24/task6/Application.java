package org.example.homework.lesson24.task6;
/*
Task 6.
Возьмите класс Address и создайте список адресов. (в списке сделайте повторяющиеся адреса, несколько адресов в одном городе,
несколько адресов на одной улице)
Преобразуйте адреса в объекты типа CityStreet, оставьте только те, у которых городе - Киев. Далее для каждой записи
выведите в консоль: "улица: " + cityStreet
 */

import org.example.homework.lesson24.task2.Address;
import org.example.homework.lesson24.task5.CityStreet;

import java.util.List;
import java.util.function.Function;


public class Application {
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
                new Address("Kiev", "Darvin", 156, 98),
                new Address("Warsaw", "Fortel", 56, 24),
                new Address("Warsaw", "Fortel", 67, 3),
                new Address("Warsaw", "Bruzdowa", 78, 56)
        );

        Function<Address, CityStreet> addressCityStreetFunction = address -> new CityStreet(address.getCity(), address.getStreet());


        addressList.stream()
                .filter(address -> address.getCity().equals("Kiev"))
                .map(address -> new CityStreet(address.getCity(), address.getStreet()))
                .forEach(street -> System.out.println("street: " + street));
    }
}
