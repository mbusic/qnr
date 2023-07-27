package org.example.radnici;

import org.example.Osoba;
import org.example.ZadovoljnaOsoba;

public class Radnik extends Osoba implements ZadovoljnaOsoba {

    final float brojRadnihSati;

    public Radnik(String ime, String prezime, float brojRadnihSati) {
        super(ime, prezime);
        this.brojRadnihSati = brojRadnihSati;
    }

    public Radnik(String imePrezime) {
        super(imePrezime);
        this.brojRadnihSati = 0;
    }

    @Override public boolean jeZadovoljan() {
        return brojRadnihSati < 30;
    }
}
