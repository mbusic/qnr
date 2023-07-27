package org.example;

public class Student extends Osoba {

    private final float prosjek;

    // Konstruktor je metoda koja se zove jednako kao klasa i nema return type.
    public Student(String ime, String prezime, float prosjek) {
        super(ime, prezime);
        this.prosjek = prosjek;
    }

    public Student(String ime, String prezime) {
        super(ime, prezime);
        prosjek = 0;
    }

    public Student(String imePrezime) {
        super(imePrezime);
        prosjek = 0;
    }

    public float getProsjek() {
        return this.prosjek;
    }

}
