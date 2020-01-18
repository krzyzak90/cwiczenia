package org.lukasz.succes;

import java.util.*;

public class Listy {

    public static void main(String[] args) {

        ArrayList<String> lista1 = new ArrayList<>();
        LinkedList<String> lista2 = new LinkedList<>();
        List<String> lista = lista1;
        lista = lista2;

        lista.add ("A");
        lista.add(0,"B");
        lista.set(0,"C");

        System.out.println(lista);

        lista.contains("C");
        System.out.println(lista.contains("C"));
        System.out.println(lista.containsAll(lista));

//        lista.add("F");
//        lista.remove("C");
//        System.out.println(lista);

        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(5);
        liczby.add(4);
        liczby.add(3);
        liczby.add(2);
        liczby.add(1);
        liczby.add(0);
        System.out.println(liczby);
        liczby.sort(null);
        System.out.println(liczby);
        liczby.sort(Comparator.reverseOrder());
        System.out.println(liczby);

        ArrayList<Integer> Fibo = new ArrayList<>();

        Fibo.add(0);
        Fibo.add(1);

        for (int x=2; x<21; x++) {
            Fibo.add(x, Fibo.get(x - 1) + Fibo.get(x-2));

        }
        System.out.println(Fibo);


    }
}
