package klasy.polimorfizm;


public abstract class Sterownik {

    private int version = 0;

    public Sterownik(int version) {
        this.version = version;
    }

    public Sterownik() {
    }

    abstract String getSpecialCommand();

    abstract boolean isThisCommandAllowed(String command);
}














