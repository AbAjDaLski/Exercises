package pl.coderstrust.myOwnAarrayList;

import org.junit.Before;

public class MyArrayListTest extends AbstractArrayListTest {

    @Before
    public void setArray(){
        expectedList=new MyArrayList();
        givenList=new MyArrayList();

    }

}
// dadawanie, odejmowanie, sprawdzadznie indeksu