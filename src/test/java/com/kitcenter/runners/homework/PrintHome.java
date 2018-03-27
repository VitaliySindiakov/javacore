package com.kitcenter.runners.homework;

import com.kitcenter.runners.classwork.lesson5.*;
import com.kitcenter.runners.classwork.lesson5.MathFuncDivRunnerHome;
import com.kitcenter.runners.classwork.lesson5.MathFuncMultiplyRunnerHome;
import com.kitcenter.runners.classwork.lesson5.MathFuncSubRunnerHome;

import java.util.Scanner;

/**
 * Created by Vitaliy on 27.03.2018.
 */
public class PrintHome {
    public static void main(String[] args) {
        System.out.println("Выберите домашнее задание ");
        System.out.println("1 - сумма ");
        System.out.println("2 - деление ");
        System.out.println("3 - умножение ");
        System.out.println("4 - вычетание ");
        System.out.println("5 - выйти ");

        Scanner scan = new Scanner(System.in);
        int number;
        MathFuncAddRunnerHome mathadd = new MathFuncAddRunnerHome();
        MathFuncMultiplyRunnerHome mathmulti = new MathFuncMultiplyRunnerHome();
        MathFuncDivRunnerHome mathdiv = new MathFuncDivRunnerHome();
        MathFuncSubRunnerHome mathsub = new MathFuncSubRunnerHome();
        while (true)
        {
            number = scan.nextInt();
            switch (number) {
                case 1:
                    mathadd.add();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 2:
                    mathdiv.div();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 3:
                    mathmulti.multiply();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 4:
                    mathsub.sub();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 5:
                    System.out.println("Вы выбрали " + number + " - выйти из меню");
                    System.exit(1);

                default:
                    System.out.println("Вы выбрали не действительную домашнююю работу");

            }

        }
    }
}

