package org.example.homework.lesson7.task5;

public class Main {
    private static final String AUDI = "Audi";

    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("Audi", "A5", 4),
                new Car("Tesla", " model S", 5),
                new Car("Audi", "Q8", 3),
                new Car("Jaguar", "F-Pace", 1),
        };
        openDoors(cars, AUDI);
    }

    private static void openDoors(Car[] cars, String name) {
        for (Car car : cars) {
            if (name.equals(car.getName())) {
                System.out.println(car);
                car.openAllDoors();
            }
        }
    }
}
