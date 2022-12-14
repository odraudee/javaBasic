package com.example;

public class Main {
    public static void main(String[] args) {

        int precio = 100;
        System.out.println(precioIVA(precio));
    }

    static double precioIVA(int precio) {
        return precio*1.16;
    }
}
