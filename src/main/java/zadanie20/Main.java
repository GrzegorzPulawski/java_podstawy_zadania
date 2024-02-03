package zadanie20;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Napisz program, który będzie z Tobą grał w „za dużo, za mało”. Na początku komputer losuje liczbę z zakresu
        // od 0 do 100 (podpowiedź: skorzystaj z metody Random.nextInt()) a następnie czeka na podanie liczby przez użytkownika.
        // Jeśli użytkownik poda liczbę większą, niż wylosowana przez komputer, program powinien wypisać „za dużo” i czekać
        // na podanie kolejnej liczby. Jeśli użytkownik poda liczbę mniejszą, program powinien wypisać „za mało” i analogicznie
        // czekać na następną liczbę. Jeśli użytkownik poda odpowiednią wartość, to program powinien wypisać słowo „Bingo!” i
        // zakończyć się.
        boolean warunekSpelniony = false;
        Random random = new Random();
        int liczbaLosowana = random.nextInt(101);
        while (!warunekSpelniony) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę!");
            int liczbaPodana = scanner.nextInt();
            if (liczbaPodana > liczbaLosowana) {
                warunekSpelniony = false;
                System.out.println("Za dużo!");
            } else if (liczbaPodana< liczbaLosowana) {
                warunekSpelniony = false;
                System.out.println("Za mało!");
            } else if (liczbaPodana==liczbaLosowana) {
                warunekSpelniony = true;
                System.out.println("Bingo!");

            }
        }
    }
}
