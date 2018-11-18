package pl.respektan.factory;

import pl.respektan.Uczelnia;
import pl.respektan.WyswietlaczObiektowZListy;
import pl.respektan.obiekty.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WczytywaczStudentowDoZajec {
    public static List<Student> wczytajStudentowDoZajec(Scanner scanner) {
        List<Student> wybraniStudenci = new ArrayList<>();
        List<Student> availableStudents = new ArrayList<>();
        availableStudents.addAll(Uczelnia.getInstance().getStudenci());

        Student wybranyStudent = WczytywaczStudentaDoZajec.wczytajStudentaDoZajec(scanner, availableStudents);
        while (wybranyStudent != null) {
            wybraniStudenci.add(wybranyStudent);
            availableStudents.remove(wybranyStudent);
            wybranyStudent = WczytywaczStudentaDoZajec.wczytajStudentaDoZajec(scanner, availableStudents);
        }

        return wybraniStudenci;
    }
}
