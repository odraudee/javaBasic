package com.example;

public class SmartWatch extends SmartDevice{
    String colorBrazalete;

    public SmartWatch(String marca, String modelo, double screenSize, int ram, boolean red5g, String colorBrazalete) {
        super(marca, modelo, screenSize, ram, red5g);
        this.colorBrazalete = colorBrazalete;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "colorBrazalete='" + colorBrazalete + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                ", red5g=" + red5g +
                '}';
    }
}
