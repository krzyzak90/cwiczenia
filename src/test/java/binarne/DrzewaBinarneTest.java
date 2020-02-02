package binarne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrzewaBinarneTest {

    @Test
    void zsumuj() {
        Węzeł<Integer> e = new Węzeł<>(24, null, null);
        Węzeł<Integer> d = new Węzeł<>(66, null, null);
        Węzeł<Integer> c = new Węzeł<>(8, null, null);
        Węzeł<Integer> b = new Węzeł<>(100, d, e);
        Węzeł<Integer> a = new Węzeł<>(1, c, null);
        Węzeł<Integer> korzeń = new Węzeł<>(50, a, b);

        int sumaFaktyczna = new DrzewaBinarne().zsumuj(korzeń);
        int sumaOczekiwany = 24 + 66 + 8 + 100 + 1 + 50;

        Assertions.assertEquals(sumaOczekiwany, sumaFaktyczna);
    }

    @Test
    void zsumujRekurencyjnie() {
        Węzeł<Integer> e = new Węzeł<>(24, null, null);
        Węzeł<Integer> d = new Węzeł<>(66, null, null);
        Węzeł<Integer> c = new Węzeł<>(8, null, null);
        Węzeł<Integer> b = new Węzeł<>(100, d, e);
        Węzeł<Integer> a = new Węzeł<>(1, c, null);
        Węzeł<Integer> korzeń = new Węzeł<>(50, a, b);

        int sumaFaktyczna = new DrzewaBinarne().zsumujRekurencyjnie(korzeń);
        int sumaOczekiwany = 24 + 66 + 8 + 100 + 1 + 50;

        Assertions.assertEquals(sumaOczekiwany, sumaFaktyczna);
    }

    @Test
    void ilośćWęzłów() {
        Węzeł<Integer> e = new Węzeł<>(24, null, null);
        Węzeł<Integer> d = new Węzeł<>(66, null, null);
        Węzeł<Integer> c = new Węzeł<>(8, null, null);
        Węzeł<Integer> b = new Węzeł<>(100, d, e);
        Węzeł<Integer> a = new Węzeł<>(1, c, null);
        Węzeł<Integer> korzeń = new Węzeł<>(50, a, b);

        int ilośćFaktyczna = new DrzewaBinarne().ilośćWęzłów(korzeń);
        int ilośćOczekiwana = 6;

        Assertions.assertEquals(ilośćOczekiwana, ilośćFaktyczna);
    }

    @Test
    void ilośćWęzłówRekurencyjnie() {
        Węzeł<Integer> e = new Węzeł<>(24, null, null);
        Węzeł<Integer> d = new Węzeł<>(66, null, null);
        Węzeł<Integer> c = new Węzeł<>(8, null, null);
        Węzeł<Integer> b = new Węzeł<>(100, d, e);
        Węzeł<Integer> a = new Węzeł<>(1, c, null);
        Węzeł<Integer> korzeń = new Węzeł<>(50, a, b);

        int ilośćFaktyczna = new DrzewaBinarne().ilośćWęzłówRekurencyjnie(korzeń);
        int ilośćOczekiwana = 6;

        Assertions.assertEquals(ilośćOczekiwana, ilośćFaktyczna);
    }

    @Test
    void maksimum() {
        Węzeł<Integer> e = new Węzeł<>(24, null, null);
        Węzeł<Integer> d = new Węzeł<>(66, null, null);
        Węzeł<Integer> c = new Węzeł<>(8, null, null);
        Węzeł<Integer> b = new Węzeł<>(100, d, e);
        Węzeł<Integer> a = new Węzeł<>(1, c, null);
        Węzeł<Integer> korzeń = new Węzeł<>(50, a, b);

        int wynikFaktyczny = new DrzewaBinarne().maksimum(korzeń);
        int wynikOczekiwany = 100;

        Assertions.assertEquals(wynikOczekiwany, wynikFaktyczny);
    }

    @Test
    void maksimumRekurencyjnie() {
        Węzeł<Integer> e = new Węzeł<>(24, null, null);
        Węzeł<Integer> d = new Węzeł<>(66, null, null);
        Węzeł<Integer> c = new Węzeł<>(8, null, null);
        Węzeł<Integer> b = new Węzeł<>(100, d, e);
        Węzeł<Integer> a = new Węzeł<>(1, c, null);
        Węzeł<Integer> korzeń = new Węzeł<>(50, a, b);

        int wynikFaktyczny = new DrzewaBinarne().maksimumRekurencyjnie(korzeń);
        int wynikOczekiwany = 100;

        Assertions.assertEquals(wynikOczekiwany, wynikFaktyczny);
    }

    @Test
    void głębokośćRekurencyjnie() {
        Węzeł<Integer> f = new Węzeł<>(99, null, null);
        Węzeł<Integer> e = new Węzeł<>(24, null, null);
        Węzeł<Integer> d = new Węzeł<>(66, null, null);
        Węzeł<Integer> c = new Węzeł<>(8, f, null);
        Węzeł<Integer> b = new Węzeł<>(100, d, e);
        Węzeł<Integer> a = new Węzeł<>(1, c, null);
        Węzeł<Integer> korzeń = new Węzeł<>(50, a, b);

        int wynikFaktyczny = new DrzewaBinarne().głębokośćRekurencyjnie(korzeń);
        int wynikOczekiwany = 3;

        Assertions.assertEquals(wynikOczekiwany, wynikFaktyczny);
    }

    @Test
    void głębokośćRekurencyjnieSamKorzeń() {
        Węzeł<Integer> korzeń = new Węzeł<>(50, null, null);

        int wynikFaktyczny = new DrzewaBinarne().głębokośćRekurencyjnie(korzeń);
        int wynikOczekiwany = 0;

        Assertions.assertEquals(wynikOczekiwany, wynikFaktyczny);
    }

    @Test
    void głębokość() {
        Węzeł<Integer> f = new Węzeł<>(99, null, null);
        Węzeł<Integer> e = new Węzeł<>(24, null, null);
        Węzeł<Integer> d = new Węzeł<>(66, null, null);
        Węzeł<Integer> c = new Węzeł<>(8, f, null);
        Węzeł<Integer> b = new Węzeł<>(100, d, e);
        Węzeł<Integer> a = new Węzeł<>(1, c, null);
        Węzeł<Integer> korzeń = new Węzeł<>(50, a, b);

        int wynikFaktyczny = new DrzewaBinarne().głębokość(korzeń);
        int wynikOczekiwany = 3;

        Assertions.assertEquals(wynikOczekiwany, wynikFaktyczny);
    }

    @Test
    void głębokośćSamKorzeń() {
        Węzeł<Integer> korzeń = new Węzeł<>(50, null, null);

        int wynikFaktyczny = new DrzewaBinarne().głębokość(korzeń);
        int wynikOczekiwany = 0;

        Assertions.assertEquals(wynikOczekiwany, wynikFaktyczny);
    }

}