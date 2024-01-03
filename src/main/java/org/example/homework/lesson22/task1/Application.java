package org.example.homework.lesson22.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Отсортируйте список данных по имени и фамлии пользователя, выведите в консоль
Отсортируйте список данных по дате рождения в порядке убывания, выведите в консоль
Отсортируйте список данных по имени, фамилии, дате рождения, выведите в консоль
 */
public class Application {
    public static void main(String[] args) {
        List<AccountInfo> accountInfos = new ArrayList<>(List.of(
                new AccountInfo("Ivan", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Fedor", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(1990, 10, 11)),
                new AccountInfo("Anna", "Ivanova", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 15)),
                new AccountInfo("Egor", "Egorov", "607499636tr", "ivan@tu.by", LocalDate.of(1989, 2, 3)),
                new AccountInfo("Andy23", "Aity", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Pavel", "Pavlov23", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11))));

        Comparator<AccountInfo> comparingByNameSurname = Comparator
                .comparing(AccountInfo::name)
                .thenComparing(AccountInfo::surname);
        accountInfos.sort(comparingByNameSurname);
        System.out.println(accountInfos);

        Comparator<AccountInfo> comparingByBirthDate = Comparator.comparing(AccountInfo::localDate).reversed();
        accountInfos.sort(comparingByBirthDate);
        System.out.println(accountInfos);

        Comparator<AccountInfo> comparingAll = Comparator
                .comparing(AccountInfo::name)
                .thenComparing(AccountInfo::surname)
                .thenComparing(AccountInfo::localDate);
        accountInfos.sort(comparingAll);
        System.out.println(accountInfos);
    }
}
