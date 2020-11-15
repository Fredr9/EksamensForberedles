package forelesningRekursivtBinarySearch;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Minimun {
    public static void main(String[] args) {
        int a[] = {1,45,2,3,2,2,1,5,1,0};
        System.out.println(min(a));
        System.out.println(Arrays.toString(minMax(a)));
        faktorial(5);
        System.out.println(faktorial(5));
    }
    public static int[] minMax(int[] a){
        return new int[]{min(a),max(a)};
    }

    public static int max(int[] a){
        if(a.length < 1){
            throw new NoSuchElementException("Tomt array");
        }
        int m = 0;
        for(int i = 1; i< a.length; ++i){
        if (a[i] > a[m]) {
            m = i;
        }
        }
        return m;
    }


    public static int min(int[] a){
        if(a.length < 1){
            throw new NoSuchElementException("Tomt Array");
        }

        int m = 0; // begynner med første element som minste.
        for(int i = 1; i < a.length; ++i){
            if(a[i] < a[m]){
                m = i;
            }
        }
        return m;
    }
    public static long faktorial(long n){
        if(n < 1){
           throw new IllegalArgumentException("n ern under null");
        }
        long fakultet = 1;
        for(int i = 1; i <= n; ++i){
            fakultet *= i;
        }


        return fakultet;
    }
}
