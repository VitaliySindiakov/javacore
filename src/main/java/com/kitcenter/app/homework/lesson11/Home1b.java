package com.kitcenter.app.homework.lesson11;


public class Home1b {
    public static boolean isPolindrome(String polindrom) {

        String replaced = polindrom.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reverse = new StringBuffer(replaced).reverse().toString();
        return reverse.equals(replaced);

    }
}