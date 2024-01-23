package tablice.usunduplikatory;

import java.util.Arrays;

public class Main {
    //Napisz program usuwający duplikaty z tablicy i zwracający nową tablicę, np.
    //Tablica wejściowa: [20, 20, 30, 40, 50, 50, 50],
    //Tablica wyjściowa: [20, 30, 40, 50]
    public static void main(String[] args) {
        int[] originalArray = {20, 20, 30, 40, 50, 50, 50};
        System.out.println(Arrays.toString(originalArray));
        int[] arrayWithoutDuplicate = deleteDuplicate(originalArray);
        System.out.println(Arrays.toString(arrayWithoutDuplicate));
    }

    public static int[] deleteDuplicate(int[] tablica) {

        int unikalneElementy = 0;
        for (int i = 0; i < tablica.length - 1; i++) {
            if (tablica[i] != tablica[i + 1]) {
                unikalneElementy++;
            }
        }
        int[] arrayWithoutDuplicate = new int[unikalneElementy];
        unikalneElementy = 0;
        for (int i = 0; i < tablica.length - 1; i++) {
            if (tablica[i] != tablica[i + 1]) {
                arrayWithoutDuplicate[unikalneElementy++] = tablica[i];
            }
        }
        return arrayWithoutDuplicate;
    }
}
