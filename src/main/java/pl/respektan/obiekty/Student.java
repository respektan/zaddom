package pl.respektan.obiekty;

import java.time.LocalDate;

public class Student extends Osoba {

    private String numerIndeksu;

    public Student(String imie, String nazwisko, LocalDate dataUrodzenia, char plec, String numerIndeksu) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.numerIndeksu = numerIndeksu;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(String numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    @Override
    public String toString() {
        return super.toString() + "Numer indeksu: " + numerIndeksu + "\n";
    }

}
