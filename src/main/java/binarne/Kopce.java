package binarne;

public class Kopce {

    public int iLewy(int index) {
        return 2 * index + 1;
    }

    public int iPrawy(int index) {
        return 2 * index + 2;
    }

    public int iRodzic(int index) {
        return (index - 1) / 2;
    }

    public boolean maLewe(int index, int długość) {
        return długość > iLewy(index);
    }

    public boolean maPrawe(int index, int długość) {
        return długość > iPrawy(index);
    }

    public boolean jestLiściem(int index, int długość) {
        return !maLewe(index, długość);
    }

    public boolean jestKopcemMax(int[] kopiec) {
        return jestMax(kopiec,0);


    }

    public boolean jestMax(int[] kopiec, int rodzic) {
        if (rodzic >= kopiec.length) {
            return true;
        }
        int lewy = iLewy(rodzic);
        int prawy = iPrawy(rodzic);
        boolean obecnyJestMax =
                (
                        (lewy >= kopiec.length) ||
                                kopiec[rodzic] >= kopiec[lewy]) &&
                        (
                                prawy >= kopiec.length ||
                                        kopiec[rodzic] >= kopiec[prawy]
                        );
        boolean leweJestMax = jestMax(kopiec, lewy);
        boolean praweJestMax = jestMax(kopiec, prawy);
        return obecnyJestMax && leweJestMax && praweJestMax;
    }
    public boolean jestKopcemMin(int[] kopiec) {
        return jestMin(kopiec,0);


    }

    public boolean jestMin (int[] kopiec, int rodzic) {
        if (rodzic <= kopiec.length) {
            return true;
        }
        int lewy = iLewy(rodzic);
        int prawy = iPrawy(rodzic);
        boolean obecnyJestMin =
                (
                        (lewy <= kopiec.length) ||
                                kopiec[rodzic] <= kopiec[lewy]) &&
                        (
                                prawy <= kopiec.length ||
                                        kopiec[rodzic] <= kopiec[prawy]
                        );
        boolean leweJestMin = jestMin(kopiec, lewy);
        boolean praweJestMin = jestMin(kopiec, prawy);
        return obecnyJestMin && leweJestMin && praweJestMin;
    }


}


