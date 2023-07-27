package org.example;

import org.bouncycastle.util.Strings;

public abstract class Osoba {

    private final String ime;
    private final String prezime;

    public Osoba (String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Osoba(String imePrezime) {
        var komponenteImena = Strings.split(imePrezime, ' ');
        if (komponenteImena.length < 2) {
            throw new IllegalArgumentException("Nedostaje ime ili prezime");
        }
        this.ime = komponenteImena[0];
        this.prezime = komponenteImena[1];
    }

    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }
}
