package com.kitcenter.runners.homework;

import com.kitcenter.app.homework.lesson5.MathFuncAddHome;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DataMathFuncAddTest {
    @SuppressWarnings("deprecation")
    @Test
    @FileParameters(value="src/test/resources/testdata.csv", mapper =CsvWithHeaderMapper.class )
    public void MathFuncTestAdd (int argA, int argB, int expOut){
        MathFuncAddHome MathAddTest = new MathFuncAddHome ();
        Assert.assertEquals(expOut, MathAddTest.add( argA, argB));
    }
}
