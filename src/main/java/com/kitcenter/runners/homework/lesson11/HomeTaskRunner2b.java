package com.kitcenter.runners.homework.lesson11;



import com.kitcenter.app.homework.lesson11.Home2b;

import java.util.Scanner;

/**
 * Created by Vitaliy on 10.04.2018.
 */
public class HomeTaskRunner2b {

    public String scan(){
        Scanner sc = new Scanner(System.in);
        String polindrom;
        polindrom = sc.nextLine();
        return polindrom;

    }
    public void home2() {
        Home2b h2b = new Home2b();
        String polindrom;
        System.out.println("Plz print text");
        Scanner sc = new Scanner(System.in);
        polindrom = sc.nextLine();
        boolean isPolindrom2 = true;

        for (int i=0; i<polindrom.length()/2;i++){
            isPolindrom2 = isPolindrom2 && (polindrom.charAt(i)==polindrom.charAt( polindrom.length()-i-1));
            if(Home2b.isPolindrom2(polindrom)){
                System.out.println("Thi is Ok");
            }else {
                System.out.println("This is not Ok");
            }
        }

    }
}

