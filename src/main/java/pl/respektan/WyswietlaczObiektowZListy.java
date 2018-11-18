package pl.respektan;

import java.util.List;

public class WyswietlaczObiektowZListy {
    public static void wyswietlObiekty(List<? extends Object> lista) {
        int i = 0;
        for (Object o : lista) {
            System.out.println(++i);
            System.out.println(o);
        }
    }
}
