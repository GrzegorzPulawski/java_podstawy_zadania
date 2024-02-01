package klasy.abstrakcyjne.student;

public class Lecturer extends Person{
    //Klasa Lecturer
    //
    //Zaimplementuj klasę Lecturer. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
    //* dwa pola: specjalizacja oraz wynagrodzenie
    //* konstruktor z dwoma parametrami: specjalizacja, wynagrodzenie
    //* metody typu getter dla zdeklarowanych pól
    //* metody typu setter dla zdeklarowanych pól
    //* metodę showDetails wyświetlającą szczegółowe informację o wykładowcy
    //Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.
    private String spcjalizacja;
    private int wynagrodzenie;

    public Lecturer(String spcjalizacja, int wynagrodzenie) {
        this.spcjalizacja = spcjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }

    public Lecturer(String name, String address, String spcjalizacja, int wynagrodzenie) {
        super(name, address);
        this.spcjalizacja = spcjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getSpcjalizacja() {
        return spcjalizacja;
    }

    public void setSpcjalizacja(String spcjalizacja) {
        this.spcjalizacja = spcjalizacja;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }
    @Override
    public String showDetails(){
        return " Lecturer "+ getName()+
                " adres: "+ getAddress()+
                " specjalizacja "+ getSpcjalizacja()+
                " wynagrodzenie " + getWynagrodzenie();


    }
}
