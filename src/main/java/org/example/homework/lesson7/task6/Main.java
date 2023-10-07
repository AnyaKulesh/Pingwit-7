package org.example.homework.lesson7.task6;

public class Main {
    public static void main(String[] args) {
        HouseManager houseManager = new HouseManager();
        int numberOfTenants = houseManager.calculateTenants(false);
        System.out.println(numberOfTenants);
        houseManager.printIndividualHouse(true);
        houseManager.turnOnHeating(false);

        HouseCatalogue houseCatalogue = new HouseCatalogue("Minsk", "Green Haven", houseManager.getHouses());
        System.out.println(houseCatalogue);
    }
}
