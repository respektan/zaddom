package pl.respektan.input;

import pl.respektan.*;
import pl.respektan.usuwanie.UsuwaczStudentow;
import pl.respektan.usuwanie.UsuwaczWykladowcow;
import pl.respektan.usuwanie.UsuwaczZajec;

import java.io.IOException;

public class DeleteInputHandler {
    public void wyborUsera (String wybor) throws IOException {

        switch (wybor) {
            case "7":
                UsuwaczZajec.usunZajecia();
                break;
            case "8":
                UsuwaczStudentow.usunStudenta();
                break;
            case "9":
                UsuwaczWykladowcow.usunWykladowce();
                break;
            default: {
                MenuService.wyswietlBlad();
                break;
            }
        }
    }
}
