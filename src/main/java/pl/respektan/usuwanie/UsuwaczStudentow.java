package pl.respektan.usuwanie;

import pl.respektan.Uczelnia;
import pl.respektan.WyswietlaczObiektowZListy;

import java.util.Scanner;

public class UsuwaczStudentow {
    public static void usunStudenta() {
        Scanner scanner = new Scanner(System.in);
        WyswietlaczObiektowZListy.wyswietlObiekty(Uczelnia.getInstance().getStudenci());
        System.out.println("0.\tPowrót");
        System.out.print("Którego studenta chcesz usunąć? ");
        String wyborStr = scanner.nextLine();
        int wybor = Integer.parseInt(wyborStr);
        if (wybor == 0) {
            return;
        }
        Uczelnia.getInstance().getStudenci().remove(wybor - 1);
    }
}
