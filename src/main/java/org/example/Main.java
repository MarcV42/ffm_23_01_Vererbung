package org.example;

public class Main{
    public static void main(String[] args) {

        Fahrzeug Auto1 = new Fahrzeug("VW", "Polo", 1976);
        Auto VW1 = new Auto("VW", "Golf", 1980, 4);

        System.out.println(Auto1.getModell());
        System.out.println(VW1.getHersteller());
    }}


