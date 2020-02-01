package tech.barny.sda.programowanie1;

public class Węzeł<T> {
    private T zawartość;
    private Węzeł<T> poprzedniWęzeł;
    private Węzeł<T> następnyWęzeł;



    public Węzeł(T zawartość, Węzeł<T> poprzedniWęzeł, Węzeł<T> następnyWęzeł) {
        this.zawartość = zawartość;
        this.poprzedniWęzeł = poprzedniWęzeł;
        this.następnyWęzeł = następnyWęzeł;
    }

    public T getZawartość() {
        return zawartość;
    }

    public void setZawartość(T zawartość) {
        this.zawartość = zawartość;
    }

    public Węzeł<T> getNastępnyWęzeł() {
        return następnyWęzeł;
    }

    public void setNastępnyWęzeł(Węzeł<T> następnyWęzeł) {
        this.następnyWęzeł = następnyWęzeł;
    }

    public Węzeł<T> getPoprzedniWęzeł() {
        return poprzedniWęzeł;
    }

    public void setPoprzedniWęzeł(Węzeł<T> poprzedniWęzeł) {
        this.poprzedniWęzeł = poprzedniWęzeł;
    }
}
