package binarne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {

    @Test
    void jestObecne1() {
        BST bst = new BST();
        bst.add(1);
        boolean faktycznyWynik = bst.jestObecne(1);
        Assertions.assertTrue(faktycznyWynik);
    }

    @Test
    void jestObecne2() {
        BST bst = new BST();
        bst.add(20);
        bst.add(10);
        bst.add(30);
        bst.add(15);
        bst.add(7);
        bst.add(21);
        bst.add(80);

        boolean faktycznyWynik = bst.jestObecne(21);
        Assertions.assertTrue(faktycznyWynik);
    }

    @Test
    void jestObecneRek1() {
        BST bst = new BST();
        bst.add(1);
        boolean faktycznyWynik = bst.jestObecne(1);
        Assertions.assertTrue(faktycznyWynik);
    }

    @Test
    void jestObecneRek2() {
        BST bst = new BST();
        bst.add(20);
        bst.add(10);
        bst.add(30);
        bst.add(15);
        bst.add(7);
        bst.add(21);
        bst.add(80);

        boolean faktycznyWynik = bst.jestObecne(21);
        Assertions.assertTrue(faktycznyWynik);
    }

    @Test
    void jestNieobecne1() {
        BST bst = new BST();
        boolean faktycznyWynik = bst.jestObecne(0);
        Assertions.assertFalse(faktycznyWynik);
    }
    @Test
    void jestNieobecneRek1() {
        BST bst = new BST();
        bst.add(1);
        boolean faktycznyWynik = bst.jestObecne(2);
        Assertions.assertFalse(faktycznyWynik);
    }

    @Test
    void usuń() {
        BST bst = new BST();
        bst.add(20);
        bst.add(10);
        bst.add(30);
        bst.add(15);
        bst.add(7);
        bst.add(21);
        bst.add(80);
        bst.usuń(20);
        boolean obecny = bst.jestObecne(20);
        Assertions.assertFalse(obecny);
    }

}