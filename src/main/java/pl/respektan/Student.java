package pl.respektan;

import java.time.LocalDate;

public class Student extends Osoba {

    private int numerIndeksu;

    public Student(String imie, String nazwisko, LocalDate dataUrodzenia, char plec, int numerIndeksu) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.numerIndeksu = numerIndeksu;
    }

    public static void stworzStudenta() {
        // TODO: pobrać dane od użytkownika
        // TODO: String imie =
        // TODO: String nazwisko =
        // TODO: Student studen = new Student(imie, nazwisko, ...)
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    @Override
    public String toString() {
        return super.toString() + "Numer indeksu: " + numerIndeksu + "\n";
    }

//    public void stworzStudenta() {
//        Student student = new Student();
//        student.setNumerIndeksu();
//        System.out.println(student);
//    }

}
