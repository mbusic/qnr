package org.example;

import org.example.geometry.GeometricFigure;
import org.example.geometry.Rectangle;
import org.example.misc.Colour;

public class Main {

    public static void main(String[] args) {

        // Ovo je objekt nastao na temelju klase Rectangle

        Rectangle rectangle = new Rectangle();
        rectangle.setA(10.5);
        rectangle.setB(11.7);
        rectangle.setColour(Colour.BLUE);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getColour());

        // Kojeg tipa je varijabla rectangle?
        // Ona je tipa Rectangle...

        System.out.println("rectangle is rectangle: " + String.valueOf(rectangle instanceof Rectangle));

        // ... ali je i tipa GeometricFigure (zato jer Rectangle implementira GeometricFigure, a to je
        // za interface isto što je nasljeđivanje za klasu - dakle zapravo "nasljeđuje" od GeometricFigure.
        // A kad postoji nasljeđivanje, onda kažemo da taj objekt __jest__ GeometricFigure.

        System.out.println("rectangle is geometric figure: " + String.valueOf(rectangle instanceof GeometricFigure));

        // Idemo sad stvoriti objekt na temelju anonimne klase.
        // Vidi da tu imamo jedan problem: objekt mora imati tip.
        // Kojeg je tipa ovaj objekt? Pa on je GeometricFigure, ali za razliku od
        // Rectangle i Circle, nema svoju klasu (koja ima neko ime), nego je samo GeometricFigure
        // jer je nastao na temelju __anonimne klase__
        //
        // No, s obzirom da je on GeometricFigure, nikakve nove metode koje definiramo unutar vitičastih zagrada
        // neće biti dostupne, jer ih GeometricFigure ne poznaje.

        GeometricFigure triangle = new GeometricFigure() {

            private double a = 10;  // nemamo načina postaviti ove vrijednosti izvana
            private double b = 20;
            private Colour colour = Colour.RED;

            // Nitko nam ne brani da stvorimo ovu metodu,
            // ali ona neće biti dostupna, jer je GeometricFigure ne poznaje.
            public void setColour(Colour colour) {
                this.colour = colour;
            }

            @Override public double getArea() {
                return a * b / 2;
            }

            @Override public Colour getColour() {
                return colour;
            }
        };

        System.out.println("triangle is a geometric figure " + String.valueOf(triangle instanceof GeometricFigure));

        // triangle.setColour(Colour.RED);    - ovo se ne može kompajlirati

        System.out.println("Area of triangle: " + triangle.getArea());
        System.out.println("Triangle's colour: " + triangle.getColour());


    }
}