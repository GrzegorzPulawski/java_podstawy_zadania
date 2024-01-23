package zadanie2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        checkBMI();
    }
//Napisz program obliczający BMI (Body Mass Index) i sprawdzający, czy jest ono w normie.
// Program powinien wczytywać od użytkownika dwie zmienne: wagę w kilogramach (typ float)
// oraz wzrost w centymetrach (typ int). BMI powinno zostać wyliczone zgodnie z poniższym wzorem:
    public static void checkBMI(){
        System.out.println("Podaj wage w kg: ");
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();
        System.out.println("Podaj wzrost w cm: ");
        int height = scanner.nextInt();
        float changedCM = (height /100f);
        float heightPotega= (float) Math.pow(changedCM, 2);
        float checkedBMI = weight/heightPotega;
        if (checkedBMI> 18.5 & checkedBMI< 24.9){
            System.out.println(" Twoje BMI jest OK");
        }else {
            System.out.println("Popracuj nad sylwetka");
        }

    }
}