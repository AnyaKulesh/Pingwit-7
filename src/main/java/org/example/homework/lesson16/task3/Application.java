package org.example.homework.lesson16.task3;

import org.example.homework.lesson16.task1_2.CustomerDetails;

public class Application {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDetails customerDetails = new CustomerDetails(null,null, null, null, null, null);
        DefaultValueProcessor defaultValueProcessor = new DefaultValueProcessor();
        defaultValueProcessor.process(customerDetails);
        System.out.println(customerDetails);
    }
}
