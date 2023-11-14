package org.example.homework.lesson12.task1;

public class Smartphone extends AbstractPhone {
    private final int memory;

    public Smartphone(String number, String model, int memory) {
        super(number, model);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    protected String getInfo() {
        return "{" + super.getInfo() + "," + memory + " GB" + "}";
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "memory='" + memory + '\'' +
                '}';
    }
}
