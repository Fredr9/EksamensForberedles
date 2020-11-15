package forelesningRekursivtBinarySearch;

import java.util.Arrays;

public class TjuesekstenH_Eksamen {
    public static void main(String[] args) {
        char[] a = {'A','b','d','A'};
        System.out.println(omorganiser(a));

    }

    public static void bytt(char[] c, int i, int j){
        char temp = c[i];c[i] = c[j]; c[j] = temp;
    }
    public static int omorganiser(char[] c){
        Arrays.sort(c);
        int h = c.length;
        int v = 0;
        for(v = 0, h = c.length-1; v < h;) // snur tabellen - orden n
        {
            bytt(c,v++,h--);
        }
        int antall = 0;
        while(antall < c.length && c[antall] > 'Z')
        {
            antall++;
        }
        return antall;
    }
}
