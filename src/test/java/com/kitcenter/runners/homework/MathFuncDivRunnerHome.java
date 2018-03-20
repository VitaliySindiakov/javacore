package com.kitcenter.runners.homework;

import com.kitcenter.app.homework.lesson5.MathFuncDivHome;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class MathFuncDivRunnerHome {
    @Test(timeout=60)
    public  void div(){
        int a = 144;
        int b = 12;
        int expRes = 12;
        MathFuncDivHome MathDiv = new MathFuncDivHome();
        Assert.assertEquals(expRes, MathDiv.div(a,b));
        if(a / b == expRes){
            System.out.println("Тест вычитания успешно завершен " +a+ " / " +b+ " = " +expRes);
        }
    }
}
