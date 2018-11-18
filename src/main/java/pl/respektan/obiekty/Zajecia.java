package pl.respektan.obiekty;

import java.util.List;

public class Zajecia {

    public String nazwaZajec;

    private Wykladowca wykladowca;
    private String numerSali;
    private List<Student> studenci;

    public Zajecia(String nazwaZajec, Wykladowca wykladowca, String numerSali, List<Student> studenci) {
        this.nazwaZajec = nazwaZajec;
        this.wykladowca = wykladowca;
        this.numerSali = numerSali;
        this.studenci = studenci;
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
                ", numerSali=" + numerSali +
                ", studenci=" + studenci +
                '}';
    }

    public Wykladowca getWykladowca() {
        return wykladowca;
    }

    public void setWykladowca(Wykladowca wykladowca) {
        this.wykladowca = wykladowca;
    }

    public String getNumerSali() {
        return numerSali;
    }

    public void setNumerSali(String numerSali) {
        this.numerSali = numerSali;
    }

    public List<Student> getStudenci() {
        return studenci;
    }

    public void setStudenci(List<Student> studenci) {
        this.studenci = studenci;
    }
}
