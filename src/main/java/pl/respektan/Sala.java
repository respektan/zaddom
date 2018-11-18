package pl.respektan;

public class Sala {

    public byte numerSali;

    public Sala(byte numerSali) {
        this.numerSali = numerSali;
    }

    public byte getNumerSali() {
        return numerSali;
    }

    public void setNumerSali(byte numerSali) {
        this.numerSali = numerSali;
    }

    @Override
    public String toString() {
        return super.toString() + "Numer sali: " + numerSali + "\n";
    }
}
