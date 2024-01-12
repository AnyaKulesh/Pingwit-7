package org.example.homework.lesson25;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Abonent> abonentsList = Arrays.asList(
                new Abonent("Anna","Kulesh", "1245", LocalDate.of(2002,12,29),LocalDate.of(2023,3,11),true, "Minsk"),
                new Abonent("Alex","Kazlou","56273",LocalDate.of(1993,2,11), LocalDate.of(2020,8,8),true,"Vilnius"),
                new Abonent("Lev","Kozlov","1200231",LocalDate.of(2022,11,18),LocalDate.of(2024,1,12),false,"Paris"),
                new Abonent("Maryna", "Sidorova", "1199203",LocalDate.of(2020,5,11), LocalDate.of(2022,2,3), false,"Warsaw"),
                new Abonent("Inna","Muhina","28348012",LocalDate.of(2005,1,19),LocalDate.of(2019,10,24),null,"Minsk"),
                new Abonent("Helen","Ivanova","1929437",null,null,null,"Warsaw"),
                new Abonent("Eva","Adamove",null,LocalDate.of(2004,9,30),LocalDate.of(2015,5,12),false,"Vilnius"),
                null,
                new Abonent("Egor","Egorov", "16728", null, null,null,null)
        );
        AbonentServiceMethods abonentServiceMethods = new AbonentServiceMethods();

        System.out.println(abonentServiceMethods.isVipAbonent(abonentsList,"Minsk"));
        System.out.println(abonentServiceMethods.isConnectedBeforeDate(abonentsList, LocalDate.of(2021,3,23)));
        System.out.println(abonentServiceMethods.findAnyAbonent(abonentsList,"Vilnius"));
        try {
            System.out.println(abonentServiceMethods.findAnyAbonent(abonentsList, "Kiev"));
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        AbonentServiceStatistics abonentServiceStatistics = new AbonentServiceStatistics();
        System.out.println(abonentServiceStatistics.calculateAgeStatistics(abonentsList));
        System.out.println(abonentServiceStatistics.calculateVipContractStatistics(abonentsList));

        MapService mapService = new MapService();
        System.out.println("Not VIP");
        mapService.calculateNotVip(abonentsList).forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("Group by cities");
        mapService.groupByCities(abonentsList).forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
