package com.example;

public class CocheCRUDimpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("Metodo save ejecutado desde la implementacion");
    }

    @Override
    public void findall() {
        System.out.println("Metodo findall ejecutado desde la implementacion");
    }

    @Override
    public void delete() {
        System.out.println("Metodo delete ejecutado desde la implementacion");
    }
}
