package org.lukasz.succes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdy {

    public static void main(String[] args) {
//        Supplier<String> dostawca = () -> "Java";
//        String s = dostawca.get();
//        System.out.println(s);
//
//        Consumer<String> zjadacz = (c) -> System.out.println("\"" + c + "\"");
//        zjadacz.accept(s);
//
//        Predicate<String> warunek = (x) -> x.length()>10;
//        System.out.println(warunek.test(s));
//
//        Function<String, Integer> funkcja = (x) ->x.length();
//        System.out.println(funkcja.apply(s));
//        String s = "Argument";
//
//        ArrayList<String> stuff = new ArrayList<>();
//        Consumer<String> mniam = null;
//        mniam = (a) -> System.out.println(a + "(##)" + a);
//        mniam = (a) -> stuff.add(s);
//        mniam.accept(s);
//        System.out.println(stuff);
//        long big = 666777555;
//        Consumer<Long> duzyKwadrat  = (a) -> System.out.println(Math.pow(a,2));
//        duzyKwadrat.accept(big);


        Function<String, Czlowiek> parser = (txt) -> {
            String[] split = txt.split(";");
            String imię = split[0];
            int wiek = Integer.parseInt(split[1]);
            return new Czlowiek(imię, wiek);
        };
        Czlowiek człowiek = parser.apply("JoachimGąbka;31");
        System.out.println(człowiek.getWiek());
        Function<LocalDate, LocalDateTime> funkcja1 = (x) -> x.atTime(12, 0);
        System.out.println(funkcja1.apply(LocalDate.now()));

        Predicate<Integer> warunekLiczbowy = (i) -> i % 15 == 0;
        char c = "sfaa".toCharArray()[0];
        Character.isWhitespace(c);
        System.out.println(c);

        String str = "  tekst";
        Predicate<String> warunekBialeZnaki = (i) -> i.trim().length()==i.length();
        System.out.println(warunekBialeZnaki.test(str));

    }

}
