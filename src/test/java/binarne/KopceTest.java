package binarne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KopceTest {

    @Test
    void jestKopcemMax() {
        int [] możeKopiec = {10,9,8,7,6,5,4};
        boolean wynik = new Kopce().jestKopcemMax(możeKopiec);
        Assertions.assertTrue(wynik);
    }
    @Test
    void nieJestKopcemMax() {
        int [] możeKopiec = {10,1,11,7,6,5,4};
        boolean wynik = new Kopce().jestKopcemMax(możeKopiec);
        Assertions.assertFalse(wynik);
    }


    @Test
    void jestMin() {
        int []innyKopiec = {1,2,3,4,5,6,7};
        boolean wynik2 = new Kopce().jestKopcemMin(innyKopiec);
        Assertions.assertTrue(wynik2);
    }

}