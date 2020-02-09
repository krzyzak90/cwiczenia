package binarne;

public class GCD {
    //    public static void main(String[] args) {
//        int n1 = 9, n2 = 6, gcd = 1;
//        for(int i = 1; i <= n1 && i <= n2; ++i)
//        {
//            if(n1 % i==0 && n2 % i==0)
//                gcd = i;
//        }
//        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
//    }
    public static void main(String[] args) {
        int n1 = 64, n2 = 120;
        while (n1 != n2) {
            if (n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("G.C.D = " + n1);

    }
}

