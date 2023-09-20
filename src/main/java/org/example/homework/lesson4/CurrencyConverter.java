package org.example.homework.lesson4;

import java.math.BigDecimal;
import java.util.Scanner;

/*
Написать программу-конвертер валют. (гривна <-> евро в обе стороны)
Пользователь вводит валюту первым шагом, вторым вводит сумму, на выходе получает сумму в другой валюте.

 */
public class CurrencyConverter {
    private static final BigDecimal UAH_TO_EUR = BigDecimal.valueOf(0.025);
    private static final BigDecimal EUR_TO_UAH = BigDecimal.valueOf(39.46);
    private static final String EUR = "EUR";
    private static final String UAH = "UAH";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currency");
        String currency = scanner.next();
        System.out.println("Enter amount ");
        double amount = scanner.nextDouble();
        BigDecimal result = convert(currency, BigDecimal.valueOf(amount));
        String convertedCurrency = convertCurrency(currency);
        if (convertedCurrency != null) {
            System.out.println("Converted amount: " + result + " " + convertedCurrency);
        }
    }

    private static BigDecimal convert(String currency, BigDecimal amount) {
        if (UAH.equalsIgnoreCase(currency)) {
            return amount.multiply(UAH_TO_EUR) ;
        } else if (EUR.equalsIgnoreCase(currency)) {
            return amount.multiply(EUR_TO_UAH);
        } else {
            System.out.println("This currency \"" + currency + "\" is not supported.");
        }
        return null;
    }

    private static String convertCurrency(String currency) {
        if (UAH.equalsIgnoreCase(currency)) {
            return EUR;
        } else if (EUR.equalsIgnoreCase(currency)) {
            return UAH;
        }
        return null;
    }
}
