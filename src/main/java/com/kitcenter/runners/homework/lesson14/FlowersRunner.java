package com.kitcenter.runners.homework.lesson14;

import com.kitcenter.app.homework.lesson14.*;

public class FlowersRunner {
    public static void main(String[] args) {
        Flowers flower = new Flowers();
        Flowers romashka = new Romashka();
        Flowers pion = new Pion();

        Buket buket = new Buket();
        Flowers roza = new Roza();
        priseInfo(romashka);
        priseInfo(pion);
        priseInfo(roza);

        System.out.println("Стоимость букета будет = " +buket.buket());

    }

    public static void priseInfo(Flowers flowers){
        flowers.prise();
    }


    }
