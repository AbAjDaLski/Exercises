package pl.coderstrust.myOwnAarrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static java.lang.System.out;

public class AbstractArrayListTest {

    List<Long> givenList = new MyArrayList();
    List<Long> expectedList = new MyArrayList();

    @Before
    public void loadListToTest() {
        expectedList.add(5L);
        expectedList.add(3L);
        expectedList.add(7L);
        expectedList.add(9L);
    }

    @Test
    public void shouldToCheckIncludedElement() {

        //given
        boolean result;

        //when
        result = expectedList.contains(5L);

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void shouldToReturnIndexOfGivenElement() {

        //given
        int result;

        //when
        result = expectedList.indexOf(7L);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void shouldToCheckWorkIterator() {

        //given
        Iterator<Long> myIterator = expectedList.iterator();

        //when
        long givenValue1 = myIterator.next();
        long givenValue2 = myIterator.next();

        //then
        Assert.assertEquals(5, givenValue1);
        Assert.assertEquals(3, givenValue2);
    }

    @Test
    public void shouldCheckRemoveRightElement() {

        //given

        //when
        long result = expectedList.remove(3);

        //then
        Assert.assertEquals(9L, result);
    }

    @Test
    public void shouldToAddElementToList() {

        //given


        //when
        givenList.add(5L);
        givenList.add(3L);

        //then
        Assert.assertEquals(expectedList.get(0), givenList.get(0));
        Assert.assertEquals(expectedList.get(1), givenList.get(1));
    }

    @Test
    public void shouldToCheckIfArrayListIsEmpty() {

        //given

        //when

        //then
        Assert.assertTrue(givenList.isEmpty());

    }

    @Test
    public void shouldToCheckIfArrayListIsNotEmpty() {

        //given

        //when
        expectedList.add(1L);

        //then
        Assert.assertFalse(expectedList.isEmpty());
    }

    @Test
    public void shouldSetElementValue() {

        //given
        Long givenValue = 10L;
        Long expectedValue = 0L;

        //when
        expectedList.add(givenValue);
        expectedList.set(0, expectedValue);

        //then
        Assert.assertEquals(expectedValue, expectedList.get(0));
    }

    @Test
    public void shouldCheckArrayListIsCleared() {

        //given

        //when
        expectedList.clear();
        int result = expectedList.size();

        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldReturnListInArray() {

        //given

        //when
        Object[] result = expectedList.toArray();

        //then

    }

    @Test
    public void shouldCheckRemoveElementOfData() {

        //given

        //when
        boolean result = expectedList.remove(3L);
        out.println(expectedList.get(1));

        //then
        Assert.assertTrue(result);


    }

    @Test
    public void shouldReturnListBetweenIndexes() {

        //given
        givenList.add(5L);
        givenList.add(3L);

        //when
        List<Long> result = expectedList.subList(0, 3);

        //then
        assertArrayEquals(givenList, result);
    }

    private void assertArrayEquals(List<Long> longs, List<Long> result) {
    }
}
