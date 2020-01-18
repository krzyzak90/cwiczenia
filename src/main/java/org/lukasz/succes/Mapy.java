package org.lukasz.succes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mapy {

    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Adam", 34);
        Integer wartoscAdam = mapa.get("Adam");
        System.out.println(wartoscAdam);
        Integer borys = mapa.get("Borys");

        Integer wartoscBorys = mapa.getOrDefault("Borys", 0);
        System.out.println(wartoscBorys);
        mapa.put("Stach", 27);


        Set<Map.Entry<String, Integer>> entries = mapa.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, Integer> wpis : entries) {

        }

//        Map<String, List<Integer>>mapa2= new HashMap<>();


    }
}
