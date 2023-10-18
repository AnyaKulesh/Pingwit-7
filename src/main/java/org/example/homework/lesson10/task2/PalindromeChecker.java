package org.example.homework.lesson10.task2;

import org.apache.commons.lang3.StringUtils;

/*
Напишите класс, который определит, является ли слово палиндромом. Метод должен принимать строку, а возвращать boolean.
Сделайте два решения - через массив и через использование класса StringUtils.

 */
public class PalindromeChecker {  // я предложил бы дать этому классу более точное имя. Он проверяет, является ли слово палиндромом, поэтому PalindromeChecker или что-то подобное подошло бы лучше
    public boolean isPalindrome(String string) {
        char[] symbol = string.toLowerCase()
                .replace(" ", "")
                .toCharArray();

        int left = 0;
        int right = symbol.length - 1;
        while (left < right) {
            if (symbol[left] != symbol[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean checkPalindrome(String word) {
        String lowerCaseWord = word.toLowerCase()
                .replace(" ", "");
        return lowerCaseWord.equals(StringUtils.reverse(lowerCaseWord));
    }
}
