package com.kitcenter.app.homework.lesson9;

import java.util.Random;

/**
 * Created by Vitaliy on 03.04.2018.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int b=0;
        int arrTest[]= new int[20];
        for(int i=0;i<arrTest.length;i++){
            Random rd = new Random();
            arrTest[i]= rd.nextInt(600);
            System.out.println(i+" Text "+arrTest[i]);
            if(arrTest[i]>0 & arrTest[i]%2!=0)b++;
            }System.out.println("Количество вводимых не целых чисел "+b);
    }
}
