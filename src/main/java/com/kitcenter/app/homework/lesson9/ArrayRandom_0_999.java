package com.kitcenter.app.homework.lesson9;

import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

import java.util.Random;


public class ArrayRandom_0_999 {
    public static void main(String[] args) {

        int indexMax = 0;
        int indexMin = 0;

        int[] arr0999 = new int[15];
        for (int i = 1; i < arr0999.length; i++) {
            Random rnd = new Random();
            arr0999[i] = rnd.nextInt(999);
              if (arr0999[i] > arr0999[indexMax]) {
                indexMax = i;
            } else if (arr0999[i] < arr0999[indexMin]) {
                indexMin = i;
            }System.out.println("№"+ i + " random number is " + arr0999[i]);
        }
        System.out.println("Max is " + indexMax + " and Min is " + indexMin);
    }
}

