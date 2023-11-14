package org.example.practice.Stack;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        run(new IntStackList());
    }

    private static void run(IntStack stack) {
        stack.push(5);
        stack.push(7);
        System.out.println(stack.pop());
        stack.push(3);
        stack.push(10);
        System.out.println(stack.pop());
        stack.push(1);
        stack.push(2);

        System.out.println(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println(stack);

        BigDecimal initial = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            initial.add(BigDecimal.TEN);
        }
        System.out.println(initial);
    }
}


