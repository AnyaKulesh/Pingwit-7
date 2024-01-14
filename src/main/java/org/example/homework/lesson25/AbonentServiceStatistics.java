package org.example.homework.lesson25;

import java.time.LocalDate;
import java.time.Period;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Напишите сервис, который будет собирать статистику об абонентах:
-  метод должен принять список абонентов, вычислять их возраст, и вычислять IntSummaryStatistics.
Метод дожен вернуть строку-отчет: “Количество абонентов - хх. Самый юный - хх лет, самый возрастной - хх лет,
средний возраст - хх лет (см пример в pl.pingwit.lec_25.point_2.StatisticsExample)
-  метод должен принимать список абонентов, отбирать только премиальных клиентов, вычислять, сколько уже длится их
 контракт и собирать статистику. Метод должен возвращать строку - отчет: Количесвто абонентов - жж,
 самый долгий контракт - хх, средний срок контрактв - хх

 */
public class AbonentServiceStatistics {
    public String calculateAgeStatistics(List<Abonent> abonentList) {
        IntSummaryStatistics statistics = abonentList.stream()// можно точнее ageStatistics
                .filter(Objects::nonNull)
                .map(Abonent::getDateOfBirth)
                .filter(Objects::nonNull)
                .map(localDate -> localDate.until(LocalDate.now()))
                .collect(Collectors.summarizingInt(Period::getYears));
        return String.format("Abonent number: %d, youngest: %d years, oldest: %d years, average age: %.2f years",
                statistics.getCount(), statistics.getMin(), statistics.getMax(), statistics.getAverage());
    }

    public String calculateVipContractStatistics(List<Abonent> abonentList) {
        IntSummaryStatistics statistics = abonentList.stream()// можно точнее - contractStatistics
                .filter(Objects::nonNull)
                .filter(abonent -> Boolean.TRUE.equals(abonent.getVip()))
                .map(Abonent::getContractDate)
                .filter(Objects::nonNull)
                .map(localDate -> localDate.until(LocalDate.now()))
                .collect(Collectors.summarizingInt(Period::getYears));
        return String.format("Vip abonent number : %d, longest period of contract : %d, average period of contract : %.2f ",
                statistics.getCount(), statistics.getMax(), statistics.getAverage());
    }
}
