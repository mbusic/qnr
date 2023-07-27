package org.example.studenti;

import org.example.Osoba;
import org.example.ZadovoljnaOsoba;

public class Student extends Osoba implements ZadovoljnaOsoba {

    private final float prosjek;
    private final boolean imaDeckaIliCuru;

    // Konstruktor je metoda koja se zove jednako kao klasa i nema return type.
    public Student(String ime, String prezime, float prosjek, boolean imaDeckaIliCuru) {
        super(ime, prezime);
        this.prosjek = prosjek;
        this.imaDeckaIliCuru = imaDeckaIliCuru;
    }

    public Student(String ime, String prezime) {
        super(ime, prezime);
        prosjek = 0;
        imaDeckaIliCuru = false;
    }

    public Student(String imePrezime) {
        super(imePrezime);
        prosjek = 0;
        imaDeckaIliCuru = false;
    }

    public float getProsjek() {
        return this.prosjek;
    }

    @Override public boolean jeZadovoljan() {
        return prosjek > 2 && imaDeckaIliCuru;
    }
}
