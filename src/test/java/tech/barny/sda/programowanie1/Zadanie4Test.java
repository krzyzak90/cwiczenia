package tech.barny.sda.programowanie1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie4Test {

    @Test
    void odwroconaTab() {
        int[] a = {1,2,3,8,9,10};
        int [] b = {8,9,10};
        int[] wynik = new Zadanie4().averageTab(a);
        assertArrayEquals(wynik,b);
    }

}