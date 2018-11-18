package pl.respektan;

import java.time.LocalDate;

public class Wykladowca extends Osoba {

    private String tytulNaukowy;

    public Wykladowca(String imie, String nazwisko, LocalDate dataUrodzenia, char plec, String tytulNaukowy) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.tytulNaukowy = tytulNaukowy;
    }

    public static void stworzWykladowce() {
    }

    public String getTytulNaukowy() {
        return tytulNaukowy;
    }

    public void setTytulNaukowy(String tytulNaukowy) {
        this.tytulNaukowy = tytulNaukowy;
    }

    @Override
    public String toString() {
        return super.toString() + "Tytul naukowy: " + tytulNaukowy + "\n";
    }
//    public void stworzWykladowce() {
//        Wykladowca wykladowca = new Wykladowca();
//        wykladowca.setTytulNaukowy();
//        System.out.println(wykladowca);
//    }


}
