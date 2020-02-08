package binarne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WyszukiwanieBinarneTest {

    @Test
    void wyszukiwanieBinarne1() {

        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};

        int index = new WyszukiwanieBinarne().wyszukiwanieBinarne(arr, 1);

        Assertions.assertEquals(1, index);
    }

    @Test
    void wyszukiwanieBinarne2() {

        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};

        int index = new WyszukiwanieBinarne().wyszukiwanieBinarne(arr, 10);

        Assertions.assertEquals(10, index);
    }

    @Test
    void wyszukiwanieBinarne3() {

        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};

        int index = new WyszukiwanieBinarne().wyszukiwanieBinarne(arr, 6);

        Assertions.assertEquals(6, index);
    }

    @Test
    void wyszukiwanieBinarne4() {

        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};

        int index = new WyszukiwanieBinarne().wyszukiwanieBinarne(arr, 60);

        Assertions.assertEquals(-1, index);
    }

    @Test
    void wyszukiwanieBinarne5() {

        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};

        int index = new WyszukiwanieBinarne().wyszukiwanieBinarne(arr, -20);

        Assertions.assertEquals(-1, index);
    }

}