package org.example.homework.lesson15.task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Task 1
В классе Application создайте строки: '2023-17-01', '23-2022-01', '15-07-2022'.
Распарсите эти строки в объекты LocalDate, используя DateTime formatter.
Каждую полученную дату выведите в консоль в нескольких форматах:
01-Mar-2022, Mar-01-2022, 2022-01-Mar, 01-March-2022
Создайте объект LocalDateTime и выведите его в консоль в каком-то нетипичном формате на ваше усмотрение.

 */
public class Application {

    public static void main(String[] args) {
        String[] dates = {"2023-17-01", "23-2022-01", "15-07-2022", "2023-31-04"};
        DateTimeFormatter[] parserFormatters = {
                DateTimeFormatter.ofPattern("yyyy-dd-MM"),
                DateTimeFormatter.ofPattern("dd-yyyy-MM"),
                DateTimeFormatter.ofPattern("dd-MM-yyyy"),
                DateTimeFormatter.ofPattern("yyyy-dd-MM")
        };
        DateTimeFormatter[] printFormatters = {
                DateTimeFormatter.ofPattern("dd-MMM-yyyy"),
                DateTimeFormatter.ofPattern("MMM-dd-yyyy"),
                DateTimeFormatter.ofPattern("yyyy-dd-MMM"),
                DateTimeFormatter.ofPattern("dd-MMMM-yyyy")
        };

        LocalDate[] localDates = new LocalDate[dates.length];
        for (int i = 0; i < localDates.length; i++) {
            localDates[i] = LocalDate.parse(dates[i], parserFormatters[i]);
            for (DateTimeFormatter printFormatter : printFormatters) {
                System.out.println(localDates[i].format(printFormatter));
            }
        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MMMM.dd , hh.mm.ss.ms");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
