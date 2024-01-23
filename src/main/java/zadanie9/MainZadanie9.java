package zadanie9;

import java.util.Scanner;

public class MainZadanie9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int wiersz = 0; wiersz < 4; wiersz++) {
            for (int kolumna = 0; kolumna < number; kolumna++) {
                if (kolumna >= wiersz && kolumna % 2 == wiersz % 2) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
