package pl.respektan;

import pl.respektan.input.InputHandler;

import java.io.IOException;
import java.util.Scanner;

public class App {



    public static void main(String[] args) throws IOException {
        String wybor = "";
        Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler();
        while (!"0".equals(wybor)) {
            MenuService.wyswietlMenu();
            wybor = scanner.nextLine();
            System.out.println("Wybrano: >>" + wybor + "<<");
            inputHandler.wyborUsera(wybor);
        }


//       this.zajecia.add(new Zajecia()) // z tej klasy
//        uczelnia.getZajecia().add(new Zajecia()) // z innej klasy
    }
}
