package com.kitcenter.runners.homework.lesson11;





import com.kitcenter.app.homework.lesson11.Home1b;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

import java.util.Scanner;

public class HomeTaskRunner1b {

    public String scan(){
        Scanner sc = new Scanner(System.in);
        String polindrom;
        polindrom = sc.nextLine();
        return polindrom;

    }


    public  void homemade(){



        System.out.println("Plz print text");
        ScannerForHome schome = new ScannerForHome();
        Home1b home1b = new Home1b();
        if (home1b.isPolindrome(scan())){
            System.out.println(scan() + " -Is polindrom");


        } else
            System.out.println("Its not a polindrom");
    }
}