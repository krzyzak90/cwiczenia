package org.lukasz.succes;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) throws RuntimeException {
        int pierwsza_l;  // dwie liczby, na których będziemy wykonywać operację
        int druga_l;
        char znak;
        Scanner wej = new Scanner(System.in);   // wczytywanie zmiennych
        System.out.println("Podaj pierwszą liczbę:");
        pierwsza_l = wej.nextInt();
        System.out.println("Podaj drugą liczbę:");
        druga_l = wej.nextInt();

        if (pierwsza_l > 20 || druga_l > 20) {
            RuntimeException poza_zakresem = new RuntimeException("Poza zakresem");
            throw poza_zakresem;
        }

        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");
        System.out.println("Dzielenie dwóch liczb - wciśnij /");

        znak = wej.next().charAt(0);
        switch (znak) {
            case '+': {
                System.out.println(pierwsza_l + druga_l);
                break;
            }
            case '-': {
                System.out.println(pierwsza_l - druga_l);
                break;
            }
            case '*': {
                System.out.println(pierwsza_l * druga_l);
                break;
            }
            case '/': {
                if (druga_l != 0) {
                    System.out.println(pierwsza_l / druga_l + "oraz reszty: " +
                            pierwsza_l % druga_l);
                } else {
                    System.out.println("Nie dzielimy przez zero!!!");
                }
                break;
            }


        }

    }
}
