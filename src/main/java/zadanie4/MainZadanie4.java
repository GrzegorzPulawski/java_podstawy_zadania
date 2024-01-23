package zadanie4;

import java.util.Scanner;

public class MainZadanie4 {
    public static void main(String[] args) {
        wypiszLiczby();

    }

    public static void wypiszLiczby() {
        Scanner scanner = new Scanner(System.in);
        int wprowadzonaLiczba = scanner.nextInt();
        System.out.println("liczby od 1 do " + wprowadzonaLiczba);
        for (int i = 0; i <= wprowadzonaLiczba; i++) {
            if (i % 3 == 0) {
                System.out.println("pif");
            } else if (i % 7 == 0) {
                System.out.println("paf");
            } else
                System.out.println(i);
        }
    }
}
