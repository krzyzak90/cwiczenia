package org.lukasz.succes;

import javax.print.DocFlavor;

public class Tablice {
    public static void main(String[] args) {
        int [] tablica = new int[6];
        String[] slowa= new String[3];
        System.out.println(slowa[2]);


        tablica[0] = 2;
        tablica[1] = 4;
        tablica[2] = 8;
        tablica[3] = 16;
        tablica[4] = 32;
        tablica[5] = 64;

        System.out.println(tablica[3]);
        int i = tablica[2];
//        int x=3;
//        System.out.println(dni[x-2]);
        String[] dni = new String [] {
                "PONIEDZIALEK",
                "WTOREK",
                "SRODA",
                "CZWARTEK",
                "PIATEK",
                "SOBOTA",
                "NIEDZIELA"
        };
        int count = 0;
        while(count < dni.length) {
            System.out.println(dni[count]);
            count++;
            for (int c = 0; c < dni.length; c++) {
                System.out.println(dni[c]);
            }
            for (int c = dni.length - 1; c >= 0; c--){
                System.out.println(dni[c]);
            }
        }
        System.out.println("Petla zakonczna");

//        String[] bands = {"AC/DC","Metalica", "U2"};



        }
    }

