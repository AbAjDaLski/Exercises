package pl.coderstrust.numbersFromFile;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class NumberProcessorTest {

    @Test
    @Parameters({"    31     37     41     43     47     53     59     61     67     71"})
    public void shouldProcessLineCheckIsChangedRight(String line) throws Exception {

        // given
        String expected = "31+37+41+43+47+53+59+61+67+71=510";

        // when
        String givenList1 = new NumberProcessor().processLine(line);

        //then
        assertEquals(expected, givenList1);
    }

}