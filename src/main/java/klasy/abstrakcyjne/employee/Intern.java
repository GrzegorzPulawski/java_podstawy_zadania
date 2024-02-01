package klasy.abstrakcyjne.employee;

public  class Intern extends PartTimeEmployee{
    //Klasa Intern
    //
    //Klasa Intern dziedziczy po klasie PartTimeEmployee. Dodatkowo zawiera:
    //
    //jedno pole: university
    //konstruktor z parametrami: name, department, hourlyRate, hoursWorked, university
    //metody typu getter i setter dla zdeklarowanego pola
    //własną implementację metody showDetails, która dodatkowo wyświetla informacje o uczelni stażysty

    private String university;

    public Intern(String name, String department, int hourlyRate, int hoursWorked, String university) {
        super(name, department, hourlyRate, hoursWorked);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    @Override
    public String showDetails(){
            return" Name:" + getName()+
                            getDepartment()+
                            getHourlyRate()+" "+
                            getHoursWorked()+
                            getUniversity();
    }
}
