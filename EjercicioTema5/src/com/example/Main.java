package com.example;

//Crear una interfaz CocheCRUD.
//Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
//Como métodos de CocheCRUD podemos poner:
//save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
//Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
//Ejemplo:
public class Main {
    static CocheCRUD coche= new CocheCRUDimpl();
    public static void main(String[] args) {
        coche.save();
        coche.findall();
        coche.delete();
    }
}
