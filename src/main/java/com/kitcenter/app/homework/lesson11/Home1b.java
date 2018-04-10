package com.kitcenter.app.homework.lesson11;

import java.util.Scanner;

/**
 * Created by Vitaliy on 10.04.2018.
 */
public class Home1b {

    public static  boolean isPolindrome(String polindrom){
        String replaced = polindrom.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        String reverse = new StringBuffer(replaced).reverse().toString();
        return reverse.equals(replaced);
    }
    public static void main(String[] args) {
        String polindrom;
        System.out.println("Plz print text");
        Scanner sc = new Scanner(System.in);
        polindrom = sc.nextLine();





            if (isPolindrome(polindrom)&& polindrom!="exit") {
                System.out.println(polindrom + " -Is polindrom");


            } else {
                System.out.println("No poli");
                System.exit(1);

            }

        }
    }




