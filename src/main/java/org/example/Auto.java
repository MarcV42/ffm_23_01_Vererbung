package org.example;

public class Auto extends Fahrzeug {

    private int AnzahlTueren;

    public Auto(String hersteller, String modell, int baujahr) {
        super(hersteller, modell, baujahr);
    }

    public Auto(String hersteller, String modell, int baujahr, int anzahlTueren) {
        super(hersteller, modell, baujahr);
        AnzahlTueren = anzahlTueren;
    }

    public Auto() {

    }

    public int getAnzahlTueren() {
        return AnzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        AnzahlTueren = anzahlTueren;
    }


}
