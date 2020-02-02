package binarne;


public class BST {
    private Węzeł<Integer> korzeń;

    void add(int nowa) {
        if (korzeń == null) {
            korzeń = new Węzeł<>(nowa, null, null);
            return;
        }

        Węzeł<Integer> obecny = korzeń;
        while (true) {
            boolean lewy = obecny.getZawartość() > nowa;
            if (lewy) {
                if (obecny.getLewy() == null) {
                    obecny.setLewy(new Węzeł<>(nowa, null, null));
                    break;
                }
                obecny = obecny.getLewy();
            } else {
                if (obecny.getPrawy() == null) {
                    obecny.setPrawy(new Węzeł<>(nowa, null, null));
                    break;
                }
                obecny = obecny.getPrawy();
            }
        }
    }

    public void dodajRekurencyjnie(int nowa) {
        if (korzeń == null) {
            korzeń = new Węzeł<>(nowa, null, null);
            return;
        }
        dodajRek(korzeń, nowa);
    }

    private void dodajRek(Węzeł<Integer> węzeł, int nowa) {
        boolean lewy = węzeł.getZawartość() > nowa;
        if (lewy) {
            if (węzeł.getLewy() == null) {
                węzeł.setLewy(new Węzeł<>(nowa, null, null));
                return;
            }
            dodajRek(węzeł.getLewy(), nowa);
        } else {
            if (węzeł.getPrawy() == null) {
                węzeł.setPrawy(new Węzeł<>(nowa, null, null));
                return;
            }
            dodajRek(węzeł.getPrawy(), nowa);
        }
    }

    public boolean jestObecne(int x) {
        if (korzeń == null) {
            return false;
        }
        //
        return true;
    }

    private boolean jestObecneRek(int x) {
        return jestObecneRek(x, korzeń);
    }

    private boolean jestObecneRek(int x, Węzeł<Integer> węzeł) {
        if (węzeł == null) {
            return false;
        }
        if (węzeł.getZawartość() == x) {
            return true;
        }
        return węzeł.getZawartość() > x ?
                jestObecneRek(x, węzeł.getLewy()) : jestObecneRek(x, węzeł.getPrawy());
    }

    public void usuń(int x) {

    }
}