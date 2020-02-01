package tech.barny.sda.programowanie1;

public class Węzeł {
    private String zawartość;
    private Węzeł poprzedniWęzeł;
    private Węzeł następnyWęzeł;



    public Węzeł(String zawartość, Węzeł poprzedniWęzeł, Węzeł następnyWęzeł) {
        this.zawartość = zawartość;
        this.poprzedniWęzeł = poprzedniWęzeł;
        this.następnyWęzeł = następnyWęzeł;
    }

    public String getZawartość() {
        return zawartość;
    }

    public void setZawartość(String zawartość) {
        this.zawartość = zawartość;
    }

    public Węzeł getNastępnyWęzeł() {
        return następnyWęzeł;
    }

    public void setNastępnyWęzeł(Węzeł następnyWęzeł) {
        this.następnyWęzeł = następnyWęzeł;
    }

    public Węzeł getPoprzedniWęzeł() {
        return poprzedniWęzeł;
    }

    public void setPoprzedniWęzeł(Węzeł poprzedniWęzeł) {
        this.poprzedniWęzeł = poprzedniWęzeł;
    }
}