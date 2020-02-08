package binarne;

public class WyszukiwanieBinarne {

        public int wyszukiwanieBinarne(int[] arr, int x) {
            int poczatek = 0;
            int koniec = arr.length - 1;
            while (poczatek <= koniec) {
                int srodek = (poczatek + koniec) / 2;
                if (arr[srodek] == x) {
                    return srodek;
                }
                if (arr[srodek] < x) {
                    poczatek = srodek + 1;
                } else {
                    koniec = srodek - 1;
                }
            }
            return -1;
        }

    }

