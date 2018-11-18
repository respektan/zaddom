package pl.respektan.obiekty;

public class Wykladowca extends Osoba {

    private String tytulNaukowy;

    public Wykladowca(String imie, String nazwisko, String tytulNaukowy) {
        super(imie, nazwisko);
        this.tytulNaukowy = tytulNaukowy;
    }

    public String getTytulNaukowy() {
        return tytulNaukowy;
    }

    public void setTytulNaukowy(String tytulNaukowy) {
        this.tytulNaukowy = tytulNaukowy;
    }

    @Override
    public String toString() {
        return "Imię: " + imie + "\nNazwisko: " + nazwisko + "\nTytul naukowy: " + tytulNaukowy + "\n";
    }

}
