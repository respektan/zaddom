package pl.respektan.factory;

import pl.respektan.*;
import pl.respektan.obiekty.Student;
import pl.respektan.obiekty.Wykladowca;
import pl.respektan.obiekty.Zajecia;

import java.util.List;
import java.util.Scanner;

public class WczytywaczZajec {
    public static void wczytajZajecia() {
        if (Uczelnia.getInstance().getWykladowcy().isEmpty() || Uczelnia.getInstance().getStudenci().isEmpty()) {
            System.out.println("Wprowadź conajmniej jednego wykładowcę i studenta przed dodawaniem zajęć");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę zajęć: ");
        String nazwaZajec = scanner.nextLine();
        Wykladowca wybranyWykladowca = WczytywaczWykladowcyDoZajec.wczytajWykladowceDoZajec(scanner);
        System.out.print("Wybierz salę: ");
        String numerSali = scanner.nextLine();
        List<Student> wybraniStudenci = WczytywaczStudentowDoZajec.wczytajStudentowDoZajec(scanner);
        Uczelnia.getInstance().getZajecia().add(new Zajecia(nazwaZajec, wybranyWykladowca, numerSali, wybraniStudenci));
    }

}
