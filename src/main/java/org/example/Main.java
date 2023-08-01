package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.example.geometrija.GeometrijskiLik;
import org.example.geometrija.Kvadrat;
import org.example.geometrija.Trokut;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        Kvadrat kvadrat = new Kvadrat(10, 10);
//        Trokut trokut = new Trokut(5, 5);
//
//        System.out.println(kvadrat.getPovrsina());
//        System.out.println(trokut.getPovrsina());
//
//        GeometrijskiLik whatever = new Kvadrat(4, 4);
////        System.out.println(whatever.metodaOdKvadrata());
//        System.out.println(whatever.getPovrsina());
//
//        Kvadrat novKvadrat = (Kvadrat) whatever;
//        novKvadrat.metodaOdKvadrata();

        List<GeometrijskiLik> likovi = new LinkedList<>();
        likovi.add(new Kvadrat(10, 10));
        likovi.add(new Trokut(5, 5));

        for (GeometrijskiLik lik : likovi) {
            System.out.println(lik.getPovrsina());
        }

        List<GeometrijskiLik> novaLista = likovi;
        System.out.println("stigli smo do kraja");

    }
}
