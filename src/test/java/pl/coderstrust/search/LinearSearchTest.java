package pl.coderstrust.search;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class LinearSearchTest {

    @Test
    public void shouldSearchLinear() {
        //given
        int[] arrayTest = new int[2000000];
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = i + 1;
        }

        //when
        long timeBefore = System.nanoTime();

        int result = LinearSearch.search(arrayTest, 1000000);

        long timeAfter = System.nanoTime();

        //then
        Assert.assertThat(result, is(999999));
        System.out.println("Operetion time = " + Long.toString(timeAfter - timeBefore) + "[nano sekund]");

    }
}
