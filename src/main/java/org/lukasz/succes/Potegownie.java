package org.lukasz.succes;

public class Potegownie {
    public static void main(String[] args) {

        int[] potegi = new int[20];
        potegi[0] = 2;
        for (int i = 1; i < 20; i++) {
            potegi[i] = 2 * potegi[i - 1];

        }
        for (int i = 0; i < 20; i++) {
            System.out.println(potegi[i]);
        }
    }
}


