package org.example.homework.lesson12.task1;

public class Application {
    public static void main(String[] args) {
        Phone phone = new MobilePhone("+375444581198", "Nokia 531", 2);
        phone.makeCall("+375291745191");
        phone.receiveCall();

        Phone rotaryPhone = new RotaryPhone("+372898394", "Horizont",
                new Address("Minsk", "Lavandovaya 3", 234167, "Alex"));
        rotaryPhone.makeCall("+3849200104");
        phone.receiveCall();

        Phone radiophone = new Radiophone("3829100-18", "Panasonic", 60);
        radiophone.makeCall("+16728898394");
        radiophone.receiveCall();

        Phone smartphone = new Smartphone("+37267199", "Iphone13", 256);
        smartphone.makeCall("+193990020");
        smartphone.receiveCall();
    }
}
