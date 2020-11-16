package forelesningRekursivtBinarySearch;


import eksempelklasser.Heltall;
import eksempelklasser.Komparator;
import eksempelklasser.Person;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Tabell {

    public static void main(String[] args) {
        Person[] p = new Person[5];                   // en persontabell

        p[0] = new Person("Kari","Svendsen");         // Kari Svendsen
        p[1] = new Person("Boris","Zukanovic");       // Boris Zukanovic
        p[2] = new Person("Ali","Kahn");              // Ali Kahn
        p[3] = new Person("Azra","Zukanovic");        // Azra Zukanovic
        p[4] = new Person("Kari","Pettersen");        // Kari Pettersen

        int m = Tabell.maks(p);                       // posisjonen til den største
        System.out.println(p[m] + " er størst");      // skriver ut den største

        Tabell.innsettingssortering(p);               // generisk sortering
        System.out.println(Arrays.toString(p));       // skriver ut sortert

        /*
        double[] d = {5.7, 3.14, 7.12, 3.9, 6.5, 7.1, 7.11};
        Double[] b = new Double[d.length];

        // hvert element b lages som en instans av class Double
        for (int i = 0; i < b.length; i++) b[i] = d[i];  // autoboksing

        Tabell.innsettingssortering(b);
        Tabell.skrivln(b);  // se Oppgave 5

         */


/*
        Integer[] a = Tabell.randPermInteger(20);
        System.out.println(Arrays.toString(a));
        // En mulig utskrift: [7, 1, 8, 2, 10, 3, 4, 6, 5, 9]

        Tabell.innsettingssortering(a);
        System.out.println(Arrays.toString(a));
        // Utskrift: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

 */


       /* String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};
        int k = Tabell.maks(s);        // hvilken maks-metode?
        System.out.println(s[k]);      // Utskrift:  Thanh



        String[] s = {"Per","Kari","Ole","Anne","Ali","Eva"};
        Tabell.innsettingssortering(s);
        System.out.println(Arrays.toString(s));  // [Ali, Anne, Eva, Kari, Ole, Per]

        */
      /*  int[] a = Tabell.randPerm(100000);
        int[] b = a.clone();
        long tid1 = System.currentTimeMillis();
        Tabell.utvalgssortering(a);
        tid1 = System.currentTimeMillis() - tid1;

        long tid2 = System.currentTimeMillis();
        Tabell.innsettingssortering(b);
        tid2 = System.currentTimeMillis() - tid2;

        System.out.println("Utvalgssortering: " + tid1);
        System.out.println("Innsettingssortering: " + tid2);

       */

        /*int[] gap = {1,4,10,23,57,132,301,701,1577,3548,7984,17965,40423,90952,204642};
        int[] a = Tabell.randPerm(200_000);       // en tilfeldig tabell
        System.out.println(Tabell.erSortert(a));  // sjekker tabellen

        long tid = System.currentTimeMillis();    // starter klokken

        Tabell.innsettingssortering(a);           // sorterer
        //for (int i = gap.length - 1; i >= 0; i--) Tabell.shell(a,gap[i]);

        System.out.println(System.currentTimeMillis() - tid);  // tiden
        System.out.println(Tabell.erSortert(a));  // sjekker sorteringen

         */



        /*  int[] a = Tabell.randPerm(100000);
        long tid = System.currentTimeMillis();
        Tabell.utvalgssortering(a);
        tid = System.currentTimeMillis() - tid;
        System.out.println(tid);



        long tid2 = System.currentTimeMillis();
        Tabell.utvalgssortering2(a);
        tid2 = System.currentTimeMillis() - tid2;
        System.out.println(tid2);

       */

        //
        /*
        int[] a = {3,1,4,9,7,10,8,6,5,2};        // permutasjon av tallene fra 1 til 10
        Tabell.nestePermutasjon(a);              // lager neste permutasjon
        System.out.println(Arrays.toString(a));  // [3, 1, 4, 9, 8, 2, 5, 6, 7, 10]


        int[] a = {3,1,4,9,8,2,5,7,6,10};
        System.out.println("perumtasjon 5");
        Tabell.nestePermutasjon(a);

        Tabell.skriv(a);
        System.out.println("perumtasjon 6");
        Tabell.nestePermutasjon(a);

        Tabell.skriv(a);
        System.out.println("perumtasjon 7");
        Tabell.nestePermutasjon(a);


        Tabell.skriv(a);
        System.out.println("perumtasjon 8");
        Tabell.nestePermutasjon(a);
        System.out.println();
        Tabell.skriv(a);
        Tabell.nestePermutasjon(a);
        System.out.println();
        Tabell.skriv(a);
        Tabell.nestePermutasjon(a);
        System.out.println();
        Tabell.skriv(a);
        Tabell.nestePermutasjon(a);
        System.out.println();
        Tabell.skriv(a);


        int[] a = {7,5,9,2,10,4,1,8,6,3};     // en usortert heltallstabell
        Tabell.utvalgssortering(a);           // stigende sortering
        Tabell.snu(a);                        // tabellen snus
        Tabell.skriv(a);                      // 10 9 8 7 6 5 4 3 2 1

         */

//        System.out.println(Arrays.toString(nestMaksBinaryThree(a)));
        /*System.out.println(min(a));
        System.out.println(maks(a));
        System.out.println(maks(a,2,5));
        System.out.println(min(a,2,5));
        Tabell tabell = new Tabell();


        System.out.println(Arrays.toString(a));
        sortering(a);
        System.out.println(Arrays.toString(a));
        */


        //System.out.println(Arrays.toString(nestMaksBakerst(a)));
        //System.out.println(maks(a));



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

    public static void vhKontroll(int tablengde, int v, int h) {
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

        for (int i = fra; i < til; i++) System.out.print(a[i] + " ");
    }


    public static void skriv(int[] a) {
        skriv(a, 0, a.length);
    }

    public static void skrivln(int[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);

        for (int i = fra; i < til; i++) System.out.print(a[i] + " ");
        System.out.println();
    }


    public static void skrivln(int[] a) {
        skrivln(a, 0, a.length);

    }

    public static void skriv(char[] c, int fra, int til) {
        fratilKontroll(c.length, fra, til);

        for (int i = fra; i < til; i++) System.out.print(c[i] + " ");
    }

    public static void skrivln(char[] c, int fra, int til) {
        fratilKontroll(c.length, fra, til);

        for (int i = fra; i < til; i++) System.out.print(c[i] + " ");
        System.out.println();
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

    public static int maksOppgave3(int[] a, int fra, int til) {
        if (a == null) {
            throw new NullPointerException("Parametertabellen er null!");
        }

        fratilKontroll(a.length, fra, til);

        if (fra == til) {
            throw new NoSuchElementException("fra(" + fra + ") = til " + til + " ) - tomt tabellintervall!");

        }
        int m = fra;
        int maksverdi = a[fra];

        for (int i = fra + 1; i < til; ++i) {
            if (a[i] > maksverdi) {
                m = i;
                maksverdi = a[m];
            }

        }
        return m;
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

    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        } else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        } else {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[]{m, nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks

    public static int[] nestMaksForst(int[] a) {
        if (a.length < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + a.length + ") < 2!");

        int m = Tabell.maks(a);  // m er posisjonen til tabellens største verdi

        Tabell.bytt(a, 0, m);  // bytter om slik at den største kommer forrest

        int k = Tabell.maks(a, 1, a.length);

        if (k == m) k = 0; // den nest største lå opprinnelig forrest

        Tabell.bytt(a, 0, m); // bytter tilbake

        return new int[]{m, k};

    }

    public static int[] nestMaksBakerst(int[] a) {
        if (a.length < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + a.length + ") < 2!");

        int m = Tabell.maks(a);  // m er posisjonen til tabellens største verdi

        Tabell.bytt(a, a.length - 1, m);  // bytter om slik at den største kommer bakerst

        int k = Tabell.maks(a, 0, a.length - 1);

        if (k == m) k = a.length - 1; // den nest største lå opprinnelig bakerst

        Tabell.bytt(a, a.length - 1, m); // bytter tilbake

        return new int[]{m, k};

    } // nestMaks@

    public static int[] nestMaksBinaryThree(int[] a)   // en turnering
    {
        int n = a.length;                // for å forenkle notasjonen

        if (n < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + n + ") < 2!");

        int[] b = new int[2 * n];          // turneringstreet
        System.arraycopy(a, 0, b, n, n);     // legger a bakerst i b


        for (int k = 2 * n - 2; k > 1; k -= 2)   // lager turneringstreet
            b[k / 2] = Math.max(b[k], b[k + 1]);

        System.out.println(Arrays.toString(b));

        int maksverdi = b[1], nestmaksverdi = Integer.MIN_VALUE;

        for (int m = 2 * n - 1, k = 2; k < m; k *= 2) {
            int tempverdi = b[k + 1];  // ok hvis maksverdi er b[k]
            if (maksverdi != b[k]) {
                tempverdi = b[k];
                k++;
            }
            if (tempverdi > nestmaksverdi) nestmaksverdi = tempverdi;
        }

        return new int[]{maksverdi, nestmaksverdi}; // størst og nest størst

    } // nestMaks


    public static void sortering(int[] a) {
        for (int i = a.length; i > 1; i--) {
            int m = Tabell.maks(a, 0, i);
            Tabell.bytt(a, i - 1, m);
        }
    }


    public static int min(int[] a)  // bruker hele tabellen
    {
        return min(a, 0, a.length);     // kaller metoden over
    }

    public static void kopier(int[] a, int i, int[] b, int j, int ant) {
        for (int n = i + ant; i < n; ) {
            b[j++] = a[i++];
        }
    }

    public static void snu(int[] a, int v, int h)  // snur intervallet a[v:h]
    {
        while (v < h) bytt(a, v++, h--);
    }

    public static void snu(int[] a, int v)  // snur fra og med v og ut tabellen
    {
        snu(a, v, a.length - 1);
    }

    public static void snu(int[] a)  // snur hele tabellen
    {
        snu(a, 0, a.length - 1);
    }

    public static boolean nestePermutasjon(int[] a) {
        int i = a.length - 2;                    // i starter nest bakerst
        while (i >= 0 && a[i] > a[i + 1]) i--;   // går mot venstre
        if (i < 0) return false;                 // a = {n, n-1, . . . , 2, 1}

        int j = a.length - 1;                    // j starter bakerst
        while (a[j] < a[i]) j--;                 // stopper når a[j] > a[i]
        bytt(a, i, j);
        snu(a, i + 1);               // bytter og snur

        return true;                             // en ny permutasjon
    }

    public static int inversjoner(int[] a) {
        int antall = 0;  // antall inversjoner
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) antall++;  // en inversjon siden i < j
            }
        }
        return antall;
    }

    public static boolean erSortert(int[] a)  // legges i samleklassen Tabell
    {
        for (int i = 1; i < a.length; i++)      // starter med i = 1
            if (a[i - 1] > a[i]) return false;      // en inversjon

        return true;
    }

    public static void utvalgssortering(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            bytt(a, i, min(a, i, a.length));  // to hjelpemetoder
    }

    public static void utvalgssortering2(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int m = i;             // indeks til den foreløpig minste
            int minverdi = a[i];  // verdien til den foreløpig minste

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < minverdi) {
                    minverdi = a[j];  // ny minste verdi
                    m = j;            // indeksen til ny minste verdi
                }
            }
            // bytter om a[i] og a[m]
            int temp = a[i];
            a[i] = a[m];
            a[m] = temp;
        }
    }

    public static void utvalgssorteringIntervall(int[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);

        for (int i = fra; i < til - 1; i++) {
            bytt(a, i, min(a, i, til));  // to hjelpemetoder
        }
    }


    public static int lineærsøk(int[] a, int verdi) // legges i class Tabell
    {
        if (a.length == 0 || verdi > a[a.length - 1])
            return -(a.length + 1);  // verdi er større enn den største

        int i = 0;
        for (; a[i] < verdi; i++) ;  // siste verdi er vaktpost

        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }

    public static int lineærsøkbakerst(int[] a, int verdi) {
        if (a.length == 0 || verdi < a[0])
            return -1;  // verdi er mindre enn den største

        int i = a.length - 1;
        for (; a[i] > verdi; i--) ;

        return verdi == a[i] ? i : -(i + 2);
    }

    public static int lineærsøkMedHopp(int[] a, int k, int verdi) {
        if (k < 1)
            throw new IllegalArgumentException("Må ha k > 0!");

        int j = k - 1;
        for (; j < a.length && verdi > a[j]; j += k) ;

        int i = j - k + 1;  // søker i a[j-k+1:j]
        for (; i < a.length && verdi > a[i]; i++) ;

        if (i < a.length && a[i] == verdi) return i;  // funnet
        else return -(i + 1);
    }

    public static int kvadratrotsøk(int[] a, int k, int verdi) {
        return lineærsøkMedHopp(a, (int) Math.sqrt(a.length), verdi);
    }

    // 2. versjon av binærsøk - returverdier som for Programkode 1.3.6 a)
    public static int binærsøkVersjon2(int[] a, int fra, int til, int verdi) {
        Tabell.fratilKontroll(a.length, fra, til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;    // v og h er intervallets endepunkter

        while (v <= h)  // fortsetter så lenge som a[v:h] ikke er tom
        {
            int m = (v + h) / 2;     // heltallsdivisjon - finner midten
            int midtverdi = a[m];  // hjelpevariabel for  midtverdien

            if (verdi > midtverdi) v = m + 1;        // verdi i a[m+1:h]
            else if (verdi < midtverdi) h = m - 1;   // verdi i a[v:m-1]
            else return m;                           // funnet
        }

        return -(v + 1);   // ikke funnet, v er relativt innsettingspunkt
    }

    public static int binærsøk(int[] a, int fra, int til, int verdi) {
        Tabell.fratilKontroll(a.length, fra, til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;  // v og h er intervallets endepunkter

        while (v < h)  // obs. må ha v < h her og ikke v <= h
        {
            int m = (v + h) / 2;  // heltallsdivisjon - finner midten

            if (verdi > a[m]) v = m + 1;   // verdi må ligge i a[m+1:h]
            else h = m;                   // verdi må ligge i a[v:m]
        }
        if (h < v || verdi < a[v]) return -(v + 1);  // ikke funnet
        else if (verdi == a[v]) return v;            // funnet
        else return -(v + 2);                       // ikke funnet
    }

    public static void shell(int[] a, int k) {
        for (int i = k; i < a.length; i++) {
            int temp = a[i], j = i - k;
            for (; j >= 0 && temp < a[j]; j -= k) a[j + k] = a[j];
            a[j + k] = temp;
        }
    }

    public static void innsettingssortering(int[] a) {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            int temp = a[i];  // hjelpevariabel
            for (int j = i - 1; j >= 0 && temp < a[j]; j--) Tabell.bytt(a, j, j + 1);
        }
    }

    public static void innsettingssorteringIntervall(int[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);  // se Programkode 1.2.3 a)

        for (int i = fra + 1; i < til; i++)  // a[fra] er første verdi
        {
            int temp = a[i];  // flytter a[i] til en hjelpevariabel

            // verdier flyttes inntil rett sortert plass i a[fra:i> er funnet
            int j = i - 1;
            for (; j >= fra && temp < a[j]; j--) a[j + 1] = a[j];

            a[j + 1] = temp;  // verdien settes inn på rett sortert plass
        }
    }

    public static int maks(double[] a)     // legges i class Tabell
    {
        int m = 0;                           // indeks til største verdi
        double maksverdi = a[0];             // største verdi

        for (int i = 1; i < a.length; i++)
            if (a[i] > maksverdi) {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdaters
            }
        return m;     // returnerer posisjonen til største verdi
    }

   /* public static int maks(String[] a)    // legges i class Tabell
    {
        int m = 0;                          // indeks til største verdi
        String maksverdi = a[0];            // største verdi

        for (int i = 1; i < a.length; i++)
            if (a[i].compareTo(maksverdi) > 0) {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
        return m;  // returnerer posisjonen til største verdi
    }

    */

    public static int maks(char[] a)     // legges i class Tabell
    {
        int m = 0;                           // indeks til største verdi
        char maksverdi = a[0];             // største verdi

        for (int i = 1; i < a.length; i++)
            if (a[i] > maksverdi) {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdaters
            }
        return m;     // returnerer posisjonen til største verdi
    }

    public static int maks(Integer[] a) {
        int m = 0;                          // indeks til største verdi
        Integer maksverdi = a[0];           // største verdi

        for (int i = 1; i < a.length; i++)
            if (a[i].compareTo(maksverdi) > 0) {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
        return m;  // returnerer posisjonen til største verdi

    } // maks

    public static int sammenlign(String s1, String s2) {
        int n1 = s1.length();    // lengden til s1
        int n2 = s2.length();    // lengden til s2

        int n = n1 < n2 ? n1 : n2;    // den minste av n1 og n2

        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) return c1 - c2;
        }
        return n1 - n2;
    }

    public static <T extends Comparable<? super T>> int maks(T[] a) {
        int m = 0;                     // indeks til største verdi
        T maksverdi = a[0];            // største verdi

        for (int i = 1; i < a.length; i++)
            if (a[i].compareTo(maksverdi) > 0) {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
        return m;  // returnerer posisjonen til største verdi
    } // maks

    public static <T extends Comparable<? super T>> void innsettingssortering(T[] a) {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            T verdi = a[i];        // verdi er et tabellelemnet
            int j = i - 1;        // j er en indeks
            // sammenligner og forskyver:
            for (; j >= 0 && verdi.compareTo(a[j]) < 0; j--) a[j + 1] = a[j];

            a[j + 1] = verdi;      // j + 1 er rett sortert plass
        }
    }

    public static void bytt(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static Integer[] randPermInteger(int n) {
        Integer[] a = new Integer[n];               // en Integer-tabell
        Arrays.setAll(a, i -> i + 1);               // tallene fra 1 til n

        Random r = new Random();   // hentes fra  java.util

        for (int k = n - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);             // bytter om
        }
        return a;  // tabellen med permutasjonen returneres
    }

    public static void skriv(Object[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);

        for (int i = fra; i < til; i++) System.out.print(a[i] + " ");
    }

    public static void skriv(Object[] a) {
        skriv(a, 0, a.length);
    }

    public static void skrivln(Object[] a, int fra, int til) {
        skriv(a, fra, til);
        System.out.println();
    }

    public static void skrivln(Object[] a) {
        skrivln(a, 0, a.length);
    }

    public static void bytte(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T> void innsettingssortering(T[] a, Komparator<? super T> c)
    {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            T verdi = a[i];        // verdi er et tabellelemnet
            int  j = i - 1;        // j er en indeks

            // sammenligner og forskyver:
            for (; j >= 0 && c.compare(verdi,a[j]) < 0 ; j--) a[j+1] = a[j];

            a[j + 1] = verdi;      // j + 1 er rett sortert plass
        }
    }

    public static <T> int maks(T[] a, Komparator<? super T> c)
    {
        return maks(a, 0, a.length, c);  // kaller metoden nedenfor
    }

    public static <T> int maks(T[] a, int fra, int til, Komparator<? super T> c)
    {
        fratilKontroll(a.length,fra,til);

        if (fra == til) throw new NoSuchElementException
                ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");

        int m = fra;                // indeks til største verdi
        T maksverdi = a[fra];       // største verdi

        for (int i = fra + 1; i < til; i++)   // går gjennom intervallet
        {
            if (c.compare(a[i],maksverdi) > 0)  // bruker komparatoren
            {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdateres
            }
        }
        return m;                 // posisjonen til største verdi

    }  // maks


}
