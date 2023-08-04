package org.example.geometry;

import org.example.misc.Colour;

// Interface definira da svaki geometrijski lik ima dvije metode, jedna koja vraća double
// i zove se getArea, pa pretpostavljamo da vraća površinu lika, druga koja vraća
// enum Colour i zove se getColour, pa pretpostavljamo da vraća boju lika.
// Primijeti da ovdje nemamo varijable koje bi sadržavale površinu ili boju. ž
// To je implementacija i to prepuštamo konkretnim klasama.

public interface GeometricFigure {

    public double getArea();
    public Colour getColour();

}
