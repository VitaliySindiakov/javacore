package com.kitcenter.runners.homework;

import com.kitcenter.app.homework.lesson5.MathFuncSubHome;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class DataNathFuncSubTest {
    @SuppressWarnings("deprecation")
    @Test(timeout=15)
    @FileParameters( value = "src/test/resources/testdata3.csv", mapper = CsvWithHeaderMapper.class)
    public void MathFuncSubHome (int argA, int argB, int expOut){
        MathFuncSubHome MathSub = new MathFuncSubHome();
        Assert.assertEquals(expOut, MathSub.sub(argA, argB));
    }

}
