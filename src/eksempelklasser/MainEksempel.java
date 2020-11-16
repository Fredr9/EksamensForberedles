package eksempelklasser;

import forelesningRekursivtBinarySearch.Tabell;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MainEksempel {
    public static void main(String[] args) {
        int[] x = {3, 5, 6, 2, 6, 1, 4, 7, 7, 4};         // x-koordinater
        int[] y = {3, 6, 3, 5, 5, 2, 1, 4, 2, 4};         // y-koordinater

        Point[] punkt = new Point[x.length];     // en punkttabell
        for (int i = 0; i < punkt.length; i++) punkt[i] = new Point(x[i], y[i]);

        for (Point p : punkt) System.out.print("(" + p.x + "," + p.y + ") ");
        System.out.println();                    // linjeskift

        Tabell.innsettingssortering(punkt,
                Comparator.comparing(Point::getX).thenComparing(Point::getY));

        for (Point p : punkt) System.out.print("(" + p.x + "," + p.y + ") ");

        Tabell.innsettingssortering(punkt, (p1, p2) ->
                {
                    int d = p1.x - p2.x;    // forskjellen mellom x-koordinatene
                    if (d != 0) return d;
                    return p1.y - p2.y;     // forskjellen mellom x-koordinatene
                }
        );


        Tabell.innsettingssortering(punkt,
                Comparator.comparing((Point p) -> p.x).thenComparing(p -> p.y));

        Tabell.innsettingssortering(punkt,
                Comparator.comparingInt((Point p) -> p.x).thenComparingInt(p -> p.y));

        // Utskriften blir:
        // (3,3) (5,6) (6,3) (2,5) (6,5) (1,2) (4,1) (7,4) (7,2) (4,4)
        // (1,2) (2,5) (3,3) (4,1) (4,4) (5,6) (6,3) (6,5) (7,2) (7,4)

        /*        String[] s = {"Sohil","Per","Thanh","Ann","Kari","Jon"};       // String-tabell
        Comparator<String> c =  Comparator.comparing(String::length);  // etter lengde
        Tabell.innsettingssortering(s, c.thenComparing(x -> x));       // vanlig orden
        System.out.println(Arrays.toString(s));                        // skriver ut



            Person[] p = new Person[5];                       // en persontabell
            p[0] = new Person("Kari", "Svendsen");            // Kari Svendsen
            p[1] = new Person("Boris", "Zukanovic");          // Boris Zukanovic
            p[2] = new Person("Ali", "Kahn");                 // Ali Kahn
            p[3] = new Person("Azra", "Zukanovic");           // Azra Zukanovic
            p[4] = new Person("Kari", "Pettersen");           // Kari Pettersen

            Tabell.innsettingssortering(p, Komparator.orden(Person::etternavn));
            System.out.println(Arrays.toString(p));
            Double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
            Tabell.innsettingssortering(d,Komparator.naturligOrden());

            System.out.println(Arrays.toString(d));

            Tabell.innsettingssortering(d,Komparator.omvendtOrden());

            System.out.println(Arrays.toString(d));

            String[] s = {"Lars","Anders","Bodil","Kari","Per","Berit"};
            Tabell.innsettingssortering(s, (s1,s2) -> s1.length() - s2.length());

            System.out.println(Arrays.toString(s));

            Komparator<Student> c = (s1,s2) ->
            {
                int cmp = s1.studium().name().compareTo(s2.studium().name());
                return cmp != 0 ? cmp : s1.compareTo(s2);
            };

            Student Jan = new Student("Jan","Vong",Studium.IT);
            Student Hanne = new Student("Hanne", "Eriksson", Studium.Anvendt);
            c.compare(Jan,Hanne);
            // Utskrift: [Per, Lars, Kari, Bodil, Berit, Anders]

     */



           /* Student[] s = new Student[5];                             // en studenttabell
            s[0] = new Student("Kari","Svendsen", Studium.Data);      // Kari Svendsen
            s[1] = new Student("Boris","Zukanovic", Studium.IT);      // Boris Zukanovic
            s[2] = new Student("Ali","Kahn", Studium.Anvendt);        // Ali Kahn
            s[3] = new Student("Azra","Zukanovic", Studium.IT);       // Azra Zukanovic
            s[4] = new Student("Kari","Pettersen", Studium.Data);     // Kari Pettersen

            Tabell.innsettingssortering(s, (s1,s2) -> s1.studium().compareTo(s2.studium()));
            System.out.println(Arrays.toString(s));



            Student[] s = new Student[9];                             // en studenttabell

            s[0] = new Student("Kari","Svendsen",Studium.Data);      // Kari Svendsen
            s[1] = new Student("Boris","Zukanovic",Studium.IT);      // Boris Zukanovic
            s[2] = new Student("Ali","Kahn",Studium.Anvendt);        // Ali Kahn
            s[3] = new Student("Azra","Zukanovic",Studium.IT);       // Azra Zukanovic
            s[4] = new Student("Kari","Pettersen",Studium.Data);     // Kari Pettersen
            s[5] = new Student("Anders","Åsen",Studium.Elektro);     // Anders Åsen
            s[6] = new Student("Kari","Østsiden",Studium.Elektro);   // Kari Østsiden
            s[7] = new Student("Per","Jensen",Studium.Enkeltemne);   // Per Jensen
            s[8] = new Student("Kari","Lie",Studium.Enkeltemne);     // Kari Lie

            Tabell.innsettingssortering(s, (s1,s2) ->
                    {
                        int k = s1.studium().compareTo(s2.studium());
                        return k != 0 ? k : s1.compareTo(s2);
                    }
            );

            for (Student t : s) System.out.println(t);

            */



            /*Student[] s = new Student[9];                             // en studenttabell

            s[0] = new Student("Kari","Svendsen",Studium.Data);      // Kari Svendsen
            s[1] = new Student("Boris","Zukanovic",Studium.IT);      // Boris Zukanovic
            s[2] = new Student("Ali","Kahn",Studium.Anvendt);        // Ali Kahn
            s[3] = new Student("Azra","Zukanovic",Studium.IT);       // Azra Zukanovic
            s[4] = new Student("Kari","Pettersen",Studium.Data);     // Kari Pettersen
            s[5] = new Student("Anders","Åsen",Studium.Elektro);     // Anders Åsen
            s[6] = new Student("Kari","Østsiden",Studium.Elektro);   // Kari Østsiden
            s[7] = new Student("Per","Jensen",Studium.Enkeltemne);   // Per Jensen
            s[8] = new Student("Kari","Lie",Studium.Enkeltemne);     // Kari Lie

            Tabell.innsettingssortering(s);                     // Programkode 1.4.2 e)
            for (Student t : s) System.out.println(t);

             */



           /* for (Studium s : Studium.values())
            {
                System.out.println(s.toString() + " (" + s.name() + ")");
            }
            // Ingeniørfag - data (Data)
            // Informasjonsteknologi (IT)
            // Anvendt datateknologi (Anvendt)
            // Enkeltemnestudent (Enkeltemne)

            Student[] s = new Student[5];  // en Studenttabell

            s[0] = new Student("Kari", "Svendsen", Studium.Data);    // Kari Svendsen
            s[1] = new Student("Boris", "Zukanovic", Studium.IT);    // Boris Zukanovic
            s[2] = new Student("Ali", "Kahn", Studium.Anvendt);      // Ali Kahn
            s[3] = new Student("Azra", "Zukanovic", Studium.IT);     // Azra Zukanovic
            s[4] = new Student("Kari", "Pettersen", Studium.Data);   // Kari Pettersen

            Tabell.innsettingssortering(s);                     // Programkode 1.4.2 e)
            for (Student t : s) System.out.println(t);

            // Utskrift:
            // Ali Kahn Anvendt
            // Kari Pettersen Data
            // Kari Svendsen Data
            // Azra Zukanovic IT
            // Boris Zukanovic IT

            */
    }
}
