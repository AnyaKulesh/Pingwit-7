package org.example.homework.lesson16.task3;

import org.example.homework.lesson16.task1_2.CustomerDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DefaultValueProcessorTest {
    DefaultValueProcessor defaultValueProcessor = new DefaultValueProcessor();

    @Test
    void testProcessFieldsNotNullSuccess() throws IllegalAccessException {
        LocalDate today = LocalDate.now();
        List<Object> objects = Arrays.asList(
                new CustomerDetails("Anya", "Kulesh", "aniakulesh@gmail.com", "8028499601", today, 19294),
                new CustomerDetails("Vasya", "Pupkin", "123@45.com", "1053423", today, 124234234),
                "objectWithoutDefaultValueAnnotations"
        );
        List<Object> expected = Arrays.asList(
                new CustomerDetails("Anya", "Kulesh", "aniakulesh@gmail.com", "8028499601", today, 19294),
                new CustomerDetails("Vasya", "Pupkin", "123@45.com", "1053423", today, 124234234),
                "objectWithoutDefaultValueAnnotations"
        );

        for (Object item : objects) {
            defaultValueProcessor.process(item);
        }
        assertThat(objects).isEqualTo(expected);
    }

    @Test
    void testProcessLocalDateNull() throws IllegalAccessException {
        CustomerDetails customerDetails = new CustomerDetails("Anya", "Kulesh", "aniakulesh@gmail.com", "8028499601", null, 19294);
        defaultValueProcessor.process(customerDetails);

        assertThat(customerDetails.getRegistrationDate()).isNotNull();
    }

    @Test
    void testProcessFieldsNullSuccess() throws IllegalAccessException {
        LocalDate today = LocalDate.now();
        List<CustomerDetails> customerDetailsList = Arrays.asList(
                new CustomerDetails(null, null, null, null, today, null),
                new CustomerDetails(null, null, "123@45.com", "1053423", today, 124234234),
                new CustomerDetails("Alex", "Kozlov", "alex@mail.com", "02003", today, null),
                new CustomerDetails(null, "Kozlov", null, null, today, 1)
        );
        List<CustomerDetails> expected = Arrays.asList(
                new CustomerDetails("DefaultValue", "DefaultValue", "DefaultValue", "DefaultValue", today, 0),
                new CustomerDetails("DefaultValue", "DefaultValue", "123@45.com", "1053423", today, 124234234),
                new CustomerDetails("Alex", "Kozlov", "alex@mail.com", "02003", today, 0),
                new CustomerDetails("DefaultValue", "Kozlov", "DefaultValue", "DefaultValue", today, 1)
        );

        for (CustomerDetails item : customerDetailsList) {
            defaultValueProcessor.process(item);
        }

        assertThat(customerDetailsList).isEqualTo(expected);
    }

    @Test
    void testNullObjects() {
        Assertions.assertThrows(NullPointerException.class, () -> defaultValueProcessor.process(null));
    }
}