package pl.coderstrust.sort;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelectionSortTest {

    static SelectionSort selectionSort;

    @BeforeClass
    public static void initialize() {
        selectionSort = new SelectionSort();
    }

    @Test
    public void checkResultArrayLengthCorrect() throws Exception {
        SelectionSort selectionSort = new SelectionSort();
        Integer[] testData = {5, 9, 1, 13, 45, 17};
        Integer[] results = selectionSort.insort(testData);
        assertEquals(testData.length, results.length);
    }

    @Test
    public void checkResultArraySorted() throws Exception {
        SelectionSort selectionSort = new SelectionSort();
        Integer[] testData = {5, 9, 1, 13, 45, 17};
        Integer[] expectedData = {1, 5, 9, 13, 17, 45};
        Assert.assertArrayEquals(expectedData, selectionSort.insort(testData));
    }

}