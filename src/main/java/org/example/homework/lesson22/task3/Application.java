package org.example.homework.lesson22.task3;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Создайте класс для описания товара в чеке. В классе храните int id (артикул), название товара и BigDecimal цену одной единицы товара.
В классе Application создайте список товаров (как в корзине в магазине), добавьте в него товары, причем некоторые товары добавьте
по несколько раз.
Создайте класс - описание чека, который будет хранить пары товар - количество, общую стоимость всех товаровб  а также дату и время совершения операции.
Напишите метод, который принимает на вход этот список, и возвращает чек.

 */
public class Application {
    public static void main(String[] args) {
        List<Good> goods = List.of(
                new Good(1L, "Avocado", BigDecimal.valueOf(3.15)),
                new Good(2L, "Baltica9", BigDecimal.valueOf(2)),
                new Good(3L, "Beef, Tomahawk Steak, 300g", BigDecimal.valueOf(10)),
                new Good(3L, "Beef, Tomahawk Steak, 300g", BigDecimal.valueOf(10)),
                new Good(4L, "Cava", BigDecimal.valueOf(15)),
                new Good(1L, "Avocado", BigDecimal.valueOf(3.15)),
                new Good(5L, "tomato", BigDecimal.valueOf(2)),
                new Good(5L, "tomato", BigDecimal.valueOf(2)));

        System.out.println(composeReceipt(goods));
    }

    private static Receipt composeReceipt(List<Good> goods) {
        Receipt receipt = new Receipt();
        goods.forEach(receipt::addGood);
        return receipt;
    }
}
