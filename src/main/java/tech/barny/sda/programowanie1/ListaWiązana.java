package tech.barny.sda.programowanie1;

public class ListaWiązana<T> implements Kolejka<T>, Stos<T> {

    private Węzeł<T> pierwszyWęzeł;
    private Węzeł<T> ostatniWęzeł;
    private int count;

    public void add(T el) {
        addLast(el);
    }

    public void addLast(T el) {
        Węzeł<T> węzeł = new Węzeł<>(el, null, null);

        if (pierwszyWęzeł == null) {
            this.pierwszyWęzeł = węzeł;
            this.ostatniWęzeł = węzeł;
        } else {
            ostatniWęzeł.setNastępnyWęzeł(węzeł);
            węzeł.setPoprzedniWęzeł(ostatniWęzeł);
            ostatniWęzeł = węzeł;
        }
        count++;
    }

    public void addFirst(T el) {
        Węzeł<T> węzeł = new Węzeł<>(el, null, null);
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

    public void add(int index, T el) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(el);
        } else if (index == count) {
            addLast(el);
        } else {
            Węzeł<T> poprzedniWęzeł = pierwszyWęzeł;
            for (int i = 0; i < index - 1; i++) {
                poprzedniWęzeł = poprzedniWęzeł.getNastępnyWęzeł();
            }
            Węzeł<T>następny = poprzedniWęzeł.getNastępnyWęzeł();
            Węzeł<T>węzeł = new Węzeł<>(el, poprzedniWęzeł, następny);
            poprzedniWęzeł.setNastępnyWęzeł(węzeł);
            następny.setPoprzedniWęzeł(węzeł);
            count++;
        }
    }

    public T removeFirst() {
        if (pierwszyWęzeł == null) {
            throw new IndexOutOfBoundsException();
        }
        if (count == 1) {
            Węzeł<T> węzeł = pierwszyWęzeł;
            pierwszyWęzeł = null;
            ostatniWęzeł = null;
            count--;
            return węzeł.getZawartość();
        } else {
            Węzeł<T> węzeł = pierwszyWęzeł;
            Węzeł<T> nowyPierwszy = pierwszyWęzeł.getNastępnyWęzeł();
            nowyPierwszy.setPoprzedniWęzeł(null);
            pierwszyWęzeł = nowyPierwszy;

            count--;
            return węzeł.getZawartość();
        }
    }

    public T removeLast() {
        if (count == 0) {
            throw new IndexOutOfBoundsException();
        } else if (count == 1) {
            Węzeł<T> węzeł = this.pierwszyWęzeł;
            pierwszyWęzeł = null;
            ostatniWęzeł = null;
            count--;
            return węzeł.getZawartość();
        } else {
            Węzeł<T> węzeł = this.ostatniWęzeł;
            Węzeł<T> poprzedni = węzeł.getPoprzedniWęzeł();
            poprzedni.setNastępnyWęzeł(null);
            this.ostatniWęzeł = poprzedni;
            count--;
            return węzeł.getZawartość();
        }
    }

    public T remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return removeFirst();
        } else if (index == count - 1) {
            return removeLast();
        } else {
            Węzeł<T>poprzedni = pierwszyWęzeł;
            for (int i = 0; i < index - 1; i++) {
                poprzedni = poprzedni.getNastępnyWęzeł();
            }
            Węzeł<T> usuwany = poprzedni.getNastępnyWęzeł();
            Węzeł<T> następny = usuwany.getNastępnyWęzeł();
            poprzedni.setNastępnyWęzeł(następny);
            następny.setPoprzedniWęzeł(poprzedni);
            count--;
            return usuwany.getZawartość();
        }
    }

    public T getFirst() {
        return pierwszyWęzeł.getZawartość();
    }

    public T getLast() {
        return ostatniWęzeł.getZawartość();
    }

    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }

        Węzeł<T> obecnyWęzeł = pierwszyWęzeł;
        for (int i = 0; i < index; i++) {
            obecnyWęzeł = pierwszyWęzeł.getNastępnyWęzeł();
        }
        return obecnyWęzeł.getZawartość();
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

}
