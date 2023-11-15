package org.example.homework.lesson15.task2;
/*Task 2
 Создайте класс Person, в котором хранится имя, фамилия, дата рождения и любимый день недели (используйте классы из пакета
 java.time). Представим, что вам пришли данные из другой системы и вам нужно преобразовать их в объекты типа Pesron.
 В классе Application создайте строку: "Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10"
  (имя, фамилия, номер любимого дня, дата рождения)
  1. Напишите метод, который распарсит (преобразует) эту строку в массив  обхектов Person.
  2. Вынесите данный метод в класс PersonParser, в классе Application создавайте объект этого типа и работайте с ним.
  3. Измените входные данные на "Fedor, Petrov, 7, 1980-25-02; Maks, Ermolaev, 12, 1987-02-03; Peter, Parker, 4, 1970-01-01;
  Inna, Filatova, 6, 1994-02-10" обработайте полученную ошибку в классе PersonParser таким образом, чтобы программа не прерывала
  работу
*/

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Person {
    private final String name;
    private final String surname;
    private final LocalDate birthDate;
    private final DayOfWeek favouriteWeekDay;

    public Person(String name, String surname, LocalDate birthDate, DayOfWeek favouriteWeekDay) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.favouriteWeekDay = favouriteWeekDay;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public DayOfWeek getFavouriteWeekDay() {
        return favouriteWeekDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", favouriteWeekDay=" + favouriteWeekDay +
                '}';
    }
}
