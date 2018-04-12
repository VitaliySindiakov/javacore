package com.kitcenter.runners.homework.lesson11;





import com.kitcenter.app.homework.lesson11.Home1b;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

import java.util.Scanner;
@SuppressWarnings("ALL")
@RunWith(JUnitParamsRunner.class)
public class HomeTaskRunner1b {


    public  void homemade(){


        System.out.println("Plz print text");
        ScannerForHome schome = new ScannerForHome();
        Home1b home1b = new Home1b();
        if (home1b.isPolindrome(schome.scan())){
            System.out.println(schome.scan() + " -Is polindrom");


        } else
            System.out.println("Its not a polindrom");
    }
}