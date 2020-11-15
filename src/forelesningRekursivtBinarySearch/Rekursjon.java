package forelesningRekursivtBinarySearch;


public class Rekursjon {
    public static void main(String[] args) {
       // int value = 15;
       // int return_value = rekursivFunksjon(value);
        //System.out.println("Main " + return_value);
        int fem_faktorial = faktorial(5);
        System.out.println("5! = " + fem_faktorial);
        System.out.println("9! = " + faktorial(9));

    }


    static int faktorial(int n){
        if(n == 1){
           return n;
        }else
        return n * faktorial(n-1);
    }

    static int rekursivFunksjon(int value){
        System.out.println("Rekursiv funksjon: " + value);

        if(value <= 5){
            System.out.println("verdien er mindre enn fem");
            return -9;
        }
        else{
            return rekursivFunksjon(value-1);
        }
    }
}
