package com.example;

public class SmartPhone extends SmartDevice{

    int memory;

    public SmartPhone(String marca, String modelo, double screenSize, int ram, boolean red5g, int memory) {
        super(marca, modelo, screenSize, ram, red5g);
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "memory=" + memory +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                ", red5g=" + red5g +
                '}';
    }
}
