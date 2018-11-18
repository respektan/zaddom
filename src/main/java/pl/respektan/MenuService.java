package pl.respektan;

public class MenuService {

   public static void wyswietlMenu() {

        System.out.println("****** MENU ******");
        System.out.println("1.\t Dodaj studenta.");
        System.out.println("2.\t Dodaj wykladowce.");
        System.out.println("3.\t Dodaj zajecia.");
        System.out.println("4.\t Wyswietl zajecia.");
        System.out.println("5.\t Wyswietl studentow.");
        System.out.println("6.\t Wyswietl wykladowcow.");
        System.out.println("7.\t Usun zajecia.");
        System.out.println("8.\t Usun studenta.");
        System.out.println("9.\t Usun wykladowce.");
        System.out.println();
        System.out.println("0.\t Wyjdz z programu.\n");
        System.out.print("Wybor: ");
    }
    public static void wyswietlBlad() {
        System.out.println("Blad! Wybierz poprawna opcje!");
        wyswietlMenu();
    }
}
