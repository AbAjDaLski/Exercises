package pl.coderstrust.myOwnAarrayList;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {
    private List<Long> givenList = new ArrayList<Long>();
    private List<Long> expectedList = new ArrayList<Long>();

    @Test
    public void shouldToAddElemtntToList() {
        //given
        expectedList.add(1L);
        //when
        givenList.add(1L);
        //then
        Assert.assertEquals(expectedList.get(0), givenList.get(0));
    }
}
