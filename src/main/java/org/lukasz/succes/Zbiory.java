package org.lukasz.succes;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Zbiory {
    public static void main(String[] args) {
        Set<String> ludzie = new HashSet<>();
        ludzie.add("Dominika");
        ludzie.add("Stefan");
        ludzie.add("Leo");
        ludzie.add("Lukasz");
        ludzie.add("Zenob");
        ludzie.add("Justyna");

        ludzie.add("Stefan");
//        System.out.println(ludzie);
        Iterator<String> iterator = ludzie.iterator();
        while (iterator.hasNext()) {
            String osoba = iterator.next();
//            System.out.println(osoba);

        }
        boolean stefan = ludzie.contains("Stefan");
//        System.out.println(stefan);


//        for (String osoba : ludzie) {
//            System.out.println(osoba);
//
//        }

        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque elit dui, ultrices non elementum eu, tincidunt eu sem. Aenean eget tortor sem. Nulla facilisi. Aenean accumsan faucibus pellentesque. Morbi fringilla ut lectus molestie laoreet. Integer semper porttitor convallis. Proin pellentesque nec eros ac tempus. Mauris a erat a mauris ornare feugiat a eget felis. In condimentum posuere nisi non cursus. Aliquam faucibus est orci, a maximus dui commodo eleifend.\n" +
                "\n" +
                "In quis faucibus leo. Integer aliquam quis est quis faucibus. Integer laoreet leo in nisi tempor cursus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nam feugiat orci vel massa luctus, ut tincidunt dui posuere. Nam vehicula mattis dolor vel placerat. Aliquam sodales malesuada tortor.\n" +
                "\n" +
                "Maecenas pharetra dolor quis molestie efficitur. Vestibulum ac nisl orci. Suspendisse placerat lectus ornare arcu tincidunt, sit amet elementum tellus eleifend. Maecenas lectus sem, accumsan eu molestie id, tempor at est. Nam egestas, enim ac porttitor vehicula, nisi elit maximus ante, ac rhoncus diam mauris eget nisi. Nunc vitae ultrices libero. In vitae magna enim. Curabitur non pharetra erat. Mauris metus orci, dapibus ac viverra vel, posuere blandit tellus. Quisque augue urna, lobortis nec rhoncus at, rhoncus posuere quam. Praesent vehicula sapien massa, eget tempus quam interdum sed. Vestibulum sollicitudin massa at lectus condimentum lobortis. Morbi sit amet ante sollicitudin, pretium purus ac, auctor massa. Pellentesque laoreet id metus ut consequat.\n" +
                "\n" +
                "Cras est metus, dictum at imperdiet in, bibendum non quam. Proin id enim non massa posuere consequat vel in tellus. Aliquam tempus elit a elit ultricies, vel hendrerit lectus gravida. Aliquam tristique, est vitae fringilla egestas, lorem mauris tincidunt ligula, eu tincidunt ante metus in mi. Nam neque libero, feugiat et tristique eu, consectetur et justo. Aliquam dictum diam at lobortis cursus. Aliquam pharetra ipsum eros, vitae ullamcorper eros tincidunt at. Praesent venenatis pellentesque sem, vitae scelerisque mi suscipit at. Donec cursus scelerisque purus ut dictum. Donec rutrum rutrum elit, a eleifend eros placerat et. Praesent vel leo a ante pharetra interdum. Nam odio tellus, cursus id turpis at, finibus venenatis justo. Donec quis libero nulla.\n" +
                "\n" +
                "Ut consectetur tellus non nibh molestie, quis tincidunt turpis mollis. Nullam nisl dolor, egestas blandit vulputate non, dictum ac orci. Nam posuere nulla id leo iaculis, volutpat tincidunt augue fermentum. Nam condimentum quis eros vitae vulputate. Pellentesque id nisi scelerisque, pulvinar elit nec, tincidunt urna. Mauris commodo ullamcorper tellus et maximus. Donec lacinia posuere elit euismod feugiat. Proin aliquet, nibh a lobortis luctus, enim orci blandit erat, in egestas sem libero vulputate turpis. In vitae euismod justo.";

//        Set<String> unikat = new HashSet<>();
//        String[] tablicaLorem = lorem.split("\\W+");
//
//        int n = tablicaLorem.length;
//        for (int i=0; i<n;i++){
//            unikat.add(tablicaLorem[i]);
//        }
//        System.out.println(unikat.size());

        Map<Character, Integer> licznikZnakow = new HashMap<>();
        for (char znak : lorem.toCharArray()) {
            if (!Character.isWhitespace(znak)) {
                char znakZMalej = Character.toLowerCase(znak);
                Integer licznik = licznikZnakow.getOrDefault(znakZMalej, 0);
                licznikZnakow.put(znakZMalej, licznik + 1);


            }

        }
        System.out.println(licznikZnakow);


        char[] c = lorem.toCharArray();
        HashSet<Character> znaki = new HashSet<>();
        for (int i = 0; i < c.length; i++) {
            znaki.add(c[i]);
//            znaki.add(Character.toLowerCase( c[i]));
        }
        System.out.println(znaki.size());
        System.out.println(znaki);


    }

}
