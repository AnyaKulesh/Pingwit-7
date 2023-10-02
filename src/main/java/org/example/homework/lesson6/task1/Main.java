package org.example.homework.lesson6.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {23, 6, 67, 12, -6, 0, 78};
        System.out.println("Before " + Arrays.toString(array));
        BubbleSort.sort(array);
        System.out.println("After " + Arrays.toString(array));
    }
}
