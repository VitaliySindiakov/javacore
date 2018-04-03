package com.kitcenter.app.homework.lesson9;

import java.util.Random;

/**
 * Created by Vitaliy on 03.04.2018.
 */
public class ArrayRandom_0_9 {
    public static void main(String[] args) {
        int b=0;
        int [] arrrand = new int[15];
        for(int i=0; i<arrrand.length; i++){
            Random rnd = new Random();
            arrrand[i] =rnd.nextInt(10);
            System.out.println(arrrand[i]+" выводимое число");
            if(arrrand[i]>0 & arrrand[i]%2==0)b++;

        }
        System.out.println("всего чисел = "+b);
    }
}
