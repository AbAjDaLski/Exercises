package pl.coderstrust.myOwnAarrayList;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public abstract class AbstractArrayListTest {

    protected List<Long> givenList;
    protected List<Long> expectedList;


    @Test
    public void shouldToAddElemtntToList() {
        //given
        expectedList.add(1L);
        expectedList.add(2L);
        //when
        givenList.add(1L);
        givenList.add(2L);
        //then
        Assert.assertEquals(expectedList.get(0), givenList.get(0));
        Assert.assertEquals(expectedList.get(1), givenList.get(1));
    }
}
