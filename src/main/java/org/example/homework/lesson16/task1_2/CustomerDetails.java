package org.example.homework.lesson16.task1_2;

import org.example.homework.lesson16.task3.DefaultValue;

import java.time.LocalDate;
import java.util.Objects;

/*
Создайте класс для хранения данных покупателя: CustomerDetails: String name, String surname, String email, String phone,
 LocalDate registrationDate, Integer priorityLevel.
 */
public class CustomerDetails {
    @DefaultValue
    private String name;
    @DefaultValue
    private String surname;
    @DefaultValue
    @Email
    private String email;
    @DefaultValue
    @OnlyDigits
    private String phone;
    @DefaultValue
    private LocalDate registrationDate;
    @DefaultValue
    private Integer priorityLevel;

    public CustomerDetails(String name, String surname, String email, String phone, LocalDate registrationDate, Integer priorityLevel) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.registrationDate = registrationDate;
        this.priorityLevel = priorityLevel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDetails that = (CustomerDetails) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(registrationDate, that.registrationDate) && Objects.equals(priorityLevel, that.priorityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, phone, registrationDate, priorityLevel);
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", registrationDate=" + registrationDate +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
