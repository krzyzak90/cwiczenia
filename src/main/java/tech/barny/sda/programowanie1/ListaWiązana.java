package tech.barny.sda.programowanie1;

public class ListaWiązana {

    private Węzeł pierwszyWęzeł;
    private Węzeł ostatniWęzeł;
    private int count;

    public void add(String el) {
        addLast(el);
    }

    public void addLast(String el) {
        Węzeł węzeł = new Węzeł(el, null, null);

        if (pierwszyWęzeł == null) {
            this.pierwszyWęzeł = węzeł;
            this.ostatniWęzeł = węzeł;
        } else {
            ostatniWęzeł.setNastępnyWęzeł(węzeł);
            węzeł.setPoprzedniWęzeł(węzeł);
            ostatniWęzeł = węzeł;
        }
        count++;
    }

    public void addFirst(String el) {
        Węzeł węzeł = new Węzeł(el, null, null);
        if (pierwszyWęzeł == null) {
            this.pierwszyWęzeł = węzeł;
            this.ostatniWęzeł = węzeł;
        } else {
            węzeł.setNastępnyWęzeł(pierwszyWęzeł);
            pierwszyWęzeł.setPoprzedniWęzeł(węzeł);
            pierwszyWęzeł = węzeł;
        }
        count++;
    }

    public void add(int index, String el) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(el);
        } else if (index == count) {
            addLast(el);
        } else {
            Węzeł poprzedniWęzeł = pierwszyWęzeł;
            for (int i = 0; i < index - 1; i++) {
                poprzedniWęzeł = poprzedniWęzeł.getNastępnyWęzeł();
            }
            Węzeł następny = poprzedniWęzeł.getNastępnyWęzeł();
            Węzeł węzeł = new Węzeł(el, poprzedniWęzeł, następny);
            poprzedniWęzeł.setNastępnyWęzeł(węzeł);
            następny.setPoprzedniWęzeł(węzeł);
            count++;
        }
    }

    public String removeFirst() {
        if (pierwszyWęzeł == null) {
            throw new IndexOutOfBoundsException();
        }
        if (count == 1) {
            Węzeł węzeł = pierwszyWęzeł;
            pierwszyWęzeł = null;
            ostatniWęzeł = null;
            count--;
            return węzeł.getZawartość();
        } else {
            Węzeł węzeł = pierwszyWęzeł;
            Węzeł nowyPierwszy = pierwszyWęzeł.getNastępnyWęzeł();
            nowyPierwszy.setPoprzedniWęzeł(null);
            pierwszyWęzeł = nowyPierwszy;

            count--;
            return węzeł.getZawartość();
        }
    }

    public String removeLast() {
        if (count == 0) {
            throw new IndexOutOfBoundsException();
        } else if (count == 1) {
            Węzeł węzeł = this.pierwszyWęzeł;
            pierwszyWęzeł = null;
            ostatniWęzeł = null;
            count--;
            return węzeł.getZawartość();
        } else {
            Węzeł węzeł = this.ostatniWęzeł;
            Węzeł poprzedni = węzeł.getPoprzedniWęzeł();
            poprzedni.setNastępnyWęzeł(null);
            count--;
            return węzeł.getZawartość();
        }
    }

    public String remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return removeFirst();
        } else if (index == count - 1) {
            return removeLast();
        } else {
            Węzeł poprzedni = pierwszyWęzeł;
            for (int i = 0; i < index - 1; i++) {
                poprzedni = poprzedni.getNastępnyWęzeł();
            }
            Węzeł usuwany = poprzedni.getNastępnyWęzeł();
            Węzeł następny = usuwany.getNastępnyWęzeł();
            poprzedni.setNastępnyWęzeł(następny);
            następny.setPoprzedniWęzeł(poprzedni);
            count--;
            return usuwany.getZawartość();
        }
    }

    public String getFirst() {
        return pierwszyWęzeł.getZawartość();
    }

    public String getLast() {
        return ostatniWęzeł.getZawartość();
    }

    public String get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }

        Węzeł obecnyWęzeł = pierwszyWęzeł;
        for (int i = 0; i < index; i++) {
            obecnyWęzeł = pierwszyWęzeł.getNastępnyWęzeł();
        }
        return obecnyWęzeł.getZawartość();
    }

    public int size() {
        return count;
    }

}
