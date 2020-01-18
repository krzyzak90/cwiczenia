package org.lukasz.succes;

public class ForEach {
    public static void main(String[] args) {
        String[] dni = new String[]{
                "PONIEDZIALEK",
                "WTOREK",
                "SRODA",
                "CZWARTEK",
                "PIATEK",
                "SOBOTA",
                "NIEDZIELA"
        };
        for (String dniTygodnia : dni) {
            System.out.println("Dni Tygodnia : " + dniTygodnia);
        }
    }
}

