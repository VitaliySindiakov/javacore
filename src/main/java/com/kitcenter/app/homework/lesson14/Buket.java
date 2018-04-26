package com.kitcenter.app.homework.lesson14;

public class Buket {
    public int buket() {
        Flowers romashka = new Romashka();
        Flowers pion = new Pion();

        Flowers roza = new Roza();
        return romashka.prise() + roza.prise()+pion.prise();
    }
}
