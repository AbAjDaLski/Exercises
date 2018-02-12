package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class RectangleTest {
    private Figure rectangle = new Rectangle(2,4);
    private double area;
    private double expetedArea;
    @Test
    public void shouldCalculateAreaIsRightCount() throws Exception {
        //given
        area = 8;
        //when
        expetedArea = rectangle.calculateArea();
        //then
        Assert.assertThat(expetedArea, is(area));
    }

}