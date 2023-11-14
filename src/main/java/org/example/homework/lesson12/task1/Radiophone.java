package org.example.homework.lesson12.task1;

public class Radiophone extends AbstractPhone {

    private final int rate;

    public Radiophone(String number, String model, int rate) {
        super(number, model);
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    @Override
    protected String getInfo() {
        return "{" + super.getInfo() + "," + rate + " MHz" + "}";
    }

    @Override
    public String toString() {
        return "Radiophone{" +
                "rate='" + rate + '\'' +
                '}';
    }
}
