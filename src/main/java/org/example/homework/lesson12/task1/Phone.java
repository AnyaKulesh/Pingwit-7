package org.example.homework.lesson12.task1;

/*
Создайте интерфейс Phone с двумя методами makeCall и recieveCall
Создайте абстрактный класс AbstractPhone, который имплементирует этот интерфейс
На его основе создайте классы, презентующие разлиычные виды телефонов: дисковый, радиотелефон, мобильный телефон (типа нокия 3310), смартфон. Добавляйте в эти классы поля по своему усмотрению, переопределяйте методы мо своему усмотрению.
Создайте класс Application, в которой создавайте объекты телефонов, попрактикуйте на них вызовы методов.

 */
public interface Phone {
    void makeCall(String number);

    void receiveCall();
}
