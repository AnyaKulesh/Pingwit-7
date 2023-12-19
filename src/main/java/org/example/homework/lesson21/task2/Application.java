package org.example.homework.lesson21.task2;

import java.util.*;

/*
Напишите класс, который описывает посещение сайта. В нем должен храниться имя пользователя
и строка-название посещенного сайта.
В классе Application создайте список посещений, причем один пользователь мог посещать разные сайты, мог по несколько раз посещать один и тот
же сайт.
2.1 Напишите метод, который примет на вход списко посещений и вернет коллекцию уникальных имен пользователей.
2.2 Напишите метод, который примет на вход список посещений и вернет коллекцию уникальных сайтов.
2.3 напишите метод, который примет на вход список посещений и вернет Map<String, Integer> в которой хранится количество
посещений каждого сайта
 */
public class Application {
    public static void main(String[] args) {
        List<VisitData> visitDataList = List.of(new VisitData("Anya", "yandex.com"),
                new VisitData("Anya", "kinopoisk.ru"),
                new VisitData("Anya", "yandex.com"),
                new VisitData("Alex", "google.com"),
                new VisitData("Alex", "stackoverflow.com"),
                new VisitData("Alex", "stackoverflow.com"),
                new VisitData("Lev", "netflix.com"),
                new VisitData("Lev", "disney.com")
        );
        System.out.println(extractUsernames(visitDataList));
        System.out.println(extractSites(visitDataList));
        System.out.println(countNumberOfVisits(visitDataList));
    }

    private static Set<String> extractUsernames(List<VisitData> visitDataList) {
        Set<String> usernames = new HashSet<>();
        for (VisitData visitData : visitDataList) {
            usernames.add(visitData.name());
        }
        return usernames;
    }

    private static Set<String> extractSites(List<VisitData> visitDataList) {
        Set<String> sites = new HashSet<>();
        for (VisitData visitData : visitDataList) {
            sites.add(visitData.site());
        }
        return sites;
    }

    private static Map<String, Integer> countNumberOfVisits(List<VisitData> visitDataList) {
        Map<String, Integer> numberOfVisits = new HashMap<>();
        for (VisitData visitData : visitDataList) {
            String site = visitData.site();
            if (numberOfVisits.containsKey(site)) {
                Integer count = numberOfVisits.get(site);
                numberOfVisits.put(site, count + 1);
            } else {
                numberOfVisits.put(site, 1);
            }
        }
        return numberOfVisits;
    }
}
