package org.example.homework.lesson25;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/*
Напишите сервис с несколькими методами для работы со списком абонентов:
-  метод должен принять список абонентов и город, а вернуть true есть ли в этом городе хоть один вип-абонент (иначе вернуть false) (anyMatch)
-  метод должен принять список абонентов и дату, а вернуть true если все абоненты в списке подключились до этой даты (allMatch)
-  метод должен принять список абонентов и город, и вернуть любого абонента из этого города, а если из этого города абонентов нет - выбросить исключение (findAny, optional)

 */
public class AbonentServiceMethods {
    public boolean isVipAbonent(List<Abonent> abonentList, String city) { // название можно поточнее, типа isAnyVipInCity
        // твое решение норм, рабочее. есть альтернативное - кажется, что читается немного лучше:
        /* abonentList.stream()
                .filter(abonent -> abonent.getCity().equals(city))
                .anyMatch(abonent -> abonent.getVip());*/
        return abonentList.stream()
                .anyMatch(abonent -> abonent.getVip().equals(true)
                        && abonent.getCity().equals(city));
    }

    public boolean isConnectedBeforeDate(List<Abonent> abonentList, LocalDate date) {
        return abonentList.stream()
                .allMatch(abonent -> abonent.getContractDate().isBefore(date));
    }

    public Optional<Abonent> findAnyAbonent(List<Abonent> abonentList, String city) { // можно поточнее findAnyAbonentFromCity
        Abonent abonent = abonentList.stream()
                .filter(Objects::nonNull)
                .filter(anyAbonent -> Objects.equals(city, anyAbonent.getCity()))
                .findAny()
                .orElseThrow(() -> new RuntimeException("City \"" + city + "\" doesn't exist"));
        return Optional.ofNullable(abonent); // здесь нет смысла возвращать Optional. если абонент не найден - бросится исключение. поменяй тип возвращаемого значения на Abonent
    }
}
