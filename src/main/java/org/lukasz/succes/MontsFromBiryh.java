package org.lukasz.succes;

import static java.lang.System.*;

public class MontsFromBiryh {

    public static void main(String[] args) {
        int d = monthsFromBirth(1991, 1, 2019, 11);
        out.println(d);
        printSomething();

    }


    public static int monthsFromBirth(int y0, int m0, int y, int m) {
        return ((y - y0) * 12) + m - m0;
    }

    public static int monthsInYear() {
        return 12;
    }

    public static void printSomething() {
        out.println("Lubie brokuły");
        out.println("Jestem pilkarzem");
    }


}