package org.example.geometrija;

public class Kvadrat extends GeometrijskiLik{

    private long stranicaA;
    private long stranicaB;

    public Kvadrat(long stranicaA, long stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    @Override public long getPovrsina() {
        System.out.println("Površina kvadrata");
        return stranicaA * stranicaB;
    }
    public void metodaOdKvadrata() {
        System.out.println("Ovo je metoda od kvadrata");
    }
}
