package klasy.abstrakcyjne.employee;

public class Main {
    //Zaimplementuj system zarządzania pracownikami korzystając z klas abstrakcyjnych i dziedziczenia.
    //Zadaniem jest zaimplementowanie powyższych klas.
    // Stwórz w main metodę która uniwersalnie dla wszystkich Employee wypisze ich imię i departament oraz metody
    // do wypisywania szczegółów oddzielnie dla PartTimeEmployee (i Intern) i FullTimeEmployee.
    public static void main(String[] args) {
        FullTimeEmpolyee fullTimeEmpolyee = new FullTimeEmpolyee(" Fabian "," Produkcja ", 40, " Karnet na siłownie");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(" Andrzej ", " Ksiegowość ", 30, 4);
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee(" Krzysiek ", " HR ", 35, 80);

        Intern intern = new Intern(" Jarek ", " Logistyka ", 50, 200, " Uniwersytet im. Kopernika");

        Controller controller = new Controller(fullTimeEmpolyee);
        Controller controller2 = new Controller(partTimeEmployee);
        Controller controller1 = new Controller(partTimeEmployee1);

        controller.printData();
        controller1.printData();
        controller2.printData();

        System.out.println(fullTimeEmpolyee.showDetails().toString());
        System.out.println(partTimeEmployee1.showDetails().toString());

        System.out.println(intern.showDetails().toString());

        PartTimeEmployee partTimeEmployee2 = intern;
        System.out.println(partTimeEmployee2.showDetails());
    }
}
