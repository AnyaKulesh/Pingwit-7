package org.example.homework.lesson11.task2;
/*
Создайте класс Application, в котором создайте массив объектов Tare, объект класса таромат и вызовите на нем метод,
описанный выше. Распечатайте полученный чек в консоль.
 */
public class Application {
    public static void main(String[] args) {
        Tare[] tares = new Tare[]{
                new Tare("Blanch", Material.ALUMINIUM),
                new Tare("Saint Spring", Material.PLASTIC),
                new Tare("Chablis", Material.GLASS),
                new Tare("Borjomi", Material.PLASTIC),
                new Tare("Reisling", Material.GLASS),
                new Tare("Fanta", Material.ALUMINIUM)
        };
        Taromat taromat = new Taromat();
        System.out.println(taromat.acceptTare(tares));

    }
}
