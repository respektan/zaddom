package pl.respektan.input;

import pl.respektan.*;
import pl.respektan.factory.StudentFactory;
import pl.respektan.factory.WykladowcaFactory;
import pl.respektan.factory.WczytywaczZajec;

public class AddInputHandler {
    public void wyborUsera (String wybor) {
        switch (wybor) {
            case "1": {
                StudentFactory.wczytajStudenta();
                break;
            }
            case "2": {
                WykladowcaFactory.wczytajWykladowce();
                break;
            }
            case "3": {
                WczytywaczZajec.wczytajZajecia();
                break;
            }
            default: {
                MenuService.wyswietlBlad();
                break;
            }
        }
    }
}
