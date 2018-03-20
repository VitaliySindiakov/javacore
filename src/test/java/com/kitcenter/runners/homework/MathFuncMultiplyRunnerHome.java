package com.kitcenter.runners.homework;

import com.kitcenter.app.homework.lesson5.MathFuncMultiplyHome;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class MathFuncMultiplyRunnerHome {
    @Test
    public void multiply() {
        int a = 3;
        int b = 4;
        int expRes = 12;
        MathFuncMultiplyHome MathMultiply = new MathFuncMultiplyHome();
        Assert.assertEquals(expRes, MathMultiply.multiply(a,b));
        if (a*b==expRes){
            System.out.println("Тест умножения успешно завершен "+a+" * "+b+ " = "+expRes);
        }
    }
}
