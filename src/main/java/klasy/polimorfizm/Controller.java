package klasy.polimorfizm;

public class Controller {

    private Sterownik driver;

    public Controller(Sterownik baza) { // przyjmuje typ Sterownik i to na nim wykonuje operacje, nie obchodzi go konkretna implementacja
        this.driver = baza;
    }

    public void sendData(String data) {
        System.out.println("data sending: " + this.driver.getSpecialCommand());
    }
}