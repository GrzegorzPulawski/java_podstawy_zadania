package klasy.abstrakcyjne.student;

public class Main {
    public static void main(String[] args) {
        //Zaimplementuj klasę abstrakcyjną Person. Klasa powinna zawierać:
        //* dwa pola typu String: name, address
        //* konstruktor bezparametrowy ustawiający wartość pól name i address na pusty String
        //* konstruktor z dwoma parametrami: String name, String address
        //* metody typu getter odpowiedzialne za zwracanie wartości zmiennej: name, address
        //* metody typu setter odpowiedzialne za ustawianie wartości pól name, address
        //* metoda abstrakcyjna showDetails
        //
        Student sudent1 = new Student("Kowalski", "Gdansk","matematyka", "2010", 10000);
        Lecturer lecturer1 = new Lecturer("Jabłoński", "Warszawa","Matematyk", 5000);
        System.out.println(sudent1.showDetails());
        System.out.println(lecturer1.showDetails());
        Person person = sudent1;
        System.out.println(person.showDetails());

    }
}
