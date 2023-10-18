package org.example.homework.lesson11.task2;

import java.math.BigDecimal;

public record Receipt(String message, BigDecimal amount) {
    @Override
    public String toString() {
        return "Receipt{" +
                "message = '" + message + '\'' +
                ", amount = " + amount + " Euro" +
                '}';
    }
}
