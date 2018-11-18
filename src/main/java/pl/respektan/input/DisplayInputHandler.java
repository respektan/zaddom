package pl.respektan.input;

import pl.respektan.*;

import java.io.IOException;

public class DisplayInputHandler {
    public void wyborUsera (String wybor) throws IOException {
        switch (wybor) {
            case "4": {
                WyswietlaczObiektowZListy.wyswietlObiekty(Uczelnia.getInstance().getZajecia());
                break;
            }
            case "5": {
                WyswietlaczObiektowZListy.wyswietlObiekty(Uczelnia.getInstance().getStudenci());
                break;
            }
            case "6": {
                WyswietlaczObiektowZListy.wyswietlObiekty(Uczelnia.getInstance().getWykladowcy());
                break;
            }
            default: {
                MenuService.wyswietlBlad();
                break;
            }
        }
    }
}
