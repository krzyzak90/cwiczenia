package tech.barny.sda.programowanie1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie2Test {

    @Test
    void odwroconaTab() {
        int[] a = {1,4,6,5,19};
        int [] b = {4,1,5,6,19};
        int[] wynik = new Zadanie2().reverseTab(a);
        assertArrayEquals(wynik,b);
    }
}