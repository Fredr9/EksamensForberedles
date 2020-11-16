package eksempelklasser;

import forelesningRekursivtBinarySearch.Tabell;

import java.util.Arrays;

public class MainEksempel {
    public static void main(String[] args) {

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
