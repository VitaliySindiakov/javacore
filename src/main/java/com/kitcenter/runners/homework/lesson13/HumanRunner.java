package com.kitcenter.runners.homework.lesson13;

import com.kitcenter.app.homework.lesson13.Human;

public class HumanRunner {
    public static void main(String[] args) {

        Human hm = new Human("Vitaliy");
        hm.setAge(1);
                System.out.println(hm.getAge());
        System.out.println(hm.getName());

    }
}
