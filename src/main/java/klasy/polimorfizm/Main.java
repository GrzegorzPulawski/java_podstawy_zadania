package klasy.polimorfizm;

public class Main {

    public static void main(String[] args) {
        Sterownik driver1 = new SterownikMariadb();
        Sterownik driver2 = new SterownikElasticSearch();
        Controller cont = new Controller(driver2);

        Controller cont2 = new Controller(new SterownikElasticSearch());
        System.out.println(driver1.isThisCommandAllowed("Hallo"));
        System.out.println(driver1.getSpecialCommand());
        System.out.println(driver2.getSpecialCommand());
        cont.sendData("abc");
        Sterownik sterownik = new Sterownik() { // mogę stworzyć instancję klasy abstrakcyjnej zapisem klasy anonimowej
            @Override
            String getSpecialCommand() {
                return "XYZXYZ";
            }

            @Override
            boolean isThisCommandAllowed(String command) {
                return false;
            }

        };
        // poniżej mechanizm zamiany SterownikMariadb na zmienną Sterownik i spowrotem
        //  SterownikMariadb mariadb = new SterownikMariadb();
        // Sterownik sterownik_m = mariadb;

        //  SterownikMariadb mariadb_znow = (SterownikMariadb) sterownik_m;

        //  SterownikElasticSearch elastic = new SterownikElasticSearch();
        //   Sterownik sterownik_el = elastic;

        // poniżej błąd bo próbuję procesu odwrotnego castowania ale instancja SterownikElasticSearch nie może stać się SterownikMariadb
        // SterownikMariadb elastic_blad = (SterownikMariadb) sterownik_el;
    }
}
