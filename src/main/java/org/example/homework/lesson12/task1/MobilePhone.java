package org.example.homework.lesson12.task1;

public class MobilePhone extends AbstractPhone {
    private final int numberSimCard;

    public MobilePhone(String number, String model, int numberSimCard) {
        super(number, model);
        this.numberSimCard = numberSimCard;
    }

    public int getNumberSimCard() {
        return numberSimCard;
    }

    @Override
    protected String getInfo() {
        return "{" + super.getInfo() + "," + numberSimCard + "sim" + "}";
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "numberSimCard=" + numberSimCard +
                '}';
    }
}
