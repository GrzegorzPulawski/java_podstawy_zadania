package zadanie15;

import java.util.Scanner;

public class MainZadanie15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilośc liczb");
        int iloscLiczb = scanner.nextInt();
        int[] tablica = new int[iloscLiczb];

        System.out.println("Podaj liczbe: ");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = scanner.nextInt();

        }
        znajdzPowtarzajaceLiczby(tablica);
    }

    public static void znajdzPowtarzajaceLiczby(int[] tablica) {
        System.out.println("Powtarzajace liczby to: ");
        for (int i = 0; i < tablica.length; i++) {
            for (int j = i +1; j < tablica.length; j++) {
                if (tablica[i] == tablica[j]) {
                    System.out.println("duplikat" + tablica[i]);
                }
            }
        }
    }
}
