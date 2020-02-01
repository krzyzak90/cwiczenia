package tech.barny.sda.programowanie1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie7Test {

    @Test
    void testcase1() {
        int i = 88888888;
        int actual = new Zadanie7().wsadź5(i);
        int expected = 888888885;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testcase2() {
        int i = -88888888;
        int actual = new Zadanie7().wsadź5(i);
        int expected = -588888888;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testcase3() {
        int i = 0;
        int actual = new Zadanie7().wsadź5(i);
        int expected = 50;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testcase4() {
        int i = 6712;
        int actual = new Zadanie7().wsadź5(i);
        int expected = 67512;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testcase5() {
        int i = 4281;
        int actual = new Zadanie7().wsadź5(i);
        int expected = 54281;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testcase6() {
        int i = -6712;
        int actual = new Zadanie7().wsadź5(i);
        int expected = -56712;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testcase7() {
        int i = -4281;
        int actual = new Zadanie7().wsadź5(i);
        int expected = -42581;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testcase8() {
        int i = -4231;
        int actual = new Zadanie7().wsadź5(i);
        int expected = -42315;
        Assertions.assertEquals(expected, actual);
    }
}