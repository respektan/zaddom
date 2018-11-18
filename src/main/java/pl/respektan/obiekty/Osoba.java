package pl.respektan.obiekty;

import java.time.LocalDate;

public class Osoba {

    protected String imie;
    protected String nazwisko;
    protected LocalDate dataUrodzenia;
    protected char plec;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia, char plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public char getPlec() {
        return plec;
    }

    @Override
    public String toString() {
        return "Imie: " + imie
                + "\nNazwisko: " + nazwisko
                + "\nData urodzenia: " + dataUrodzenia
                + "\nPlec: " + plec + "\n";
    }
}