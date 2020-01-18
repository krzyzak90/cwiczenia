package org.lukasz.succes;

public class Dodawanie implements OperatorBinarny {


    @Override
    public int wykonaj(int a, int b) {
        return a + b;
    }
}
