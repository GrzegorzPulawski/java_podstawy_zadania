package zadanie19;

public class Main {
    public static void main(String[] args) {


        //Napisz program, składający się z kilku klas:
        //a. Klasy Author, reprezentującą autora – pisarza wierszów, składającej się z pól surname oraz nationality (oba typu String)
        //b. Klasy Poem, reprezentującą wiersz, składającą się z pól creator (typu Author) oraz stropheNumbers (typu int – reprezentującej ilość zwrotek wiersza)
        //c. Klasy Main, w której znajdzie się metoda main, a w niej kod w którym:
        //i. Stworzysz trzy obiekty klasy Poem, uzupełniając go wszystkimi danymi (używając konstruktora lub setter'ów) i zapiszesz je w tablicy
        //ii. Wypiszesz nazwisko tego autora, który napisał wiersz o największej liczbie zwrotek (niech odpowiedź obliczy Twój program!)
        Author author1 = new Author("Lesmian", "polish");
        Author author2 = new Author("Pawlikowska", "polish");
        Author author3 = new Author("Alington", "english");
        Poem poem1 = new Poem(author1, 120);
        Poem poem2 = new Poem(author2, 150);
        Poem poem3 = new Poem(author3, 160);

        Poem[] poemsArray = {poem1, poem2, poem3};

        int maxStropher = 0;
        Author authorMaxStropher = poemsArray[0].getCreator();

        for (int i = 1; i < poemsArray.length; i++) {
            if (poemsArray[i].getStropheNumbers() > maxStropher) {
                maxStropher = poemsArray[i].getStropheNumbers();

                authorMaxStropher = poemsArray[i].getCreator();
            }
        }

        System.out.println(authorMaxStropher.getSurname());
    }
}

