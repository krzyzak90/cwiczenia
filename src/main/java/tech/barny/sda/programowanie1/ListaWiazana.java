package tech.barny.sda.programowanie1;

public class ListaWiazana {

    private Wezel pierwszyWezel;
    private Wezel ostatniWezel;
    private int count;

    public void add(String el) {
        Wezel wezel = new Wezel();

        if (pierwszyWezel == null) {
            this.pierwszyWezel = wezel;
            this.ostatniWezel = wezel;

        } else {
            ostatniWezel.setNastepnyWezel(wezel);
            ostatniWezel = wezel;
        }

    }

    public int size() {
        Wezel obecnyWezel = pierwszyWezel;
        if (obecnyWezel == null) {
            return 0;
        }
        int count = 1;
        while (obecnyWezel.getNastepnyWezel() != null) {
            obecnyWezel = obecnyWezel.getNastepnyWezel();
            count++;
        }
        return count;

    }

}

