package pl.coderstrust.Figures;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    private Figure triangle=new Triangle(4,5);
    private double area;
    private double expetedArea;
    @Test
    public void calculateArea() throws Exception {
        //given
        area=10;

        //when
        expetedArea=triangle.calculateArea();

        //then
        Assert.assertEquals(expetedArea,area,0.001); //asserThat
    }

}