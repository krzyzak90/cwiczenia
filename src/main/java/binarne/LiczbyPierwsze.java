package binarne;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
public class LiczbyPierwsze {

    public static void main(String[] args) {
        List<Integer> pierwsze = new LiczbyPierwsze().liczbyPierwsze(10000000);
        for (int i : pierwsze) {
            System.out.println(i);
        }
    }

    public List<Integer> liczbyPierwsze(int max) {
        List<Integer> liczbyPierwsze = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            boolean liczbaPierwsza = true;
            for (int d : liczbyPierwsze) {
                if (i % d == 0) {
                    liczbaPierwsza = false;
                    break;
                }
                if (d > Math.sqrt(i)) {
                    break;
                }
            }
            if (liczbaPierwsza) {
                liczbyPierwsze.add(i);
            }
        }
        return liczbyPierwsze;
    }

    public List<Integer> czynnikiPierwsze(int x) {
        List<Integer> czynnikiPierwsze = new ArrayList<>();
        List<Integer> liczbyPierwsze = liczbyPierwsze(x);
        while (x != 1) {
            for (int d : liczbyPierwsze) {
                int k = x % d;
                if (k == 0) {
                    czynnikiPierwsze.add(d);
                    x /= d;
                }
            }
        }
        return czynnikiPierwsze;
    }

    public int iloczynCzynnikiWspólne(List<Integer> czynnikiA, List<Integer> czynnikiB) {
        List<Integer> czynnikiWspólne = new ArrayList<>();
        for (Integer k : czynnikiA) {
            if (czynnikiB.contains(k)) {
                czynnikiB.remove(k);
                czynnikiWspólne.add(k);
            }
        }
        int iloczynCzynnikiWspólne = 1;
        for (int k : czynnikiWspólne) {
            iloczynCzynnikiWspólne *= k;
        }
        return iloczynCzynnikiWspólne;
    }

    public int gcd_1(int a, int b) {
        return iloczynCzynnikiWspólne(czynnikiPierwsze(a), czynnikiPierwsze(b));
    }

    public static int gcd_2(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int gcd_2_2(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            a -= b;
            return gcd_2_2(a, b);
        } else {
            b -= a;
            return gcd_2_2(a, b);
        }
    }

    public static int gcd_3(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int gcd_3_2(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd_3_2(b, a % b);
    }

}

