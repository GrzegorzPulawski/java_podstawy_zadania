package klasy.abstrakcyjne.employee;

public class PartTimeEmployee extends Employee{
    //Klasa PartTimeEmployee
    //
    //Klasa PartTimeEmployee również dziedziczy po klasie Employee. Dodatkowo zawiera:
    //
    //dwa pola: hourlyRate, hoursWorked
    //konstruktor z parametrami: name, department, hourlyRate, hoursWorked
    //metody typu getter i setter dla zdeklarowanych pól
    //implementację metody showDetails, która wyświetla informacje o pracowniku na część etatu
    private int hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(){};

    public PartTimeEmployee(String name, String department, int hourlyRate, int hoursWorked) {
        super(name, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }

    @Override
    public String showDetails(){
        return " Name:" + getName()+
                getDepartment()+
                getHourlyRate()+" "+
                getHoursWorked();
    }

}
