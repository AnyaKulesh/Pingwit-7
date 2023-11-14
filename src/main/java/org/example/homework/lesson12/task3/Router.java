package org.example.homework.lesson12.task3;

import java.io.IOException;
import java.util.Arrays;

/*
Создайте класс Router c полями name и networkName. В нем создайте метод connectWiFi(String deviceName). Этот метод должен рандомно
либо подключать устройство к вайфай, при этом выводить в консоль сообщение 'Устройство ИМЯ_УСТРОЙСТВА подключено с сети ИМЯ_СЕТИ',
либо бросать IOException с информационным сообщением (текст придумайте сами).
Создайте класс GameConsole c полями name и model.
В классе Application создайте объект роутера и объект консоли и попробуйте подключить консоль к вайфай. Обработайте ошибку.

 */
public class Router {
    private final String name;
    private final String networkName;
    private final String[] allowedDevices;

    public Router(String name, String networkName, String[] allowedDevices) {
        this.name = name;
        this.networkName = networkName;
        this.allowedDevices = allowedDevices;
    }

    public String getName() {
        return name;
    }

    public String getNetworkName() {
        return networkName;
    }

    public String[] getAllowedDevices() {
        return allowedDevices;
    }

    public void connectWiFi(String deviceName) throws IOException {
        if (isDeviseAllowed(deviceName)) {
            System.out.printf("Device %s connected to Wi-Fi network %s%n", deviceName, networkName);
        } else {
            throw new IOException(String.format("Device %s is not allowed for Wi-Fi network %s", deviceName, networkName));
        }
    }

    private boolean isDeviseAllowed(String deviceName) {
        for (String allowedDevice : allowedDevices) {
            if (allowedDevice.equalsIgnoreCase(deviceName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Router{" +
                "name='" + name + '\'' +
                ", networkName='" + networkName + '\'' +
                ", allowedDevices=" + Arrays.toString(allowedDevices) +
                '}';
    }
}
