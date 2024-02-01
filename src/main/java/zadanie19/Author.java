package zadanie19;

public class Author {
    private String surname;
    private String nationality;

    public String getSurname() {
        return surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;


    }
}
