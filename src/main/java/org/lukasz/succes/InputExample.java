package org.lukasz.succes;

import java.util.Arrays;
import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj swoje imie ");
        String imie = scanner.nextLine();
        System.out.println("Twoje imie to : " + imie);
        System.out.println("Podaj pierwsza liczbe: ");
        String cyfra = scanner.nextLine();
        System.out.println("Podaj druga liczbe: ");
        String liczba = scanner.nextLine();
        int i = Integer.parseInt(liczba);
        int o = Integer.parseInt(cyfra);
        System.out.println(i+o);

//        String text = "1 + 1";
//        String[] s = text.split(" ");
//        System.out.println(Arrays.toString(s));


    }
}
