package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array1 = {1,10,4,5,2,12};
        System.out.println(Arrays.toString(array1));
        int [] changedArray = changeArray(array1);
        printArray(changedArray);
    }
    //Zadanie dodatkowe:
    //Napisz program, który odwróci zawartość tablicy, np.
    //[1, 10, 4, 5, 2, 12] -> [12, 2, 5, 4, 10, 1]
    public static int [] changeArray(int[] tablica){
        int dlugoscTablicy = tablica.length;
        int polowaTablicy = dlugoscTablicy/2;

        for (int i = 0; i < polowaTablicy; i++) {
            int temp = tablica[i];
            tablica[i] = tablica[dlugoscTablicy - 1 - i];
            tablica[dlugoscTablicy - 1 - i] = temp;
        }return tablica;
    }
    public static void printArray(int [] tablica){
        for (int elementTablicy : tablica){
            System.out.print(elementTablicy + ",");
        }
        System.out.println();

    }
}