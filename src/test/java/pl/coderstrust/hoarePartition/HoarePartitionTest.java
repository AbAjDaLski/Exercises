package pl.coderstrust.hoarePartition;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class HoarePartitionTest {
    @Test
    public void shouldReturnRightNewPositionPivot() throws Exception {

        //given
        int[] data1 = {15, 3, 8, 5, 9, 1, -1, 26, 14, 12};
        int[] data2 = {5, 9, 7, 55, -3, 1, 2, 26, 11, 3};

        //when
        System.out.println(Arrays.toString(data1));
        int actualPosition1 = HoarePartition.partition(data1, 0, 9);
        System.out.println(Arrays.toString(data1));
        System.out.println("Pivot has changed position " + actualPosition1 + "\n*******************************");

        System.out.println(Arrays.toString(data2));
        int actualPosition2 = HoarePartition.partition(data2, 0, 9);
        System.out.println(Arrays.toString(data2));
        System.out.println("Pivot has changed position " + actualPosition2 + "\n*******************************");

        //then
        int expectedNewPosition1 = 6;
        Assert.assertEquals(expectedNewPosition1, actualPosition1);
        int expectedNewPosition2 = 3;
        Assert.assertEquals(expectedNewPosition1, actualPosition1);
    }
}