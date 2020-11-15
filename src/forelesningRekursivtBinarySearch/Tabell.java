package forelesningRekursivtBinarySearch;

import java.util.Arrays;
import java.util.Random;

public class Tabell {

    public static void main(String[] args) {
       int[] a = {1,2,31,123,1,12,1,212,1};
        /*System.out.println(min(a));
        System.out.println(maks(a));
        System.out.println(maks(a,2,5));
        System.out.println(min(a,2,5));
        Tabell tabell = new Tabell();

         */

        System.out.println(Arrays.binarySearch(a,0,a.length,1));



/*
        int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell.maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);
        skriv(a);
        System.out.println();
        skriv(a, 0, 2);

 */

    }

    private Tabell() {
    }



    public static void fratilKontroll(int tablengde, int fra, int til) {
        if (fra < 0)                             // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                     // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                           // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }

    public static void vhKontroll(int tablengde, int v, int h)
    {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void bytt(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void skriv(int[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);
        if (til - fra > 0) {
            System.out.print(a[fra]);
            for (int i = fra; i < til; ++i) {
                System.out.print(" " + a[i]);
            }
        }
    }


    public static void skriv(int[] a) {
        skriv(a, 0, a.length);
    }

    public static void skrivln(int[] a, int fra, int til) {
        skriv(a, fra, til);
        System.out.println();
    }


    public static void skrivln(int[] a) {
        skrivln(a, 0, a.length);

    }

    public static int[] randPerm(int n)  // en versjon som ikke virker
    {
        Random r = new Random();      // en randomgenerator
        int[] a = new int[n];         // en tabell med plass til n tall

        for (int i = 0; i < n; i++)
            a[i] = r.nextInt(n) + 1;    // tabellen fylles med tall

        return a;                     // tabellen returneres
    }

    public static void randPerm(int[] a)  // stokker om a
    {
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);
        }
    }

    public static int maks(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) {
            if (a[i] > maksverdi) {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }


    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a, 0, a.length);     // kaller metoden over
    }

    public static int min(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til største verdi i a[fra:til>
        int minverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) {
            if (a[i] < minverdi) {
                m = i;                // indeks til største verdi oppdateres
                minverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }


    public static int min(int[] a)  // bruker hele tabellen
    {
        return min(a, 0, a.length);     // kaller metoden over
    }
}
