package tech.barny.sda.programowanie1;

public interface Kolejka <T>{

    void addLast (T el);

    T removeFirst();

    boolean isEmpty();

}
