package com.kitcenter.app.homework.lesson11;

import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

import java.util.Scanner;

public class Home2b {
    public static boolean isPolindrom2(String polindrom) {
        String replaced = polindrom.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reverse = new StringBuffer(replaced).reverse().toString();
        return reverse.equals(replaced);
    }
}