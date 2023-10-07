package org.example.homework.lesson6.task2;

/*
Система для работы паркинга. Создайте класс, в котором будет храниться информация об автомобиле. Этот класс будет использоваться для системы, которая распознает номера автомобилей и поднимает шлагбаум в паркинг.
 Для работы этой системы нужно хранить регистрационный номер авто и данные о владельце - фамилия и имя, телефон, имэйл.
В созданном классе/классах создайте геттеры/сеттерыб конструкторы с и без параметров и переопределите метод toString().
В отдельном классе с методом main создайте массив из объектов-данных об авто (на 5 автомобилей).
Проитерируйтесь по массиву и выведите данные в консоль.

 */
public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Car("6915CT7", new Owner("Alex", "Kazlou", "80291675493", "alexgood@gamil.com")),
                new Car("0743MP5", new Owner("Hanna", "Smirnova", "80335672413", "annasmir@gmail.com")),
                new Car("6789AM3", new Owner()),
                new Car("9826BP7", new Owner()),
                new Car("9078PB4", new Owner("Spencer", "Agutin", "375291765843", "agutinA@gmail.com"))
        };

        Parking parking = new Parking(cars);
        parking.open("6915CT7");
        parking.open("7819NP7");

        parking.printCars();
    }
}
