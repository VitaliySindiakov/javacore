package com.kitcenter.app.homework.lesson9;

import java.util.Scanner;

/**
 * Created by Vitaliy on 29.03.2018.
 */
public class PrintNumbers {

    public static void main(String[] args) {
        int number;
        int number2;
        System.out.println("Enter 2 number");
        Scanner sc = new Scanner(System.in);
        number =sc.nextInt();
        number2=sc.nextInt();
        if(number>number2){
            System.out.println("First number is bigger");
        }
        else{
            System.out.println("Second number is bigger");
        }
    }
}
