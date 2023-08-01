package org.example.geometrija;

public class Trokut extends GeometrijskiLik {

    private long baza;
    private long visina;

    public Trokut(long baza, long visina) {
        this.baza = baza;
        this.visina = visina;
    }

    @Override
    public long getPovrsina() {
        System.out.println("Površina trokuta");
        return baza * visina / 2;
    }

}
