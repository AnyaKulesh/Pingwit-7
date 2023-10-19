package org.example.homework.lesson11.task2;

import java.math.BigDecimal;

/*
Создайте класс таромат.
В нем напишите метод, который будет принимать на вход массив объектов Tare, а возвращать объект типа Receipt с заполненными полями.
Стоимость 1 тары из пластика - 10 центов, из стекла - 15 центов, из алюминия - 15 центов.

 */
public class Taromat {
    private static final BigDecimal PLASTIC_PRICE = BigDecimal.valueOf(0.10);
    private static final BigDecimal GLASS_PRICE = BigDecimal.valueOf(0.15);
    private static final BigDecimal ALUMINIUM_PRICE = BigDecimal.valueOf(0.15);

    public Receipt acceptTare(Tare[] tares) {
        int countPlastic = 0;
        int countGlass = 0;
        int countAluminium = 0;
        BigDecimal totalAmount = BigDecimal.valueOf(0); // для нуля у BigDecimal есть удобная константа BigDecimal.ZERO, рекомендую
        for (Tare tare : tares) {
            if (tare.getMaterial() == Material.PLASTIC) {
                countPlastic++;
                totalAmount = totalAmount.add(PLASTIC_PRICE);
            } else if (tare.getMaterial() == Material.GLASS) {
                countGlass++;
                totalAmount = totalAmount.add(GLASS_PRICE);
            } else if (tare.getMaterial() == Material.ALUMINIUM) {
                countAluminium++;
                totalAmount = totalAmount.add(ALUMINIUM_PRICE);
            }
        }
        String message = String.format("You recycled %d plastic bottles, %d glass bottles, %d aluminium bottles",
                countPlastic, countGlass, countAluminium);
        return new Receipt(message, totalAmount);
    }
}
