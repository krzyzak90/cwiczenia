package binarne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiczbyPierwszeTest {

    @Test
    void gcd_1() {

        int a = 10;
        int b = 20;

        int gcd = new LiczbyPierwsze().gcd_1(a, b);
        Assertions.assertEquals(10, gcd);
    }

    @Test
    void gcd_2() {

        int a = 66;
        int b = 44;

        int gcd = LiczbyPierwsze.gcd_2(a, b);
        Assertions.assertEquals(22, gcd);
    }

    @Test
    void gcd_2_2() {

        int a = 66;
        int b = 44;

        int gcd = LiczbyPierwsze.gcd_2_2(a, b);
        Assertions.assertEquals(22, gcd);
    }

    @Test
    void gcd_3_2() {

        int a = 66;
        int b = 44;

        int gcd = LiczbyPierwsze.gcd_3_2(a, b);
        Assertions.assertEquals(22, gcd);
    }
}