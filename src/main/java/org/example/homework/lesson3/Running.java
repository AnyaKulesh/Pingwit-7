package org.example.homework.lesson3;
/*
Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней?

 */
public class Running {
    private static final int PERCENT_ADDED = 10;
    public static void main(String[] args) {
        double distance = 10.0;
        double totalDistance = distance;

        for( int i = 2; i <= 7; i++){
            distance += distance * PERCENT_ADDED / 100;
            totalDistance += distance;
        }
        System.out.println("Total distance : " + totalDistance);
    }
}
