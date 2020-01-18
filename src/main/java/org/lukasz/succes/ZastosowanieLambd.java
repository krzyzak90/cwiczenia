package org.lukasz.succes;

import java.util.*;
import java.util.function.Consumer;

public class ZastosowanieLambd {

    public static void main(String[] args) {
        List<String> imiona = new ArrayList<>(List.of("Adam", "Piotr", "Leo"));
        for (String imie : imiona) {
            System.out.println(imie);
        }
        Consumer<String> l = (x) -> System.out.println(x);
        Consumer<String> mr = System.out::println;
        imiona.forEach((x) -> System.out.println(x));

        imiona.replaceAll((s) -> s.toLowerCase());
        System.out.println(imiona);
        imiona.replaceAll(String::toUpperCase);
        System.out.println(imiona);

        imiona.removeIf((imie) -> imie.length() <= 4);
        System.out.println(imiona);

        Optional<String> optional1 = Optional.empty();
        Optional<String> optional2 = Optional.of("BOB");
        Optional<String> optional3 = Optional.ofNullable(null);

//        optional1.get();
        boolean present = optional1.isPresent();
        boolean empty = optional1.isEmpty();
        ;
        String s = optional1.orElse("XXXX");
        optional1.orElseGet(() -> {
            System.out.println("Optional jest pusty, zwracam domyslna wartosc");
            return "XXXX";
        });
//        String s1 = optional.orElseThrow()) ->new RuntimeException());
        Map<String, String> mapa = new HashMap<>();
        mapa.put("Krzysztof", "Gonciarz");
        String s1 = mapa.get("Krzysztof");
        if (s1 != null) {
            int length = s1.length();
            System.out.println(length);
        }
        Optional<String> nazwisko = Optional.ofNullable(mapa.get("Krzysztof"));
        nazwisko.map((n) -> n.length()).ifPresent(System.out::println);

        Optional.of("Bobby").filter((g) -> g.length() < 4);



        Optional<Optional<Integer>> y1 = Optional.of("Bob").map((g) -> Optional.of(g.length()));
        Optional<Integer> y2 = Optional.of("Bob").flatMap((g) -> Optional.of(g.length()));


        Optional<Integer> liczba = optional2.map((imie) -> 32 * imie.length());
    }


}
