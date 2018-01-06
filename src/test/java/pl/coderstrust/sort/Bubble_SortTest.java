package pl.coderstrust.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Bubble_SortTest {
    @Test
    public void souldSortSimplyArray(){
        //given
        Integer[] numbers = {18, 9, 1, 3, 12, 17};
        //when
        Bubble_Sort.bubblesort(numbers);
        //then
        Integer[] expected = {1,3,9,12,17,18};
        assertArrayEquals(expected, numbers);
    }


}