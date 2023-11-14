package org.example.practice.Stack.hanoi;

import org.example.practice.Stack.IntStack;
import org.example.practice.Stack.IntStackArray;

public class HanoiTower implements IntStack {

    private static int counter = 0;
    private IntStack stack;

    public HanoiTower() {
        this.stack = new IntStackArray();
    }

    @Override
    public void push(Integer data) {
        if (stack.isEmpty() || data < stack.pick()) {
            stack.push(data);
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public Integer pop() {
        counter++;
        return stack.pop();
    }

    @Override
    public Integer pick() {
        return stack.pick();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "HanoiTower{" +
                "stack=" + stack +
                '}';
    }
}
