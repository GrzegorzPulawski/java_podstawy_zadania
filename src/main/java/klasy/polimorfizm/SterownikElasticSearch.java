package klasy.polimorfizm;

public class SterownikElasticSearch extends Sterownik {
    @Override
    String getSpecialCommand() {
        return "SELECT UPDATE elastic";
    }

    @Override
    boolean isThisCommandAllowed(String command) {
        return true;
    }
}
