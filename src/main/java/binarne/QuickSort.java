package binarne;

public class QuickSort {
    public void sortowanie( Comparable [ ] items ) {
        quicksort( items, 0, items.length - 1 );
    }

    private void quicksort(Comparable[] items, int i, int i1) {
    }

    void szybkieSortowanie (Comparable [] a, int lo, int hi)
    {

        int i=lo, j=hi;
        Object h;
        int x=(lo+hi)/2;
        Comparable piwot = a[ hi ];

        do
        {
            while (a[++i].compareTo(piwot)<0);
            while (a[j].compareTo(a[j--])>0);
            if (i<=j)
            {
                h=a[i];
                a[i]=a[j];
                a[j]=(Comparable) h;
                i++; j--;
            }
        } while (i<=j);


        if (lo<j) szybkieSortowanie(a, lo, j);
        if (i<hi) szybkieSortowanie(a, i, hi);
    }
}
