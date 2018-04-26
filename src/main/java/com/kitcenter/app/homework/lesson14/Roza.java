package com.kitcenter.app.homework.lesson14;

import com.kitcenter.app.homework.lesson14.Flowers;

public class Roza extends Flowers {
    int prise = 15;

    @Override
    public String toString() {
        return "Roza{" +
                "prise=" + prise +
                '}';
    }

    public int prise(){
        return prise;
    }
}
