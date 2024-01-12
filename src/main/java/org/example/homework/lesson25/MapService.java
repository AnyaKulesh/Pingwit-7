package org.example.homework.lesson25;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Напишите сервис с методами:
-  метод принимает список абонентов, оставляет только не vip и возвращает Map<String, Abonent> - ключ - номер договора, значение - абонент
-  метод принимает список абонентов и группирует их по городам
 */
public class MapService {
    public Map<String, Abonent> calculateNotVip(List<Abonent> abonentList) {
        return abonentList.stream()
                .filter(Objects::nonNull)
                .filter(abonent -> Boolean.FALSE.equals(abonent.getVip()))
                .collect(Collectors.toMap(Abonent::getContractId, Function.identity()));
    }

    public Map<String, List<Abonent>> groupByCities(List<Abonent> abonentList) {
        return abonentList.stream()
                .filter(Objects::nonNull)
                .filter(abonent -> abonent.getCity() != null)
                .collect(Collectors.groupingBy(Abonent::getCity, Collectors.toList()));
    }
}
