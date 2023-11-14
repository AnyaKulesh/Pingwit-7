package org.example.homework.lesson12.task4;

public class MyReverser implements PersonReverser {
    @Override
    public Person reversePerson(Person person) {
        String name = reverse(person.getName());
        name = PersonReverser.updateCase(name);
        String surname = reverse(person.getSurname());
        surname = PersonReverser.updateCase(surname);
        return new Person(name, surname);
    }

    private static String reverse(String value) {
        char[] valueCharArray = value.toCharArray();
        for (int i = 0; i < valueCharArray.length / 2; i++) {
            char temp = valueCharArray[i];
            valueCharArray[i] = valueCharArray[valueCharArray.length - 1 - i];
            valueCharArray[valueCharArray.length - 1 - i] = temp;
        }
        return new String(valueCharArray);
    }
}
