package org.example.homework.lesson7.task7;

/*
Создайте класс HarvestStatisticService, добавьте классу метод, который будет получать аргументом массив Harvest[],
а возвращать массив HarvestStatistic[] с посчитанной статистикой.
 */
public class HarvestStatisticService {

    public HarvestStatistic[] calculateStatistic(Harvest[] harvests) {
        int numPlant = countPlant(harvests);
        HarvestStatistic[] totalWeight = new HarvestStatistic[numPlant];
        for (Harvest harvest : harvests) {
            for (int i = 0; i < totalWeight.length; i++) {
                if (totalWeight[i] == null) {
                    totalWeight[i] = new HarvestStatistic(harvest.getPlant(), harvest.getWeight());
                    break;
                } else if (harvest.getPlant().equals(totalWeight[i].getPlant())) {
                    totalWeight[i].addWeight(harvest.getWeight());
                    break;
                }
            }
        }
        return totalWeight;
    }

    private int countPlant(Harvest[] harvest) { // крутое и сложное решение! принято, в дальнейшем покажу, как это сделать проще с использование коллекций
        boolean[] counted = new boolean[harvest.length];
        boolean allCounted = false;
        int numPlants = 0;
        while (!allCounted) {
            String plant = null;
            for (int i = 0; i < counted.length; i++) {
                if (!counted[i]) {
                    plant = harvest[i].getPlant();
                    break;
                }
            }
            if (plant == null) {
                allCounted = true;
            } else {
                numPlants++;
                for (int i = 0; i < counted.length; i++) {
                    if (plant.equals(harvest[i].getPlant())) {
                        counted[i] = true;
                    }
                }
            }
        }
        return numPlants;
    }
}
