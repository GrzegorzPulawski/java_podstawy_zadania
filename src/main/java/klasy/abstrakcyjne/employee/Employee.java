package klasy.abstrakcyjne.employee;

public abstract class Employee {
    //Klasa abstrakcyjna Employee
    //
    //Klasa Employee powinna być klasą abstrakcyjną zawierającą:
    //
    //dwa pola typu String: name, department
    //konstruktor bezparametrowy ustawiający wartość pól name i department na pusty String
    //konstruktor z dwoma parametrami: String name, String department
    //metody typu getter odpowiedzialne za zwracanie wartości zmiennych: name, department
    //metody typu setter odpowiedzialne za ustawianie wartości pól name, department
    //abstrakcyjną metodę showDetails
    private String name;
    private String department;
    public Employee(){};

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
   abstract String showDetails();
}
