package org.example;

import org.bouncycastle.util.Strings;

public class Student {

    private final String ime;
    private final String prezime;
    private final float prosjek;

    // Konstruktor je metoda koja se zove jednako kao klasa i nema return type.
    public Student(String ime, String prezime, float prosjek) {
        this.ime = ime;         // "this" se odnosi na ovaj objekt, inače da u metodi napišem "ime" bez this, to bi se odnosilo na argument metode
        this.prezime = prezime;
        this.prosjek = prosjek;
    }

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        prosjek = 0;
    }

    public Student(String imePrezime) {
        var komponenteImena = Strings.split(imePrezime, ' ');
        if (komponenteImena.length < 2) {
            throw new IllegalArgumentException("Nedostaje ime ili prezime");
        }
        this.ime = komponenteImena[0];
        this.prezime = komponenteImena[1];
        prosjek = 0;
    }

    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public float getProsjek() {
        return this.prosjek;
    }

}
