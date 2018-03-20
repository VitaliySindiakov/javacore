package com.kitcenter.runners.homework;

import com.kitcenter.app.homework.lesson5.MathFuncSubHome;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class MathFuncSubRunnerHome {
    @Test(timeout = 60)
    public void sub() {
        int a = 10;
        int b = 7;
        int expRes = 3;
        MathFuncSubHome MathSub = new MathFuncSubHome();
        Assert.assertEquals(expRes, MathSub.sub(a, b));
        if (a - b == expRes) {
            System.out.println("Тест успешно завершен "+a+ " - " +b+ " = " +expRes);
        }
    }
}
