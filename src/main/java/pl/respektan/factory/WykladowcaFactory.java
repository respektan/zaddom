package pl.respektan.factory;

import pl.respektan.Uczelnia;
import pl.respektan.obiekty.Wykladowca;

import java.util.Scanner;

public class WykladowcaFactory {
    public static void wczytajWykladowce() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String imie = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.print("Podaj tytuł naukowy: ");
        String tytulNaukowy = scanner.nextLine();
        Uczelnia.getInstance().getWykladowcy().add(new Wykladowca(imie, nazwisko, tytulNaukowy));
    }
}
