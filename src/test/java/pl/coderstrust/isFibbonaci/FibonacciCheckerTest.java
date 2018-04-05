package pl.coderstrust.isFibbonaci;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FibonacciCheckerTest {

    FibonacciChecker fibonacciChecker=new FibonacciChecker();

    @Test
    @Parameters({"3","144", "1597", "4181"})
    public void isFibonacciNumber(long number) {
        //given

        //when

        //then
        Assert.assertTrue(fibonacciChecker.isFibonacciNumber(number));
    }

    @Test
    @Parameters({"4", "2583", "4180"})
    public void isNotFibonacciNumber(long number){
        //given

        //when

        //then
        Assert.assertFalse(fibonacciChecker.isFibonacciNumber(number));
    }
}
