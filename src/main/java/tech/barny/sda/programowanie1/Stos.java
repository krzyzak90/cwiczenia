package tech.barny.sda.programowanie1;

public interface Stos <T>{

    void add (T el);

    T removeLast();

    boolean isEmpty();

}
