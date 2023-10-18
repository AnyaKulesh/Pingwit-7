package org.example.homework.lesson10.task1;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/*
Создать класс, который будет валидировать (проверять) такие объекты. В нем будет метод, который принимает аргументом объект с данными, а возвращает boolean. Если значения всех полей валидны - возвращает true. Если хотя бы одно значение невалидно - метод выводит в консоль сообщение о проблеме (пример: “Имя может содержать только буквы, вы ввели невалидное имя: ЖЖЖЖ” ) и возвращает false, дальше валидацию не ведет.
Правила валидации:
username - непустая строка
имя, фамилия -  только буквы
имэйл - по регэкспу для имэйла
телефон - только цифры
пароль - не пустая строка

 */
public class UserDataValidator {  // классы, которые делают валидацию, называют обычно по схеме ...Validator. В данном случае, UserDataValidator
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
    private static final Pattern DIGITS_ONLY = Pattern.compile("\\d*");

    public boolean validateUserData(UserData userData) {
        return validateNotEmpty(userData.userName()) &&
                validateOnlyLetters(userData.name()) &&
                validateOnlyLetters(userData.surname()) &&
                validateNotEmpty(userData.password()) &&
                validateEmail(userData.email()) &&
                validateDigitsOnly(userData.phoneNumber());
    }

    private boolean validateNotEmpty(String username) {  // а что будет, если передать сюда null? попробуй использовать для проверки метод из StringUtils
        StringUtils.isEmpty(username);
        return true;
    }

    private boolean validateOnlyLetters(String name) {  // этот метод я бы рекомендовал реализовать через регэксп, по аналогии с DIGITS_ONLY. регексп быстро гуглится
        if (name == null) {
            return false;
        }
        String lowerCaseName = name.toLowerCase();
        for (int i = 0; i < lowerCaseName.length(); i++) {
            if (!isSymbolLetter(lowerCaseName.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isSymbolLetter(char symbol) {     // круто, находчиво!
        return symbol >= 'a' && symbol <= 'z';
    }

    private boolean validateEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    private boolean validateDigitsOnly(String phoneNumber) { // этот метод проверяет любую строку на содержание только цифр. если нам нужно буде
        // проверять еще какое-то значение на только цифры - мы можем использовать его, нам не нужно писать эту логику еще раз.
        // поэтому, предлагаю его назвать более обще - validateDigitsOnly
        return DIGITS_ONLY.matcher(phoneNumber).matches();
    }
}
