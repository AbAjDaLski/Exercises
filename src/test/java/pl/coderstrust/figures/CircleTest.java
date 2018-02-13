package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class CircleTest {
    private Figure circle = new Circle(2);
    private double area;
    private double expetedArea;

    @Test
    public void shouldCalculateAreaIsRightCount() throws Exception {
        //given
        area = 12.56;
        //when
        expetedArea = circle.calculateArea();
        //then
        Assert.assertThat(expetedArea, is(area));
    }

}