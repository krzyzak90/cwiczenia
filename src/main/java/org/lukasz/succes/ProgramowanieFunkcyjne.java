package org.lukasz.succes;

import java.util.Scanner;

public class ProgramowanieFunkcyjne {
    public static void main(String[] args) {

        String next = new Scanner(System.in).next();
        String txt = "ABCD";
        OperatorBinarny operator;
        if (next.equals("+")) {
            operator = (int a, int b) -> {
                System.out.printf("Dodajemy %d i %d%n", a, b);
                return a + b;
            };
        } else if (next.equals("-")) {
            operator = (a, b) -> a - b;

        } else {
            throw new RuntimeException();
        }
        uruchom(operator);

    }

    public static void uruchom(OperatorBinarny operator) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = operator.wykonaj(a, b);
        System.out.println(i);


    }

}
