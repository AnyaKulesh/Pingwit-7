package org.example.homework.lesson6.task2;

public class Owner {  // Data - слишком широкое понятие, в программах под него подпадает очень мнгое. Плиз, придумай этому классу более информативное название.
    private final String name;
    private final String surname;
    private final String phoneNumber;
    private String email;

    public Owner() {
        this.name = "Egorka";
        this.surname = "Pupkin";
        this.phoneNumber = "80441674352";
    }

    public Owner(String name, String surname, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
