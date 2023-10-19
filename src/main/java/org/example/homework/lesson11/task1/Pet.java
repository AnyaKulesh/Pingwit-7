package org.example.homework.lesson11.task1;

/*
Создайте иерархию классов для информационной системы ветклиники. Каждый питомец должен содержать следующую общую информацию:
идентификатор записи в системе (используйте Long)
имя питомца
владельца (для владельца создайте отдельный класс: Имя, Фамилия, телефон, имэйл)

Также у всех питомцев должен быть метод, который возращает строку-карточку питомца: “Питомец Жучка принадлежит Игорю Николаеву. Контакты хоязина: +37078788787, in@mail.com”. Этот метод должен работать идентично у всех питомцев, нужно запретить возможность его переиспользования. Это предлагаю вынести в родительский класс Pet.

 */
public class Pet {
    private final long id;
    private final String petName;
    private Owner owner;


    public Pet(long id, String petName, Owner owner) {
        this.id = id;
        this.petName = petName;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public String getPetName() {
        return petName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getCard() { // здесь не хватает маленькой детали : Этот метод должен работать идентично у всех питомцев, нужно запретить возможность его переиспользования (переопределения).
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pet ").append(petName);
        if (owner == null) {
            stringBuilder.append(" is homeless.");  // красиво! :)
        } else {
            stringBuilder.append(" belongs to ")
                    .append(owner.getName())
                    .append(" ")
                    .append(owner.getSurname())
                    .append(" . Owner information: ")
                    .append(owner.getPhoneNumber())
                    .append(", ")
                    .append(owner.getEmail())
                    .append(".");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", petName='" + petName + '\'' +
                ", owner=" + owner +
                '}';
    }
}
