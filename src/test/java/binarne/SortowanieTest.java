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

    @Test
    void bubbleSort() {
        int[] arr = {7, 6, 5, 4, 3, 2, 1, 0};
        Sortowanie.bubbleSort(arr);

        int[] oczekiwany = {0, 1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(oczekiwany, arr);
    }

    @Test
    void bubbleSort2() {
        int[] arr = {7, 6, 5, 4, 3, 2, 1, 0};
        Sortowanie.bubbleSort2(arr);

        int[] oczekiwany = {0, 1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(oczekiwany, arr);
    }

    @Test
    void bubbleSort3() {
        int[] arr = {7, 6, 5, 4, 3, 2, 1, 0};
        Sortowanie.bubbleSort3(arr);

        int[] oczekiwany = {0, 1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(oczekiwany, arr);
    }

    @Test
    void bubbleSort4() {
        int[] arr = {7, 6, 5, 4, 3, 2, 1, 0};
        Sortowanie.bubbleSort4(arr);

        int[] oczekiwany = {0, 1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(oczekiwany, arr);
    }

    @Test
    void quickSort() {
        int[] arr = {7, 6, 5, 4, 3, 2, 1, 0};
        Sortowanie.quickSort(arr);

        int[] oczekiwany = {0, 1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(oczekiwany, arr);
    }

    @Test
    void quickSort2() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        Sortowanie.quickSort(arr);

        int[] oczekiwany = {0, 1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(oczekiwany, arr);
    }

    @Test
    void quickSort3() {
        int[] arr = {0, 1, 4, 6, 7, 5, 3, 2};
        Sortowanie.quickSort(arr);

        int[] oczekiwany = {0, 1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(oczekiwany, arr);
    }

}