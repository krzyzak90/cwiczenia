package binarne;


public class Węzeł<T> {
    private T zawartość;
    private Węzeł<T> lewy;
    private Węzeł<T> prawy;

    public Węzeł(T zawartość, Węzeł<T> lewy, Węzeł<T> prawy) {
        this.zawartość = zawartość;
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public T getZawartość() {
        return zawartość;
    }

    public void setZawartość(T zawartość) {
        this.zawartość = zawartość;
    }

    public Węzeł<T> getLewy() {
        return lewy;
    }

    public void setLewy(Węzeł<T> lewy) {
        this.lewy = lewy;
    }

    public Węzeł<T> getPrawy() {
        return prawy;
    }

    public void setPrawy(Węzeł<T> prawy) {
        this.prawy = prawy;
    }

}
