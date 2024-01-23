package zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        countEquation();
    }
    public static void countEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zmienna a:");
        int a = scanner.nextInt();
        System.out.println("Podaj zmienna b:");
        int b = scanner.nextInt();
        System.out.println("Podaj zmienna c:");
        int c = scanner.nextInt();
        double delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            double pierwiatekDelta = Math.sqrt(delta);
            double x1 = (-b - pierwiatekDelta) / 2 * a;
            double x2 = (-b + pierwiatekDelta) / 2 * a;
            System.out.println("Równanie ma dwa pierwiastki rzeczywiste: " + x1 + " " + x2);

        } else {
            System.out.println("Delta ujemna!");
        }
    }
}
