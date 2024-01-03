package org.example.homework.lesson24.task9;

/*
Создайте List<UserInfo>. Создайте предикат, по которому все юзеры, у которых имена начинаются с A,P,E удалялись бы из этого листа
*/

import java.util.List;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {

        List<UserInfo> userDataList = new java.util.ArrayList<>(List.of(
                new UserInfo("Anna", "Kulesh", "89202001", null, null),
                new UserInfo("Sasha", "Kozlov", "20010203", null, null),
                new UserInfo("Pasha", "Smirnov", "1092994", null, null),
                new UserInfo("Elen", "Ivanova", null, null, null),
                new UserInfo("Lev", "Koslov", null, null, null)
        ));
        Predicate<UserInfo> removeUsers = user -> user.getName().startsWith("A")
                || user.getName().startsWith("P") || user.getName().startsWith("E");
        userDataList.removeIf(removeUsers);
        userDataList.forEach(System.out::println);
    }
}
