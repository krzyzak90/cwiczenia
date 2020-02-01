package tech.barny.sda.programowanie1;

public class Wezel {
    private String zawartosc;

    public String getZawartosc() {
        return zawartosc;
    }

    public void setZawartosc(String zawartosc) {
        this.zawartosc = zawartosc;
    }

    public Wezel getNastepnyWezel() {
        return nastepnyWezel;
    }

    public void setNastepnyWezel(Wezel nastepnyWezel) {
        this.nastepnyWezel = nastepnyWezel;
    }

    private Wezel nastepnyWezel;

}
