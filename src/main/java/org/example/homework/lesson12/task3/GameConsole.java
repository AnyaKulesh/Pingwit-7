package org.example.homework.lesson12.task3;

public class GameConsole extends Device {
    private final String model;

    public GameConsole(String name, String model) {
        super(name);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "name='" + getName() + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
