package pl.coderstrust.Figures;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class SquareTest {
    private Figure square= new Square(4);
    private double area;
    private double expetedArea;

    @Test
    public void calculateArea() throws Exception {
        //given
        area = 16;
        //when
        expetedArea = square.calculateArea();
        //then
        Assert.assertThat(expetedArea, is(area));
    }

}