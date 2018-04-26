package com.kitcenter.app.homework.lesson14;

/**
 * Created by Vitaliy on 26.04.2018.
 */
public class Pion extends Flowers {
    int prise = 7;

    @Override
    public String toString() {
        return "Pion{" +
                "prise=" + prise +
                '}';
    }

    public int prise(){
        return prise;
    }
}
