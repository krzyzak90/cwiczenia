package tech.barny.sda.programowanie1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie6Test {
    @Test
    void odwroconaTab() {
        int[] a = {5, 3, 2, 8, 1, 4};
        int [] b = {1, 3, 2, 8, 5, 4};
        int[] wynik = new Zadanie6().sortuj(a);
        assertArrayEquals(wynik,b);
    }

}