package org.example.homework.lesson16.task1_2;

import org.example.homework.lesson16.task3.DefaultValueProcessor;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDetails customerDetails = new CustomerDetails("Anya", "Kulesh", "anyakulesh@gmail.com","=100203004", LocalDate.now(),12348);
        CustomerDetails customerDetails1 = new CustomerDetails("Sasha", "Kazlou", "sldlf;;a0", "+890200103", LocalDate.now(),1029394);
        CustomerDetails customerDetails2 = new CustomerDetails("Saharok", "Fominiashka", "rezviy@gmail.com", "1234567", LocalDate.now(), 103242);

        Validator validator = new Validator();

        validateCustomer(customerDetails, validator);
        validateCustomer(customerDetails1, validator);
        validateCustomer(customerDetails2, validator);
    }

    private static void validateCustomer(CustomerDetails customer, Validator validator) {
        try {
            System.out.println(customer);
            validator.validate(customer);
            System.out.println("Successfully validated");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
