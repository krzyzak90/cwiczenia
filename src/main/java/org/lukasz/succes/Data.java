package org.lukasz.succes;

public class Data {
    int rok;
    int miesiac;
    int dzien;

    public int monthsFromBirth(int y, int m) {
        if (((y - rok) * 12) + m - miesiac > 100) {
            System.out.println("Minęło przynajmniej sto miesięcy!");
        }
        return ((y - rok) * 12) + m - miesiac;
    }




    public Data(int rok, int miesiac, int dzien) {
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
    }
}
