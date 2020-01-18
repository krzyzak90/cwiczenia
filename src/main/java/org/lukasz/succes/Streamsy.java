package org.lukasz.succes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamsy {
    public static void main(String[] args) {

        List<String> imionaNazwiska = List.of("Grzegorz Martyniuk",
                "Mateusz Spears",
                "Leo Gamer");

        List<Integer> listaDługości = imionaNazwiska.stream()
                .map((imięNazwisko) -> imięNazwisko.split(" ")[1])
                .map((nazwisko) -> nazwisko.length())
                .filter((i) -> i > 7)
                .collect(Collectors.toList());;

        System.out.println(listaDługości);

        List<String> imiona = List.of("Barnaba Bronisław Son-Goku",
                "Son-Gohan Dalailama Piccolo",
                "Spongebob Kuba Leo");
        Stream<String> strumieńImion = imiona.stream().flatMap((i) -> {
            String[] rozdzielone = i.split(" ");
            return Arrays.stream(rozdzielone);
        });
        strumieńImion.forEach(System.out::println);

        System.out.println(listaDługości);

        List<List<String>> listaList = List.of(
                List.of("Barnaba", "Bronisław"),
                List.of(),
                List.of("Grzegorz", "Mateusz", "Ania"),
                List.of("Monika", "Agata", "Antoni"),
                List.of("Macierewicz")
        );
        List<String> listaSpłaszczona = listaList
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(listaSpłaszczona);
    }

}
