package org.example.homework.lesson24.task9;

import java.time.LocalDate;
import java.util.Objects;

public class UserInfo {
    private final String name;

    private final String surname;

    private final String phone;

    private final String email;

    private final LocalDate dateOfBirth;

    public UserInfo(String name, String surname, String phone, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(name, userInfo.name) && Objects.equals(surname, userInfo.surname) && Objects.equals(phone, userInfo.phone) && Objects.equals(email, userInfo.email) && Objects.equals(dateOfBirth, userInfo.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phone, email, dateOfBirth);
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
