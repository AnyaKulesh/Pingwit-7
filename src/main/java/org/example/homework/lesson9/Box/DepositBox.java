package org.example.homework.lesson9.Box;

import java.util.Arrays;

/*
Создать immutable класс, описывающий банковскую ячейку DepositBox.
Класс должен хранить номер ячейки, пароль (строка) и массив ценностей (строки). Пароль можно задать при создании ячейки, далее сменить либо как-то получить его нельзя.
Создайте метод extractValuables, который принимает аргументом строку-пароль и возвращает массив строк. Если пароль совпал - метод должен безопасно вернуть массив ценностей (по аналогии с занятием), если пароль не совпал - вернуть пустой массив.

 */
public final class DepositBox {
    private final int cellNum;
    private final String password;
    private final String[] values;

    public DepositBox(int cellNum, String password, String[] values) {
        this.cellNum = cellNum;
        this.password = password;
        this.values = Arrays.copyOf(values, values.length);
    }

    public int getCellNum() {
        return cellNum;
    }


    private String[] getValues() {
        return Arrays.copyOf(values, values.length);
    }

    public String[] extractValues(String password) {
        if (password.equals(this.password)) {
            return getValues();
        }
        return null;
    }

    @Override
    public String toString() {
        return "DepositBox{" +
                "cellNum=" + cellNum +
                ", password='" + password + '\'' +
                ", values=" + Arrays.toString(values) +
                '}';
    }
}
