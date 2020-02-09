package binarne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ZR {

    public int najdłuższePołączenie(String[] words) {
        words = filtruj(words);

        Połączenie p0 = new Połączenie(0, "", words);
        int l = -1;
        LinkedList<Połączenie> stos = new LinkedList<>();
        stos.push(p0);
        while (!stos.isEmpty()) {
            Połączenie p = stos.pop();
            if (p.n > 1 && p.txt.length() > l) {
                l = p.txt.length();
            }
            for (int i = 0; i < p.pozostałe.length; i++) {
                String nw = p.pozostałe[i];
                String[] pzn = new String[p.pozostałe.length - 1];
                System.arraycopy(p.pozostałe, 0, pzn, 0, i);
                System.arraycopy(p.pozostałe, i + 1, pzn, i, p.pozostałe.length - i - 1);
                if (unikaty(p.txt, nw)) {
                    stos.push(new Połączenie(p.n + 1, p.txt + nw, pzn));
                } else {
                    stos.push(new Połączenie(p.n, p.txt, pzn));
                }
            }
        }
        return l;
    }


    public String[] filtruj(String[] words) {
        return Arrays.stream(words).filter(ZR::unikaty).toArray(String[]::new);
    }

    public List<String> filtrujDoListy(String[] words) {
        List<String> lista2 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (unikaty(words[i])) {
                lista2.add(words[i]);
            }
        }
        return lista2;
    }

    public boolean unikaty(String w1, String w2) {
        StringBuilder sb = new StringBuilder();
        sb.append(w1);
        sb.append(w2);
        return unikaty(sb.toString());
    }

    public boolean unikaty2(String w1, String w2) {
        char[] chars1 = w1.toCharArray();
        char[] chars2 = w2.toCharArray();
        for (char c1 : chars1) {
            for (char c2 : chars2) {
                if (c1 == c2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean unikaty(String str) {
        for (int i = 0; i < str.length() - 1; i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
        return true;
    }

}
class Połączenie {
    public Połączenie(int n, String txt, String[] pozostałe) {
        this.n = n;
        this.txt = txt;
        this.pozostałe = pozostałe;
    }

    int n;
    String txt;
    String[] pozostałe;

}
