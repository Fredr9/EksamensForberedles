package forelesningRekursivtBinarySearch;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int values[] = {-99, 5, 9, 8, 3, 1};

        System.out.println("Array før heapify: " + Arrays.toString(values));
        heapify(values);
        heapify(values);
        heapify(values);
        heapify(values);
        System.out.println("Array etter heapify: " + Arrays.toString(values) );

    }

    static void heapify(int[] values) {
        for (int i = 1; i < values.length; ++i) {
            int current = i;
            int parent = i / 2;

            while (parent > 0 && values[parent] > values[current]) {
                System.out.println("Bytter " + current + " med " + parent);
                int temp = values[parent];
                values[parent] = values[current];
                values[current] = temp;
                current = parent;
                parent = current / 2;

            }
        }
    }
}
