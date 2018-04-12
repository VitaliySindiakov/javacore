package com.kitcenter.runners.homework.lesson11;

import com.kitcenter.app.classwork.lesson11.Polindrom;
import com.kitcenter.app.homework.lesson11.Home1b;
import com.kitcenter.app.homework.lesson11.Home2b;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Scanner;

import static com.kitcenter.app.homework.lesson11.Home1b.isPolindrome;

/**
 * Created by Vitaliy on 10.04.2018.
 */
@SuppressWarnings("ALL")
@RunWith(JUnitParamsRunner.class)

public class RunnerAllHome {

    public  static void main(String[] args) {
        System.out.println("Выберите домашнее задание ");
        System.out.println("1 - 1 Задание b ");
        System.out.println("2 - 1 Задание b (2 вариант) ");
        System.out.println("3 - выйти ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        HomeTaskRunner1b Run1b= new HomeTaskRunner1b();

        while (true) {
           number = sc.nextInt();

            switch (number) {
                case 1:
                    Run1b.homemade();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;

                case 3:
                    System.out.println("Вы выбрали " + number + " - выйти из меню");
                    System.exit(1);

                default:
                    System.out.println("Вы выбрали не действительную домашнююю работу");

            }
        }
    }
}