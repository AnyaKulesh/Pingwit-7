package org.example.homework.lesson7.task5;

/*
Создайте класс Car (марка, модель, количество дверей)

Напишите класс, в котором создается и заполняется данными массив из автомобилей.
Создайте метод, который пройдет по списку и откроет двери всем авто марки Audi (Выведет в консоль сначала автомобиль,
а потом выведет в консоль "Дверь 1 открыта", "Дверь 2 открыта" ...)

 */
public class Car {
    private final String name;
    private final String model;
    private final int doorsNumber;

    public Car(String name, String model, int doorsNumber) {
        this.name = name;
        this.model = model;
        this.doorsNumber = doorsNumber;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void openAllDoors() {
        for (int i = 1; i <= doorsNumber; i++) {
            System.out.println("Door number" + i + " is open ");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", doorsNumber=" + doorsNumber +
                '}';
    }
}
