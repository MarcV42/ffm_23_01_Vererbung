package org.example;

public class Fahrzeug {

    private String hersteller;
    private String modell;
    private int baujahr;


    public Fahrzeug() {

    }
    public Fahrzeug(String hersteller, String modell, int baujahr) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
    }



    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setHersteller(String hersteller) {
        hersteller = hersteller;
    }

    public void setModell(String modell) {
        modell = modell;
    }

    public void setBaujahr(int baujahr) {
        baujahr = baujahr;


    }}
