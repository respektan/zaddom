package pl.respektan.factory;

import pl.respektan.Uczelnia;
import pl.respektan.WyswietlaczObiektowZListy;
import pl.respektan.obiekty.Wykladowca;

import java.util.Scanner;

public class WczytywaczWykladowcyDoZajec {
    public static Wykladowca wczytajWykladowceDoZajec(Scanner scanner) {
        boolean wykladowcaValid = false;
        Wykladowca wybranyWykladowca = null;
        while (!wykladowcaValid) {
            WyswietlaczObiektowZListy.wyswietlObiekty(Uczelnia.getInstance().getWykladowcy());
            System.out.print("Wybierz wykladowcę: ");
            String wyborStr = scanner.nextLine();
            int wybor = Integer.parseInt(wyborStr);
            if (wybor > 0 && wybor <= Uczelnia.getInstance().getWykladowcy().size()) {
                wybranyWykladowca = Uczelnia.getInstance().getWykladowcy().get(wybor - 1);
                wykladowcaValid = true;
            }
        }
        return wybranyWykladowca;
    }
}
