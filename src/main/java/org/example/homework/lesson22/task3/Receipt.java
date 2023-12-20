package org.example.homework.lesson22.task3;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Receipt {
    private final Map<Good,Integer> goodsCount;
    private BigDecimal totalPrice;
    private final LocalDateTime localDateTime;

    public Receipt() {
        goodsCount = new HashMap<>();
        totalPrice = BigDecimal.ZERO;
        this.localDateTime = LocalDateTime.now();
    }

    public void addGood(Good good) {
        goodsCount.merge(good, 1, Integer::sum);
        totalPrice = totalPrice.add(good.getPrice());
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    @Override
    public String toString() {
        return "ReceiptDescription{" +
                "goodsCount=" + goodsCount +
                ", totalPrice=" + totalPrice +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
