package tech.barny.sda.programowanie1;

public class Zadanie5 {

    public void choinka() {

        for (int i = 16, k = 0; i > 0 && k < 16; i--, k++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < k; j++) {
                System.out.print("*");

            }
        }
    }
}