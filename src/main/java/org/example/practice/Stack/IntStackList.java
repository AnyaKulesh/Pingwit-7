package org.example.practice.Stack;

public class IntStackList implements IntStack {
    private IntNode head;

    @Override
    public void push(Integer data) {
        head = new IntNode(data, head);
    }

    @Override
    public Integer pop() {
        if (head == null) {
            return null;
        }
        Integer data = head.data();
        head = head.next();
        return data;
    }

    @Override
    public Integer pick() {
        return head == null ? null : head.data();
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        return "IntStackList{" +
                "head=" + head +
                '}';
    }
}
