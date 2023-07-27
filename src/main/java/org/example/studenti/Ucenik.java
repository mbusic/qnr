package org.example.studenti;

import org.example.Osoba;
import org.example.ZadovoljnaOsoba;

public class Ucenik extends Osoba implements ZadovoljnaOsoba {

    private final float prosjek;
    private final String imePrezimeRazednika;

    // Konstruktor je metoda koja se zove jednako kao klasa i nema return type.
    public Ucenik(String ime, String prezime, float prosjek, String imePrezimeRazrednika) {
        super(ime, prezime);
        this.prosjek = prosjek;
        this.imePrezimeRazednika = imePrezimeRazrednika;
    }

    public float getProsjek() {
        return this.prosjek;
    }

    public String getImePrezimeRazednika() {
        return this.imePrezimeRazednika;
    }

    @Override public boolean jeZadovoljan() {
        return prosjek > 4.5;
    }
}
