
/**
 *
 * @author Rifki Sadikin
 * @since  19 - 12 - 2010
 * @version 1.0
 * @param Nama Kelas adalah AritmatikaInteger berisi fungsi untuk menghitung gcd dan extended euclid
 *
 */
public class AritmatikaInteger {

    static final int EXTEUCLID_RET_ARRAY_SIZE = 3;
    static final int INDEX_GCD = 0;
    static final int INDEX_S = 1;
    static final int INDEX_T = 2;

    // fungsi gcd, input a dan b, mengembalikan faktor persekutuan terbesar a dan b
    // berdasarkan algoritma Euclid
    static int gcd(int a,int b) {
        int A = a;   int B = b;
        int q = 0;   int r = 0;

        while (B != 0) {
            q = A / B;
            r = A - q*B;
            A = B;
            B = r;
        }
        return  A;
    }

    // fungsi extended_euclid, mengembalikan array integer ar yang berisi
    // ar[0] = gcd(a,b), ar[1] = s, ar[2] = t yang memenuhi s*a + t*b = gcd(a,b)
     static int[] extended_euclid(int a,int b) {
        int A = a, B = b, q,r;
        int S1 = 1,S2 = 0,S;
        int  T1 = 0, T2 = 1, T;
        while (B != 0) {
            q = A / B;
            r = A - q*B;
            A = B;  B = r;

            S  = S1 - q*S2;
            S1 = S2; S2 = S;

            T  = T1 - q*T2;
            T1 = T2; T2 = T;
        }
        int[] ar = new int[EXTEUCLID_RET_ARRAY_SIZE];
        ar[INDEX_GCD]  = A;  ar[INDEX_S]  = S1;
        ar[INDEX_T]  = T1;
        return  ar;
     }


     // tester untuk ARITMATIKA INTEGER
     public static void main(String args[]){
         // test gcd
         int a = 64;
         int b = 160;
         System.out.println("gcd(" + a + "," + b + ") = " + AritmatikaInteger.gcd(a, b));

         // test extended euclid
         int ar[] = AritmatikaInteger.extended_euclid(a, b);
         System.out.println(ar[INDEX_S] + " * " + a  + " + " + ar[INDEX_T] + " * " + b +  " = " + ar[INDEX_GCD]);
         // cek kebenaran
         if ((ar[INDEX_S]*a + ar[INDEX_T]*b) == ar[INDEX_GCD]) System.out.println("Extended euclid benar");
     }
}
