package tech.barny.sda.programowanie1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie3Test {

    @Test
    void odwroconaTab() {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int [] b = {4,6,8,10,12,14,16,18,9,10};
        int[] wynik = new Zadanie3().reverseTab(a);
        assertArrayEquals(b,wynik);
    }
}