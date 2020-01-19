package tech.barny.sda.programowanie1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie1Test {


    @Test
    void odwroconaTab() {
        int[] a = {1,4,6};
        int [] b = {6,4,1};
        int[] wynik = new Zadanie1().reverseTab(a);
        assertArrayEquals(b,wynik);
    }
}