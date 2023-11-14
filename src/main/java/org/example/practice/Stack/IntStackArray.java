package org.example.practice.Stack;

import java.util.Arrays;

public class IntStackArray implements IntStack {

    private static final int INITIAL_CAPACITY = 10;

    Integer[] data;
    int size;

    public IntStackArray() {
        data = new Integer[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void push(Integer element) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = element;
    }

    @Override
    public Integer pop() {
        if (size == 0) {
            return null;
        }
        return data[--size];
    }

    @Override
    public Integer pick() {
        return size == 0 ? null : data[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "IntStackArray{" +
                "data=" + Arrays.toString(Arrays.copyOf(data, size)) +
                '}';
    }
}
