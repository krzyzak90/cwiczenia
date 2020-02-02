package binarne;

import java.util.LinkedList;

public class DrzewaBinarne {

    public int zsumuj(Węzeł<Integer> węzeł) {
        LinkedList<Węzeł<Integer>> stos = new LinkedList<>();
        stos.push(węzeł);
        int suma = 0;
        while (!stos.isEmpty()) {
            Węzeł<Integer> obecny = stos.pop();

            suma += obecny.getZawartość();
            if (obecny.getLewy() != null) {
                stos.push(obecny.getLewy());
            }
            if (obecny.getPrawy() != null) {
                stos.push(obecny.getPrawy());
            }
        }
        return suma;
    }

    public int zsumujRekurencyjnie(Węzeł<Integer> węzeł) {
        if (węzeł == null) {
            return 0;
        }

        return węzeł.getZawartość() +
                zsumujRekurencyjnie(węzeł.getPrawy()) +
                zsumujRekurencyjnie(węzeł.getLewy());
    }

    public int ilośćWęzłów(Węzeł<Integer> węzeł) {
        LinkedList<Węzeł<Integer>> stos = new LinkedList<>();
        stos.push(węzeł);
        int suma = 0;
        while (!stos.isEmpty()) {
            Węzeł<Integer> obecny = stos.pop();
            suma++;
            if (obecny.getLewy() != null) {
                stos.push(obecny.getLewy());
            }
            if (obecny.getPrawy() != null) {
                stos.push(obecny.getPrawy());
            }
        }
        return suma;
    }

    public int ilośćWęzłówRekurencyjnie(Węzeł<Integer> węzeł) {
        if (węzeł == null) {
            return 0;
        }
        return 1
                + ilośćWęzłówRekurencyjnie(węzeł.getPrawy()) +
                ilośćWęzłówRekurencyjnie(węzeł.getLewy());
    }

    public int maksimum(Węzeł<Integer> węzeł) {
        LinkedList<Węzeł<Integer>> stos = new LinkedList<>();
        stos.push(węzeł);
        if (węzeł == null) {
            return 0;
        }
        int max = węzeł.getZawartość();
        while (!stos.isEmpty()) {
            Węzeł<Integer> obecny = stos.pop();
            if (obecny.getZawartość() > max) {
                max = obecny.getZawartość();
            }
            if (obecny.getLewy() != null) {
                stos.push(obecny.getLewy());
            }
            if (obecny.getPrawy() != null) {
                stos.push(obecny.getPrawy());
            }
        }
        return max;
    }

    public int maksimumRekurencyjnie(Węzeł<Integer> węzeł) {
        if (węzeł == null) {
            return 0;
        }
        int max = węzeł.getZawartość();
        int maxP = maksimumRekurencyjnie(węzeł.getPrawy());
        if (maxP > max) {
            max = maxP;
        }
        int maxL = maksimumRekurencyjnie(węzeł.getLewy());
        if (maxL > max) {
            max = maxL;
        }
        return max;
    }

    public int głębokośćRekurencyjnie(Węzeł<Integer> węzeł) {
        if (węzeł == null) {
            return -1;
        }
        return 1 + Math.max(
                głębokośćRekurencyjnie(węzeł.getLewy()),
                głębokośćRekurencyjnie(węzeł.getPrawy())
        );
    }

    public int głębokość(Węzeł<Integer> węzeł) {
        if (węzeł == null) {
            return -1;
        }

        LinkedList<Licznik> stos = new LinkedList<>();
        stos.push(new Licznik(węzeł, 0));
        int max = 0;
        while (!stos.isEmpty()) {
            Licznik obecny = stos.pop();
            int głębkość = obecny.głębkość;
            Węzeł<Integer> obecnyWęzeł = obecny.węzeł;

            if (głębkość > max) {
                max = głębkość;
            }
            if (obecnyWęzeł.getLewy() != null) {
                Licznik lewy = new Licznik(obecnyWęzeł.getLewy(), głębkość + 1);
                stos.push(lewy);
            }
            if (obecnyWęzeł.getPrawy() != null) {
                Licznik prawy = new Licznik(obecnyWęzeł.getPrawy(), głębkość + 1);
                stos.push(prawy);
            }
        }
        return max;
    }

}

class Licznik {
    Węzeł<Integer> węzeł;
    int głębkość;

    public Licznik(Węzeł<Integer> węzeł, int głębkość) {
        this.węzeł = węzeł;
        this.głębkość = głębkość;
    }
}