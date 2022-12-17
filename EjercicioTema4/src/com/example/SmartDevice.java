package com.example;

public abstract class SmartDevice {

    String marca;
    String modelo;
    double screenSize;
    int ram;
    boolean red5g;

    public SmartDevice(String marca, String modelo, double screenSize, int ram, boolean red5g) {
        this.marca = marca;
        this.modelo = modelo;
        this.screenSize = screenSize;
        this.ram = ram;
        this.red5g = red5g;
    }
}
