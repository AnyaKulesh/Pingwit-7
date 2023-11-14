package org.example.homework.lesson9.Box;

import java.math.BigDecimal;
import java.util.Arrays;

/*
Создать класс с  методом main(), в котором создать Банковское Хранилище на 5 ячеек. С помощью вызова метода next() получить ценности из всех ячеек и распечатать полученные массивы в консоль.
 */
public class Main {
    public static void main(String[] args) {
        DepositBox[] depositBoxes = new DepositBox[]{
                new DepositBox(5, "567T", new String[]{"Money", "Documents", "Rings"}),
                new DepositBox(11, "562L", new String[]{}),
                new DepositBox(6, "7y89i", new String[]{"Key", "Documents"}),
                new DepositBox(9, "67e34", new String[]{"Jewels"})
        };
        BankWarehouse bankWarehouse = new BankWarehouse("Repository", depositBoxes);
        System.out.println(bankWarehouse);

        DepositBox box = bankWarehouse.next();
        System.out.println(box);

        String[] values = box.extractValues("1234");
        System.out.println(Arrays.toString(values));

        values = box.extractValues("567T");
        System.out.println(Arrays.toString(values));

        for (int i = 0; i < 5; i++) {
            box = bankWarehouse.next();
            System.out.println(box);
        }

        String html = "<html>\n" +
                      "     <body>\n" +
                      "        <p>Hello World</p>\n" +
                      "    </body>\n" +
                      "</html>\n";
        System.out.println(html);
    }
}
