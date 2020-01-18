package org.lukasz.succes;

public class Example {
    public static void main(String[] args) {
        System.out.println("Wyciągamy tekst");
        try {
            String someString = getString();
            System.out.println("Wyciąŋamy tekst");
            System.out.println(someString);
        } catch (Exception e) {
            System.out.println("Wystąpił wyjątek");
        }
    }
    public static String getString() throws Exception {
        throw new Exception("Ups");
    }
}



