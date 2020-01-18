package org.lukasz.succes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Kalendarz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Wpisz miesiąc i rok: ");
        str = sc.nextLine();
        String[] inputMatrix = str.split(" ");
        int mm = Integer.parseInt(inputMatrix[0]);
        int rr = Integer.parseInt(inputMatrix[1]);
        LocalDate kalendarz = LocalDate.of(rr, mm, 1);
        LocalDate kalendarz2 = kalendarz.plusMonths(1);
        LocalDate kalendarz3 = kalendarz2.plusDays(-1);
        DayOfWeek dzienTyg = kalendarz.getDayOfWeek();
        int nrDzienTyg = dzienTyg.getValue();
        String[] tablica = new String[kalendarz3.getDayOfMonth() + nrDzienTyg];
        int n = 1;
        System.out.print("PN WT SR CZ PT SO ND");
        for (int x = 0; x < kalendarz3.getDayOfMonth() + nrDzienTyg; x++) {
            if (x < nrDzienTyg) {
                tablica[x] = "  ";
            } else {
                if (n < 10) {
                    tablica[x] = "0" + n++;
                } else {
                    tablica[x] = "" + n++;
                }
            }
        }
        for (int x = 0; x < kalendarz3.getDayOfMonth() + nrDzienTyg; x++) {
            System.out.print(tablica[x] + " ");
            if (x % 7 == 0) {
                System.out.println("");
            }
        }
    }
}
