package com.kitcenter.app.homework.lesson4.utils.convertors;

public class PrimitiveConvertor {
    public static void floatToChar(float myFloat) {
        char result = (char) myFloat;
        System.out.println(result);
    }

    public static void intTochar(int myInt) {
        char result = (char) myInt;
        System.out.println(result);
    }

    public static void charToint(char myChar) {
        int result = (int) myChar;
        System.out.println(result);
        System.out.println("Input value float is" + myChar + "output values int is" +result  );
    }

}
