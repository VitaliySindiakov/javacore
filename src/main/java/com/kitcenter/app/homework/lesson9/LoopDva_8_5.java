package com.kitcenter.app.homework.lesson9;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Vitaliy on 03.04.2018.
 */
public class LoopDva_8_5 {
    public static void main(String[] args) {


        int[][] intArray = new int[8][5];
        int b=0;
        for (int j = 0; j < intArray.length; j++) {
            for (int k = 0; k < intArray[j].length; k++) {

                Random rnd = new Random();
                intArray[j][k] = rnd.nextInt(99);
                if (intArray[j][k] > 0 & intArray[j][k] % 2 == 0) b++;


                System.out.println(Arrays.deepToString(intArray));
            }
        }

    }
}
