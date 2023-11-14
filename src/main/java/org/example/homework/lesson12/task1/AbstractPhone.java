package org.example.homework.lesson12.task1;

public abstract class AbstractPhone implements Phone {
    private final String number;
    private final String model;

    public AbstractPhone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }


    @Override
    public void makeCall(String number) {
        System.out.printf("Call from %s to %s%n", getInfo(), number);
    }

    @Override
    public void receiveCall() {
        System.out.println(getInfo() + " receives a call");
    }

    protected String getInfo() {
        return number + "," + model;
    }
}
