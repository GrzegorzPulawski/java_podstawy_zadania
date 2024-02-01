package klasy.abstrakcyjne.employee;

public class Controller {
    private Employee show;

    public Controller(Employee show) {
        this.show = show;
    }

    public void printData() {
        System.out.println(" Imię: "+ this.show.getName()+ " departament: " + this.show.getDepartment());

    }
}
