package pl.coderstrust.Figures;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class TrapezoidTest {
    private Figure trapezoid = new Trapezoid(2,4,3);
    private double area;
    private double expetedArea;
    @Test
    public void shouldCalculateAreaIsRightCount() throws Exception {
        //given
        area = 9;
        //when
        expetedArea = trapezoid.calculateArea();
        //then
        Assert.assertThat(expetedArea, is(area));
    }

}