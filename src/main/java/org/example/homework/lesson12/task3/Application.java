package org.example.homework.lesson12.task3;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        Router router = new Router("Velcom", "velcom1235", new String[]{
                "Sony Playstation",
                "Xbox"
        });

        Device[] devices = new Device[]{
                new GameConsole("XBOX", "ONE S"),
                new GameConsole("Sony Playstation", "Classic"),
                new GameConsole("XBOX", "Series X"),
                new GameConsole("Nintendo", "Switch")};

        for (Device device : devices) {
            try {
                router.connectWiFi(device.getName());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
