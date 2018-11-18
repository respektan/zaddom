package pl.respektan.usuwanie;

import pl.respektan.Uczelnia;
import pl.respektan.WyswietlaczObiektowZListy;

import java.util.Scanner;

public class UsuwaczWykladowcow {
    public static void usunWykladowce() {
        Scanner scanner = new Scanner(System.in);
        WyswietlaczObiektowZListy.wyswietlObiekty(Uczelnia.getInstance().getWykladowcy());
        System.out.println("0.\tPowrót");
        System.out.print("Którego wykładowcę chcesz usunąć? ");
        String wyborStr = scanner.nextLine();
        int wybor = Integer.parseInt(wyborStr);
        if (wybor == 0) {
            return;
        }
        Uczelnia.getInstance().getWykladowcy().remove(wybor - 1);
    }
}
