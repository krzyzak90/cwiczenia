package tech.barny.sda.programowanie1;

public class WęzełDrzewaBinarnego <T> {
    private T zawartość;
    private Węzeł<T> leweDziecko;
    private Węzeł<T> praweDziecko;
    public WęzełDrzewaBinarnego(T zawartość, Węzeł<T> leweDziecko, Węzeł<T> praweDziecko) {
        this.zawartość = zawartość;
        this.leweDziecko = leweDziecko;
        this.praweDziecko = praweDziecko;
    }
    public T getZawartość() {
        return zawartość;
    }
    public void setZawartość(T zawartość) {
        this.zawartość = zawartość;
    }
    public Węzeł<T> getLeweDziecko() {
        return leweDziecko;
    }
    public void setLeweDziecko(Węzeł<T> leweDziecko) {
        this.leweDziecko = leweDziecko;
    }
    public Węzeł<T> getPraweDziecko() {
        return praweDziecko;
    }
    public void setPraweDziecko(Węzeł<T> praweDziecko) {
        this.praweDziecko = praweDziecko;
    }

}
