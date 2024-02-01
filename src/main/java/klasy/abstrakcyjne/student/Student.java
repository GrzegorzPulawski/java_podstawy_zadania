package klasy.abstrakcyjne.student;

public class Student extends Person {
//Klasa Student
//Zaimplementuj klasę Student. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
//* trzy pola: typ studiów, rok studiów, koszt studiów
//* konstruktor z trzema parametrami: typ studiów, rok studiów, koszt studiów
//* metody typu getter dla zdeklarowanych pól
//* metody typu setter dla zdeklarowanych pól
//* metoda showDetails wyświetlająca szczegółowe informacje o studencie
private String typStudiow;
private String rokStudiow;
private int kosztStudiow;



    public Student(String name, String address, String typStudiow, String rokStudiow, int kosztStudiow) {
        super(name, address);
        this.typStudiow = typStudiow;
        this.rokStudiow = rokStudiow;
        this.kosztStudiow = kosztStudiow;
    }


    public String getTypStudiow() {
        return typStudiow;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public String getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(String rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public int getKosztStudiow() {
        return kosztStudiow;
    }

    public void setKosztStudiow(int kosztStudiow) {
        this.kosztStudiow = kosztStudiow;
    }
    @Override
    public String showDetails(){
        return " Student "+ getName()+
                " adres " + getAddress() +
                " Rok studiow "+ getRokStudiow()+
                " Typ studiow " + getTypStudiow()+
                " Koszt studiow "+ getKosztStudiow();
    }
}

