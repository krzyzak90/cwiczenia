package tech.barny.sda.programowanie1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DodawaczTest {

    @Test
    void powinienDodaćLiczby() {
        int wynik = new Dodawacz().dodaj(2, 2);

        assertEquals(wynik, 4);
    }

}