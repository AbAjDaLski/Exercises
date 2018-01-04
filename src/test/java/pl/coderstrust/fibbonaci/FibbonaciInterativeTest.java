package pl.coderstrust.fibbonaci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibbonaciInterativeTest {

    @Test
    public void firstTest() {
        long result = new FibbonaciInterative().fibbonaci(5);
        assertEquals(5, result);
    }

}