package com.kitcenter.app.homework.lesson9;

import java.util.Arrays;

/**
 * Created by Vitaliy on 03.04.2018.
 */
public class LoopDva {
    public static void main(String[] args) {



    int[][] intArray = new int[2][3];
    for(int j = 0;j<intArray.length;j++){
        for (int k=0; k<intArray[j].length;k++){
            intArray[j][k]=j*k;
            System.out.println(intArray[j][k]);
            System.out.println(Arrays.deepToString(intArray));
        }
    }

}
}
