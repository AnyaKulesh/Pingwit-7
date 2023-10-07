package org.example.homework.lesson7.task6;
/*
Создайте класс House. В классе должны быть private поля:
тип (может быть два типа - индивидуальный и многоэтажка)
количество этажей
количество жильцов
включено ли отопление (такое хранить в boolean поле)

Напишите класс, в котором создается и заполняется данными массив из 5 домов.

Напишите и вызовите метод, который посчитает всех жителей многоэтажных домов.
Напишите и вызовите метод, который распечатает все индивидуальные дома
Напишите и вызовите метод, который включит отопление во всех домах многоэтажных домах высотой больше 5 этажей (проверка двух условий)

Напишите класс-каталог домов, в котором будет храниться название города, название района и список домов (массив).
Не забывайте про геттеры/сеттеры и toString()

 */
public class House {
    private final boolean isIndividual;
    private final int floorNumber;
    private final int tenants;
    private boolean turnOnHeating;

    public House(boolean isIndividual, int floorNumber, int tenants, boolean turnOnHeating) {
        this.isIndividual = isIndividual;
        this.floorNumber = floorNumber;
        this.tenants = tenants;
        this.turnOnHeating = turnOnHeating;
    }

    public boolean getIsIndividual() {
        return isIndividual;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getTenants() {
        return tenants;
    }

    public boolean isTurnOnHeating() {
        return turnOnHeating;
    }

    public void turnOnHeating(){
        turnOnHeating = true;
        System.out.println(this + ": heating turn on");
    }

    @Override
    public String toString() {
        return "House{" +
                "type=" + isIndividual +
                ", floorNumber=" + floorNumber +
                ", tenants=" + tenants +
                ", turnOnHeating=" + turnOnHeating +
                '}';
    }
}
