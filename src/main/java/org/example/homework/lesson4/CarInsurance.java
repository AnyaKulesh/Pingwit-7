package org.example.homework.lesson4;

import java.math.BigDecimal;
import java.util.Scanner;

/*
Написать программу для расчета стоимости страховки на автомобиль. Пользователь вводит объем двигателя в см3, постоянный клиент?
были ли дтп? Тариф - 0.25 евро за см3, если клиент постоянный - скидка 20% (коэффициент 0.8), если были дтп - надбавка 20% (коэфф 1.2)

 */
public class CarInsurance {
    private static final BigDecimal RATE_FOR_CM3 =  BigDecimal.valueOf(0.25);
    private static final BigDecimal DISCOUNT_FOR_CUSTOMER = BigDecimal.valueOf(0.8);
    private static final BigDecimal ACCIDENT_FACTOR = BigDecimal.valueOf(1.2);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter engine capacity in cm3");
        int engineCapacity = scanner.nextInt();
        System.out.println("There were accident last year?");
        boolean wereAccident = scanner.nextBoolean();
        System.out.println(" Do you have our insurance?");
        boolean haveInsurance = scanner.nextBoolean();
        BigDecimal insuranceValue = calculateCarInsurance(engineCapacity, wereAccident, haveInsurance);
        System.out.println("Your car insurance policy costs : " + insuranceValue + " EUR ");

    }

    private static BigDecimal calculateCarInsurance(int capacity, boolean accident, boolean client) {
        BigDecimal result = RATE_FOR_CM3.multiply(BigDecimal.valueOf(capacity));
        if (accident) {
            result = result.multiply(ACCIDENT_FACTOR);
        }
        if (client) {
            result = result.multiply(DISCOUNT_FOR_CUSTOMER);
        }
        return result;
    }
}
