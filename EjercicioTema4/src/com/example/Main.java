package com.example;

public class Main {

    public static void main(String[] args) {

        SmartDevice iphone = new SmartPhone("Apple","14 Pro", 6.5,8,true,256);
        System.out.println(iphone.toString());

        SmartWatch applewatch = new SmartWatch("Apple","plus",2,6,false,"Azul");
        System.out.println(applewatch.toString());
    }
}
