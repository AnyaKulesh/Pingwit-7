package org.example.homework.lesson20.task4;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        GenericWrapper<String> stringWrapper = new GenericWrapper<>("stringWrapper");
        GenericWrapper<Integer> integerWrapper = new GenericWrapper<>(1994);
        GenericWrapper<List<Integer>> listWrapper = new GenericWrapper<>(new ArrayList<>());

        System.out.println(stringWrapper.getType());
        System.out.println(integerWrapper.getType());
        System.out.println(listWrapper.getType());
    }
}
