package pl.respektan;

import java.io.IOException;

public class InputHandler {

    public void handleUserChoice (String choice) throws IOException {

        switch (choice) {
            case "1": {
                Student.stworzStudenta();
                break;
            }
            case "2": {
                Wykladowca.stworzWykladowce();
                break;
            }
            case "3": {
                Zajecia.stworzZajecia();
                break;
            }
            case "0": {
                break;
            }
            default: {
                MenuService.wyswietlBlad();
                break;
            }
        }
    }
}