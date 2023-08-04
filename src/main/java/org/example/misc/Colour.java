package org.example.misc;

// Enum je zgodna fora koja omogućava da definiraš konstante koje imaju svoje ime, umjesto da se
// sam sa sobom dogovoriš npr. da je bijela == 1, crna == 2, pa onda kažeš "if (colour == 1)... "
// Ovako možeš puno jasnije napisati "if (colour == WHITE)... "
// Enumi nisu samo to, mogu imati još sto stvari, ali za sad toliko - skup konstanti.

public enum Colour {
    WHITE,
    BLACK,
    BLUE,
    RED,
    YELLOW
}
