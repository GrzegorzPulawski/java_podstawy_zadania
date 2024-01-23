package zadanie8;

import java.util.Scanner;

public class MainZadanie8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Mozesz wykonac operacje: +, -, * , / .");
        String input = scanner.next();
        char operator = input.charAt(0);
        System.out.println("Podaj druga liczbę: ");
        float secondNumber = scanner.nextFloat();
        float result;


        switch (operator) {

            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber- secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':

                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Nie można dzielić przez zero.");
                    return;
                }
                break;
            default:
                System.out.println(" Nieprawidłowy operator.");
                return;
        }System.out.println("Wynik: " + result);
    }
}