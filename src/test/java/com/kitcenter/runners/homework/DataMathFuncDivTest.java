package com.kitcenter.runners.homework;

import com.kitcenter.app.homework.lesson5.MathFuncDivHome;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class DataMathFuncDivTest {
        @SuppressWarnings("deprecation")
        @Test
        @FileParameters(value="src/test/resources/testdata2.csv", mapper =CsvWithHeaderMapper.class )
        public void MathFuncDivHome(int argA, int argB, int expOut){
            MathFuncDivHome MathDivTest = new MathFuncDivHome();
            Assert.assertEquals(expOut, MathDivTest.div( argA, argB));
        }
    }