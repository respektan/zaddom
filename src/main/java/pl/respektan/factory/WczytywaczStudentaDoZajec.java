package pl.respektan.factory;

import pl.respektan.WyswietlaczObiektowZListy;
import pl.respektan.obiekty.Student;

import java.util.List;
import java.util.Scanner;

public class WczytywaczStudentaDoZajec {
    public static Student wczytajStudentaDoZajec(Scanner scanner, List<Student> availableStudents) {
        int wybor;
        while (true) {
            WyswietlaczObiektowZListy.wyswietlObiekty(availableStudents);
            System.out.println("0.\\ Zakończ dodawanie studentów");
            String wyborStr = scanner.nextLine();
            wybor = Integer.parseInt(wyborStr);
            if (wybor == 0) {
                return null;
            }
            if (wybor > 0 && wybor <= availableStudents.size()) {
                return availableStudents.get(wybor - 1);
            }
        }
    }
}
