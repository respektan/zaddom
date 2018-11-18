package pl.respektan.factory;

import pl.respektan.obiekty.Student;
import pl.respektan.Uczelnia;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentFactory {
    public static void wczytajStudenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String imie = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.print("Podaj datę urodzenia w formacie rrrr-MM-dd: ");
        LocalDate dataUrodzenia = LocalDate.parse(scanner.nextLine());
        System.out.print("Podaj plec (m lub k): ");
        String plecStr = scanner.nextLine();
        while (!"m".equals(plecStr) && !"k".equals(plecStr)) {
            plecStr = scanner.nextLine();
        }
        char plec = plecStr.charAt(0);
        System.out.print("Podaj numer indeksu: ");
        String numerIndeksu = scanner.nextLine();
        Uczelnia.getInstance().getStudenci().add(new Student(imie, nazwisko, dataUrodzenia, plec, numerIndeksu));
    }
}
