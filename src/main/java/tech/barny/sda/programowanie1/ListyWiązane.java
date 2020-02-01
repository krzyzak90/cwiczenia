package tech.barny.sda.programowanie1;

public class ListyWiązane {

    public static void main(String[] args) {

//        drukujStosem(10);
        drukujKolejką(10);

    }

    public static void drukujStosem(int i) {
        Stos<Integer> stos = new ListaWiązana<>();
        stos.add(i);
        while (!stos.isEmpty()) {
            Integer x = stos.removeLast();
            System.out.println(x);
            if (x != 1) {
                int d = x / 2;
                if (x % 2 != 0) {
                    stos.add(1);
                }
                stos.add(d);
                stos.add(d);
            }
        }

    }

    public static void drukujKolejką(int i) {
        Kolejka<Integer> kolejka = new ListaWiązana<>();
        kolejka.addLast(i);
        while (!kolejka.isEmpty()) {
            Integer x = kolejka.removeFirst();
            System.out.println(x);
            if (x != 1) {
                int d = x / 2;
                kolejka.addLast(d);
                kolejka.addLast(d);
                if (x % 2 != 0) {
                    kolejka.addLast(1);
                }
            }
        }
    }
}
