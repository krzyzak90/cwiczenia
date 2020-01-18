package org.lukasz.succes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ReferencjeDoMetod {
    public static void main(String[] args) {
        Predicate<String> warunek = ReferencjeDoMetod::mójWarunek;
        System.out.println(warunek.test("abcd"));
        "dsdfs".isEmpty();
        Predicate<String> warunek1 = String::isEmpty;
        warunek1.test("");

        Consumer<String> zjadacz = System.out::println;
        zjadacz.accept("Jestem Łukasz");

//        ArrayList<String> słowa = new ArrayList<>();
//        Consumer<String> zjadacz1 = (słowo) -> słowa.add();
//        Consumer<String> zjadacz2 = słowa::add;

        Supplier<List<String>> podawacz = () -> new ArrayList<>();
        Supplier<List<String>> podawacz1 = ArrayList::new;

        List<String> strings = podawacz.get();


    }

    public static boolean mójWarunek(String txt) {

        return txt.length() > 10;

    }
}
