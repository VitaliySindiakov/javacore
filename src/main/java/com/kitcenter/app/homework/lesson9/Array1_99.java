package com.kitcenter.app.homework.lesson9;

/**
 * Created by Vitaliy on 02.04.2018.
 */
public class Array1_99 {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) number++;
        }
        int[] arr = new int[number];
        for(int i=1,b=0;i<99;i++){
            if(i%2!=0){
                arr[b]=i;
                System.out.println(arr[b]+ " целое число массива");b++;
            }
        }
        System.out.println("Обратный порядок");
        for(int i=arr.length-1;i>0;i--){
            System.out.println("Поехали" + arr[i]);
        }
    }
}
