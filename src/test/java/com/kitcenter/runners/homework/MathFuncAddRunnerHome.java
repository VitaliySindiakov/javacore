package com.kitcenter.runners.homework;

import com.kitcenter.app.homework.lesson5.MathFuncAddHome;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class MathFuncAddRunnerHome {
       @Test(timeout = 1000) //Test add int
    public void add() {
        int a = 5, b = 5;
        int expRes = 10;
        MathFuncAddHome MathAdd = new MathFuncAddHome();
        Assert.assertEquals(expRes, MathAdd.add(a, b));
        if (a + b == expRes) {
            System.out.println("Тест успешно завершен " + a + "+" + b + " = " + expRes);
        }
    }
}
