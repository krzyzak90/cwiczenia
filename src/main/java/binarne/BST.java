package binarne;


public class BST {
    private Węzeł<Integer> korzeń;

    public void add(int nowa) {
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
        Węzeł<Integer> obecny = korzeń;
        while (obecny != null) {
            if (obecny.getZawartość() == x) {
                return true;
            }
            boolean lewy = obecny.getZawartość() > x;
            obecny = lewy ? obecny.getLewy() : obecny.getPrawy();
        }
        return false;
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
        // czy korzeń zawiera x?
        if (korzeń == null) {
            return;
        }
        if (korzeń.getZawartość() == x) {
            odepnij(null, korzeń.getLewy(), korzeń.getPrawy(), false);
            return;
        }

        // znajdź węzeł
        Węzeł<Integer> obecny = korzeń;
        while (true) {
            boolean lewy = obecny.getZawartość() > x;
            if (lewy) {
                Węzeł<Integer> leweDziecko = obecny.getLewy();
                if (leweDziecko == null) {
                    return;
                }
                if (leweDziecko.getZawartość() == x) {
                    odepnij(obecny, leweDziecko.getLewy(), leweDziecko.getPrawy(), lewy);
                    return;
                }
                obecny = leweDziecko;
            } else {
                Węzeł<Integer> praweDziecko = obecny.getPrawy();
                if (praweDziecko == null) {
                    return;
                }
                if (praweDziecko.getZawartość() == x) {
                    odepnij(obecny, praweDziecko.getLewy(), praweDziecko.getPrawy(), lewy);
                    return;
                }
                obecny = praweDziecko;
            }
        }
        // dla każdego "obecnego" sprawdzamy czy lewy lub prawy zawiera x
        // jeśli zawiera: przejdź do "usuń"
        // jeśli nie zawiera ->

        // usuń węzęł
        // jeśli usunięty węzeł nie ma dzieci: koniec
        // jeśli usunięty węzeł ma jedno dzieco: dodaj dziecko do rodzica
        // jeśli usunięty węzeł ma dwójkę dzieci: 1. dodaj prawy do rodzica,
        //                                        2. dodaj lewy do prawego poddrzewa
    }

    private void odepnij(
            Węzeł<Integer> rodzic,
            Węzeł<Integer> lewyWnuk,
            Węzeł<Integer> prawyWnuk,
            boolean lewy) {
        //jeśli usunięty wezeł nie ma dzieci koniec
        if (prawyWnuk == null && lewyWnuk == null) {
            if (rodzic == null) {
                korzeń = null;
            } else if (lewy) {
                rodzic.setLewy(null);
            } else {
                rodzic.setPrawy(null);
            }
            return;
        }
        if(lewyWnuk!=null && prawyWnuk == null){
            if (rodzic == null) {
                korzeń = lewyWnuk;
            } else if (lewy) {
                rodzic.setLewy(lewyWnuk);
            } else {
                rodzic.setPrawy(lewyWnuk);
            }
            return;
        }
        if(lewyWnuk==null && prawyWnuk != null){
            if (rodzic == null) {
                korzeń = prawyWnuk;
            } else if (lewy) {
                rodzic.setLewy(prawyWnuk);
            } else {
                rodzic.setPrawy(prawyWnuk);
            }
            return;
        }

        // lewyWnuk != null && prawyWnuk != null
        if (rodzic == null) {
            korzeń = prawyWnuk;
        } else if (lewy) {
            rodzic.setLewy(prawyWnuk);
        } else {
            rodzic.setPrawy(prawyWnuk);
        }
        // lewy do prawego
        dodajNajbardziejNaLewo(prawyWnuk, lewyWnuk);
    }

    private void dodajNajbardziejNaLewo(Węzeł<Integer> doTego, Węzeł<Integer> ten) {
        while (doTego.getLewy() != null) {
            doTego = doTego.getLewy();
        }
        doTego.setLewy(ten);
    }
}