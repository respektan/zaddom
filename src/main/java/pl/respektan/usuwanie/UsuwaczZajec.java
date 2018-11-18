package pl.respektan.usuwanie;

import pl.respektan.Uczelnia;
import pl.respektan.WyswietlaczObiektowZListy;

import java.util.Scanner;

public class UsuwaczZajec {
    public static void usunZajecia() {
        Scanner scanner = new Scanner(System.in);
        WyswietlaczObiektowZListy.wyswietlObiekty(Uczelnia.getInstance().getZajecia());
        System.out.println("0.\tPowrót");
        System.out.print("Które zajęcia chcesz usunąć? ");
        String wyborStr = scanner.nextLine();
        int wybor = Integer.parseInt(wyborStr);
        if (wybor == 0) {
            return;
        }
        Uczelnia.getInstance().getZajecia().remove(wybor - 1);
    }
}
