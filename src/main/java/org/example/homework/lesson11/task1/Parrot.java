package org.example.homework.lesson11.task1;

public class Parrot extends Pet {
    private final String colour;
    private final boolean isSpeaking;

    public Parrot(long id, String petName, Owner owner, String colour, boolean isSpeaking) {
        super(id, petName, owner);
        this.colour = colour;
        this.isSpeaking = isSpeaking;
    }

    public String getColour() {
        return colour;
    }

    public boolean isSpeaking() {
        return isSpeaking;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "colour='" + colour + '\'' +
                ", isSpeaking=" + isSpeaking +
                '}';
    }
}
