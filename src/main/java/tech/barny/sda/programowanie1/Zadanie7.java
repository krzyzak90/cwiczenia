package tech.barny.sda.programowanie1;

public class Zadanie7 {

    public int wsadź5(int liczba) {
        if (liczba == 0) {
            return 50;
        }
        int znak = liczba > 0 ? 1 : -1;
        int r = 5 * znak;
        int m = 10000000;
        int pre = 0;
        int rest = liczba;
        while (m != 0) {
            if ((znak * rest) < m) {
                System.out.println(rest + " " + m);
                m /= 10;
                continue;
            }
            int t = rest / m;
            System.out.println(t);
            if (t < r) {
                return 10 * (pre + (m * r)) + rest;
            }
            pre += (t * m);
            rest = rest % m;
            m /= 10;
        }
        return pre * 10 + r;
    }
}
