package binarne;

import java.util.Arrays;

public class Sortowanie {

    public static boolean jestPosortowane(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k] > arr[k + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        do {
            for (int i = 0; i < n - 1; i++) {
                int a = arr[i];
                int b = arr[i + 1];
                if (a > b) {
                    arr[i + 1] = a;
                    arr[i] = b;
                }
            }
            n -= 1;
        } while (n > 1);
    }

    public static void bubbleSort2(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }

    public static int[] bubbleSort3(int[] arr) {
        int n = arr.length - 1;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i; j++) {
                //swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static int[] bubbleSort4(int[] arr) {
        int n = arr.length;
        do {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            n = n - 1;
        } while (n > 1);
        return arr;
    }

    public static void quickSort(int[] arr) {
        quickSortRec(arr, 0, arr.length - 1);
    }

    public static void quickSortRec(int[] arr, int a, int b) {
        int m = quickSortIter(arr, a, b);
        if (m != -1) {
            quickSortRec(arr, a, m - 1);
            quickSortRec(arr, m + 1, b);
        }
    }

    public static int quickSortIter(int[] arr, int a, int b) {
        if (b <= a) {
            return -1;
        }
        int pv = arr[b];
        int m = a;
        for (int i = a; i < b; i ++) {
            int x = arr[i];
            if (pv > x) {
                arr[i] = arr[m];
                arr[m] = x;
                m++;
            }
        }
        arr[b] = arr[m];
        arr[m] = pv;
        return m;
    }
    public static void heapSort(int[] arr) {
        heapify(arr, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        heapify(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static void heapify(int[] arr, int n) {
        int k = (n - 2) / 2;
        for (int i = 0; i <= k; i++) {
            heapifyParent(arr, i, n);
        }
    }


    public static void heapifyParent(int[] arr, int i, int n) {
        // k - indeks ostatniego węzła z rodzicem
        int k = (n - 2) / 2;
        if (i < 0 || i > k) {
            return;
        }

        int iL = 2 * i + 1;
        int iP = 2 * i + 2;
        int wRodzica = arr[i];
        int wLewy = arr[iL];
        boolean maPrawego = iP < n;
        int wPrawy = maPrawego ? arr[iP] : 0;
        if (wRodzica < wLewy && (!maPrawego || wLewy >= wPrawy)) {
            arr[i] = wLewy;
            arr[iL] = wRodzica;
            if (i != 0) {
                int p = (i - 1) / 2;
                heapifyParent(arr, p, n);
            }
            heapifyParent(arr, iL, n);
        } else if (maPrawego && wRodzica < wPrawy) {
            arr[i] = wPrawy;
            arr[iP] = wRodzica;
            if (i != 0) {
                int p = (i - 1) / 2;
                heapifyParent(arr, p, n);
            }
            heapifyParent(arr, iP, n);
        }
    }
}


