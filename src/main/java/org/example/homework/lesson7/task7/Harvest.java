package org.example.homework.lesson7.task7;

import java.math.BigDecimal;

/*
Создайте класс Harvest, в котором будут храниться данные об урожае на ферме.
У Harvest есть поля
Long id - уникальный идентификатор
String field - название поля, с которого был собран урожай (урожаев за год может быть несколько собрано с одного поля)
String plant - название растения (рожь, пшеница, клубника, картошечка и т.д.)
BigDecimal weight - вес собранного урожая

Создайте класс HarvestStatisticService, добавьте классу метод, который будет получать аргументом массив Harvest[],
а возвращать массив HarvestStatistic[] с посчитанной статистикой.

Внутри метода посчитайте статистику для каждого растения:
- общий вес урожая для каждого растения

 */
public class Harvest {
    private final long id;
    private final String field;
    private final String plant;
    private final BigDecimal weight;

    public Harvest(long id, String field, String plant, BigDecimal weight) {
        this.id = id;
        this.field = field;
        this.plant = plant;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public String getField() {
        return field;
    }

    public String getPlant() {
        return plant;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "id=" + id +
                ", field='" + field + '\'' +
                ", plant='" + plant + '\'' +
                ", weight=" + weight +
                '}';
    }
}
