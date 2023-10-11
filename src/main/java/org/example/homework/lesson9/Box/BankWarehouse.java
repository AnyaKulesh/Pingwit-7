package org.example.homework.lesson9.Box;

import java.util.Arrays;

/*
Создать immutable класс BankWarehouse, внутри которого хранится массив банковских ячеек и название хранилища.
При создании объекта в конструкторе передается массив, изменять или добавлять значения в массив после этого нельзя.

В классе должен быть метод next() который возвращает следующий элемент массива.
Если дошли до последнего элемента, вызов next() должен вернуть первый элемент.

 */
public final class BankWarehouse {
    private final String name;
    private int index;
    private final DepositBox[] bankCell;

    public BankWarehouse(String name, DepositBox[] bankCell) {
        this.name = name;
        this.bankCell = Arrays.copyOf(bankCell, bankCell.length);
    }

    public String getName() {
        return name;
    }

    public DepositBox[] getBankCells() {
        return bankCell.clone();
    }

    public DepositBox next() {
        DepositBox result = bankCell[index];
        index++;
        if (index == bankCell.length) {
            index = 0;
        }
        return result;
    }

    @Override
    public String toString() {
        return "BankWarehouse{" +
                "name='" + name + '\'' +
                ", index=" + index +
                ", bankCell=" + Arrays.toString(bankCell) +
                '}';
    }
}
