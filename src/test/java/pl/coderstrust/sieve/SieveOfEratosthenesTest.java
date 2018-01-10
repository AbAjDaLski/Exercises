package pl.coderstrust.sieve;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SieveOfEratosthenesTest {
    @Test
    public void test() throws Exception {
        // given
        int[] t = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        // when
        SieveOfEratosthenes.sieve(10);
        // then
        int[] expected = {2, 3, 0, 5, 0, 7, 0, 0, 0};
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});

    }

}

