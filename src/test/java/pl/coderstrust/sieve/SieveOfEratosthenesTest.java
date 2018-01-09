package pl.coderstrust.sieve;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SieveOfEratosthenesTest {
    @Test
    public void test1(){
        // given
    int []t={2,3,4,5,6,7,8,9,10};
        // when
        SieveOfEratosthenes.sieve(10);
        // then
        int[]expected={2,3,0,5,0,7,0,0,0};
        assertEquals(expected,t);
    }

}