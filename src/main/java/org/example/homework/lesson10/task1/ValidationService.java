package org.example.homework.lesson10.task1;

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
public class ValidationService {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
    private static final Pattern DIGITS_ONLY = Pattern.compile("\\d*");

    public boolean validateUserData(UserData userData) {
        return validateNotEmpty(userData.userName()) &&
                validateOnlyLetters(userData.name()) &&
                validateOnlyLetters(userData.surname()) &&
                validateNotEmpty(userData.password()) &&
                validateEmail(userData.email()) &&
                validatePhoneNumber(userData.phoneNumber());
    }

    private boolean validateNotEmpty(String username) {
        return !username.isEmpty();
    }

    private boolean validateOnlyLetters(String name) {
        String lowerCaseName = name.toLowerCase();
        for (int i = 0; i < lowerCaseName.length(); i++) {
            if (!isSymbolLetter(lowerCaseName.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isSymbolLetter(char symbol) {
        return symbol >= 'a' && symbol <= 'z';
    }

    private boolean validateEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        return DIGITS_ONLY.matcher(phoneNumber).matches();
    }
}
