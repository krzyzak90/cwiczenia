package binarne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortowanieTest {
    @Test
    void jestPosortowane() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};

        boolean wynik = Sortowanie.jestPosortowane(arr);
        Assertions.assertTrue(wynik);
    }

    @Test
    void nieJestPosortowane() {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};

        boolean wynik = Sortowanie.jestPosortowane(arr);
        Assertions.assertFalse(wynik);
    }

}