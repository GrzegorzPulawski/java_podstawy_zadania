package klasy.abstrakcyjne.employee;

public class FullTimeEmpolyee extends Employee {
    //Klasa FullTimeEmployee
    //
    //Klasa FullTimeEmployee powinna dziedziczyć po klasie Employee. Dodatkowo powinna zawierać:
    //
    //dwa pola: salary, benefits
    //konstruktor z parametrami: name, department, salary, benefits
    //metody typu getter i setter dla zdeklarowanych pól
    //implementację metody showDetails, która wyświetla informacje o pracowniku na pełnym etacie
    private int salary;
    private String benefits;

    public FullTimeEmpolyee(String name, String department, int salary, String benefits) {
        super(name, department);
        this.salary = salary;
        this.benefits = benefits;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
    @Override
    public String showDetails(){
        return " Imię: " + getName()+
                getDepartment()+
                getSalary()+
                getBenefits();
    }
}
