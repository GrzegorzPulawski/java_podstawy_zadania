package zadanie18;

import java.util.Scanner;

public class MainZadanie18 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst = scanner.nextLine();

        if (tekst.matches("a+\\ psik")){
            System.out.println("pasuje");
        }
        else {
            System.out.println("nie pasuje");
        }
    }
}
