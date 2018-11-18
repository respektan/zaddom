package pl.respektan;

import pl.respektan.obiekty.Student;
import pl.respektan.obiekty.Wykladowca;
import pl.respektan.obiekty.Zajecia;

import java.util.ArrayList;
import java.util.List;

public class Uczelnia {

    private static Uczelnia instance;

    public static Uczelnia getInstance() {
        if (instance == null) {
            instance = new Uczelnia();
        }
        return instance;
    }

    public static void dodajZajecia (String nazwaZajec, Wykladowca wykladowca, String numerSali, List<Student> studenci) {
        getInstance().getZajecia().add(new Zajecia(nazwaZajec, wykladowca, numerSali, studenci));
    }

    private List<Zajecia> zajecia = new ArrayList<>();
    private List<Wykladowca> wykladowcy = new ArrayList<>();
    private List<Student> studenci = new ArrayList<>();

    public List<Zajecia> getZajecia() {
        return zajecia;
    }

    public List<Wykladowca> getWykladowcy() {
        return wykladowcy;
    }

    public List<Student> getStudenci() {
        return studenci;
    }
}
