package org.example.homework.lesson10.task1;
/*
Создать класс, который будет хранить данные пользователя в системе: юзернейм, имя, фамилия, имэйл, телефон, пароль.
(объекты должны быть Immutable, можете использовать record)
 */
public record UserData(String userName, String name, String surname, String email, String phoneNumber, String password) {
}
