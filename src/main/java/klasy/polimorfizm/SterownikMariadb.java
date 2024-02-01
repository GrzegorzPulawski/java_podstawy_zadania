package klasy.polimorfizm;

public class SterownikMariadb extends Sterownik {
    @Override
    String getSpecialCommand() {
        return "UPDATE SET WHERE xyz";
    }

    @Override
    boolean isThisCommandAllowed(String command) {
        return false;
    }
}