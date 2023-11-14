package org.example.homework.lesson12.task4;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("Anna", "Kulesh");
        PersonReverser stringUtilsReverser = new StringUtilsReverser();
        Person newPerson = stringUtilsReverser.reversePerson(person);
        System.out.println(newPerson);
        PersonReverser myReverser = new MyReverser();
        Person myReverserPerson = myReverser.reversePerson(person);
        System.out.println(myReverserPerson);
    }
}
