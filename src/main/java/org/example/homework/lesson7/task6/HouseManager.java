package org.example.homework.lesson7.task6;

/*
Напишите и вызовите метод, который посчитает всех жителей многоэтажных домов.
Напишите и вызовите метод, который распечатает все индивидуальные дома
Напишите и вызовите метод, который включит отопление во всех домах многоэтажных домах высотой больше 5 этажей (проверка двух условий)

 */
public class HouseManager {
    // этот класс задуман только для того,чтобы производить манипуляции над данными, а не чтобы хранить их.
    // поэтому в нем не нужно хранить массив houses. такого рода массив нужно создавать в методе main и передавать
    // в методы
    private House[] houses;

    public HouseManager() {
        this.houses = new House[]{
                new House(true, 2, 6, true),
                new House(false, 6, 78, true),
                new House(false, 4, 35, false),
                new House(true, 1, 3, false),
                new House(false, 8, 80, false)
        };
    }

    public House[] getHouses() {
        return houses;
    }

    public int calculateTenants(boolean isIndividual) { // этот метод должен принимать аргументом массив типа House
        int numberOfTenants = 0;
        for (House house : houses) {
            if (house.getIsIndividual() == isIndividual) {
                numberOfTenants += house.getTenants();
            }
        }
        return numberOfTenants;
    }

    public void printIndividualHouse(boolean isIndividual) {// этот метод должен принимать аргументом массив типа House
        System.out.println((isIndividual ? "Individual" : "Multi-floor") + " houses:");
        for (House house : houses) {
            if (house.getIsIndividual() == isIndividual) {
                System.out.println("   " + house);
            }
        }
    }

    public void turnOnHeating(boolean isIndividual) { // этот метод должен принимать аргументом массив типа House
        System.out.println("Turn on heating: ");
        for (House house : houses) {
            if (house.getIsIndividual() == isIndividual) { // сравнение == isIndividual в данном случае избыточно. house.getIsIndividual() вернет boolean, который будет true только если бом индивидуальный
                if (house.getFloorNumber() > 5) {
                    System.out.print("   ");
                    house.turnOnHeating();
                }
            }
        }
    }
}
