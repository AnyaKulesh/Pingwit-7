package org.example.homework.lesson12.task1;

public class RotaryPhone extends AbstractPhone {
    private final Address address;

    public RotaryPhone(String number, String model, Address address) {
        super(number, model);
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    protected String getInfo() {
        return "{" + super.getInfo() + address + "}";
    }

    @Override
    public String toString() {
        return "RotaryPhone{" +
                "address=" + address +
                '}';
    }
}
