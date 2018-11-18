package pl.respektan.input;

import pl.respektan.*;

import java.io.IOException;

public class InputHandler {

    public void wyborUsera (String wybor) throws IOException {
        switch (wybor) {
            case "1":
            case "2":
            case "3":
                new AddInputHandler().wyborUsera(wybor);
                break;
            case "4":
            case "5":
            case "6":
                new DisplayInputHandler().wyborUsera(wybor);
                break;
            case "7":
            case "8":
            case "9":
                new DeleteInputHandler().wyborUsera(wybor);
                break;
            case "0":
                break;
            default:
                MenuService.wyswietlBlad();
                break;
        }
    }
}