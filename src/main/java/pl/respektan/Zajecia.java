package pl.respektan;

import java.util.List;

public class Zajecia {

    public String nazwaZajec;

    private Wykladowca wykladowca;
    private Sala sala;
    private List<Student> studneci;
    private Student student; // TODO: wywalic jak bedzie dzialac lista

    public Zajecia() {

    }

    public Zajecia(String nazwaZajec) {
        this.nazwaZajec = nazwaZajec;
    }

    public Zajecia(String nazwaZajec, Wykladowca wykladowca, Sala sala, Student student) {
        this.nazwaZajec = nazwaZajec;
        this.wykladowca = wykladowca;
        this.sala = sala;
        this.student = student;
    }

    public static void stworzZajecia() {
    }

    public void setNazwaZajec(String nazwaZajec) {
        this.nazwaZajec = nazwaZajec;
    }

    public String getNazwaZajec() {
        return nazwaZajec;
    }

    @Override
    public String toString() {
        return "Zajecia{" +
                "nazwaZajec='" + nazwaZajec + '\'' +
                ", wykladowca=" + wykladowca +
                ", sala=" + sala +
                ", student=" + student +
                '}';
    }

//    public static Zajecia stworzZajecia(String nazwa, Wykladowca wykladowca, Sala sala, Student student) {
//        Zajecia zajecia = new Zajecia(nazwa, wykladowca, sala, student);
//        return zajecia;
//    }

    public Wykladowca getWykladowca() {
        return wykladowca;
    }

    public void setWykladowca(Wykladowca wykladowca) {
        this.wykladowca = wykladowca;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
