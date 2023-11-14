package org.example.practice.Stack.hanoi;

public class HanoiProblem {

    private static final int SIZE = 20;
    public static void main(String[] args) {
        HanoiTower source = new HanoiTower();
        HanoiTower dest = new HanoiTower();
        HanoiTower buffer = new HanoiTower();

        for (int i = SIZE; i >= 1; i--) {
            source.push(i);
        }

        System.out.println("source: " + source);
        System.out.println("dest: " + dest);
        System.out.println("buffer: " + buffer);

        solveHanoiProblem(source, dest, buffer, SIZE);

        System.out.println("number of operations: " + HanoiTower.getCounter());
        System.out.println("source: " + source);
        System.out.println("dest: " + dest);
        System.out.println("buffer: " + buffer);
    }

    private static void solveHanoiProblem(HanoiTower source, HanoiTower dest, HanoiTower buffer, int n) {
        if (n == 1) {
            dest.push(source.pop());
        } else {
            solveHanoiProblem(source, buffer, dest, n - 1);
            dest.push(source.pop());
            solveHanoiProblem(buffer, dest, source, n - 1);
        }
    }
}
