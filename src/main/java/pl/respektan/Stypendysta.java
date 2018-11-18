package pl.respektan;

import java.time.LocalDate;

public class Stypendysta extends Student {

    private double stypendium;

    public Stypendysta(String imie, String nazwisko, LocalDate dataUrodzenia, char plec, int numerIndeksu, double stypendium) {
        super(imie, nazwisko, dataUrodzenia, plec, numerIndeksu);
        this.stypendium = stypendium;
    }

    public double getStypendium() {
        return stypendium;
    }

    public void setStypendium(double stypendium) {
        this.stypendium = stypendium;
    }

    @Override
    public String toString() {
        return super.toString() + "Kwota stypendium: " + stypendium + "\n";
    }

}