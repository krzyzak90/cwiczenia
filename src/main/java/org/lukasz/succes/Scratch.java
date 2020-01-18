package org.lukasz.succes;

import java.util.ArrayList;
import java.util.List;

class Scratch {

    public static void main(String[] args) {

        List<String> imiona = new ArrayList<>();
        imiona.add("Robert");
        imiona.add("Damian");
        imiona.add("Leo");
        imiona.add("Justyna");
        imiona.add("Arek");
        System.out.println(imiona);
        String leo = imiona.get(2);
        System.out.println(leo);
        imiona.add(1,"Kasia");
        System.out.println(imiona);
        String justyna = imiona.get(4);
        System.out.println(justyna);
        int size = imiona.size();
        System.out.println(size);
        imiona.remove(size - 1);
        boolean zawieraArek = imiona.contains("Arek");
        System.out.println(zawieraArek);
        boolean usuneloRoberta = imiona.remove("Robert");
        System.out.println(usuneloRoberta);
        System.out.println(imiona);
        imiona.set(0, "Teo");
        System.out.println(imiona);
        imiona.addAll(imiona);
        System.out.println(imiona);
        boolean containsAll = imiona.containsAll(imiona);
        System.out.println(containsAll);
        imiona.sort(null);
        System.out.println(imiona);
        imiona.removeAll(imiona);
        System.out.println(imiona);

    }

}
