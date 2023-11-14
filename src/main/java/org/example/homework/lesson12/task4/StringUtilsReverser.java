package org.example.homework.lesson12.task4;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsReverser implements PersonReverser {

    @Override
    public Person reversePerson(Person person) {
        String name = StringUtils.reverse(person.getName());
        name = PersonReverser.updateCase(name);
        String surname = StringUtils.reverse(person.getSurname());
        surname = PersonReverser.updateCase(surname);
        return new Person(name, surname);
    }
}
