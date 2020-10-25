package com.company;

import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Floette p1 = new Floette("Намджун", 1);
        Florges p2 = new Florges("Чонгук", 1);
        Latias p3 = new Latias("Чингачгук", 1);
        Eevee p4 = new Eevee("Гойко Митич", 1);
        Espeon p5 = new Espeon("Джин", 1);
        Flabebe p6 = new Flabebe("Юнги", 1);

        b.addAlly(p1);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addAlly(p6);



        b.go();
    }
}
