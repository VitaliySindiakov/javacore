package com.kitcenter.runners.homework;

import com.kitcenter.app.homework.lesson13.Human;
import com.kitcenter.app.homework.lesson9.*;
import com.kitcenter.runners.homework.lesson11.HomeTaskRunner1b;
import com.kitcenter.runners.homework.lesson11.HomeTaskRunner2b;
import com.kitcenter.runners.homework.lesson5.MathFuncAddRunnerHome;
import com.kitcenter.runners.homework.lesson5.MathFuncDivRunnerHome;
import com.kitcenter.runners.homework.lesson5.MathFuncMultiplyRunnerHome;
import com.kitcenter.runners.homework.lesson5.MathFuncSubRunnerHome;

import java.util.Scanner;

/**
 * Created by Vitaliy on 27.03.2018.
 */
public class AllHomeworkRunner {
    public static void main(String[] args) {
        System.out.println("Выберите домашнее задание ");
        System.out.println("1 - Lesson 5 - сумма ");
        System.out.println("2 - Lesson 5 - деление ");
        System.out.println("3 - Lesson 5 - умножение ");
        System.out.println("4 - Lesson 5 - вычетание ");
        System.out.println("5 - Lesson 11 - 1 Задание b ");
        System.out.println("6 - Lesson 11 - 1 Задание b (2 вариант) ");
        System.out.println("7 - Lesson 13 - Human - конструктор ");
        System.out.println("8 - Lesson 9 - Array1_99 - массивы ");
        System.out.println("9 - Lesson 9 - Array2_20 - массивы ");
        System.out.println("10 - Lesson 9 - ArrayRandom_0_9 - массивы ");
        System.out.println("11 - Lesson 9 - ArrayRandom_0_999 - массивы ");
        System.out.println("12 - Lesson 9 - ArrayTest - массивы ");
        System.out.println("13 - Lesson 9 - LoopDva - массив массивов ");
        System.out.println("14 - Lesson 9 - LoopDva_8_5 - массив массивов ");
        System.out.println("15 - Lesson 9 - LoopDva - массив массивов ");

        System.out.println("0 - выйти ");

        Scanner scan = new Scanner(System.in);
        int number;
        MathFuncAddRunnerHome mathadd = new MathFuncAddRunnerHome();
        MathFuncMultiplyRunnerHome mathmulti = new MathFuncMultiplyRunnerHome();
        MathFuncDivRunnerHome mathdiv = new MathFuncDivRunnerHome();
        MathFuncSubRunnerHome mathsub = new MathFuncSubRunnerHome();
        HomeTaskRunner1b Run1b = new HomeTaskRunner1b();
        HomeTaskRunner2b Run2b = new HomeTaskRunner2b();
        Human hm = new Human("Vitaliy");
        Array1_99 array1_99 = new Array1_99();
        Array2_20 array2_20 = new Array2_20();
        ArrayRandom_0_9 arrayRandom_0_9 = new ArrayRandom_0_9();
        ArrayRandom_0_999 arrayRandom_0_999 = new ArrayRandom_0_999();
        ArrayTest arrayTest = new ArrayTest();
        LoopDva loopDva = new LoopDva();
        LoopDva_8_5 loopDva_8_5 = new LoopDva_8_5();
        LoopDva_999 loopDva_999 = new LoopDva_999();

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
                    Run1b.homemade();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 6:
                    Run2b.home2();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 7:
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    hm.setAge(1);
                    System.out.println(hm.getAge());
                    System.out.println(hm.getName());
                    break;
                case 8:
                    array1_99.arr();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 9:
                    array2_20.arr();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 10:
                    arrayRandom_0_9.arr();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 11:
                    arrayRandom_0_999.arr();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 12:
                    arrayTest.arr();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 13:
                    loopDva.loop();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 14:
                    loopDva_8_5.loop();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;
                case 15:
                    loopDva_999.loop();
                    System.out.println("Вы выбрали домашнее задание № " + number);
                    break;

                case 0:
                    System.out.println("Вы выбрали " + number + " - выйти из меню");
                    System.exit(1);

                default:
                    System.out.println("Вы выбрали не действительную домашнююю работу");

            }

        }
    }
}

