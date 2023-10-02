package org.example.homework.lesson6.task1;

/*
Есть целочисленный неотсортированный массив. Отсортируйте его "пузырьком".
Попробуйте сами написать и затем посмотрите реализацию
 */
public class BubbleSort {
    public static void sort(int[] array) {
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    needSort = true;
                }
            }
        }
    }
}



