package com.example;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Eduardo", "Anibal", "Luis"};
        String texto= "";
        for(String nombre: nombres){
            texto = texto + nombre + " ";
        }
        System.out.println(texto);
    }
}
