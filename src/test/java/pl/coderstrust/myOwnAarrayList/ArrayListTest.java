package pl.coderstrust.myOwnAarrayList;

import org.junit.Before;

import java.util.ArrayList;

public class ArrayListTest extends AbstractArrayListTest {

    @Before
    public void setArray() {
        expectedList = new ArrayList<>();
        givenList = new ArrayList<>();
    }
}