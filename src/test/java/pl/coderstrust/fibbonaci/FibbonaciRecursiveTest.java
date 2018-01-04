package pl.coderstrust.fibbonaci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibbonaciRecursiveTest {
    @Test
    public void fibbonaci() throws Exception {
        long result = new FibbonaciRecursive().fibbonaci(5);
        assertEquals(5, result);
    }

}