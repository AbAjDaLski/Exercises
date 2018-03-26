package pl.coderstrust.myOwnAarrayList;

import java.util.*;

public class MyArrayList implements List<Long> {

    private Long data[];
    private int dataSize = 0;
    private Long[] internalArray;

    public MyArrayList() {
        this.data = new Long[7];
    }

    @Override
    public int size() {  //?
        System.out.println("The size of ArrayList is :" + dataSize);
        return dataSize;
    }

    @Override
    public boolean isEmpty() {
        if (dataSize == 0) {
            System.out.println("The ArrayList is empty");
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) { //?
        return indexOf(o) > -1;   //>=0
    }

    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            int index = 0;

            @Override
            public boolean hasNext() {  //informuje czy są jeszcze elementy w tablicy
                return index < dataSize;
            }

            @Override
            public Long next() { // pobiera kolejny element z tablicy
                if (hasNext()) {
                    return data[index++]; //(Long)data.get(index);
                }
                throw new IndexOutOfBoundsException();
            }
        };
    }

    @Override
    public Object[] toArray() {        // liste przekazuje do tablicy  To nowe ?
        //new Object[0];
        Object[] internalArray = new Object[dataSize];
        for (int i = 0; i < dataSize; i++) {
            internalArray[i] = data[i];
        }
        Object[] internalArraycopy = internalArray.clone();
        return internalArraycopy;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Long aLong) {
//        int index=0;
//        data[index]=aLong;
//        index ++;

        if (dataSize < data.length) {
            data[dataSize] = aLong;
            dataSize++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) { //przeszukać tablice czy zawiera ten element, jak tak to usuwa go  ?
        //counter licznik zliczający obecną ilość elementów tablicy indexy
        if (o == null) {
            for (int index = 0; index < dataSize; index++) {
                if (data[index] == null) {
                    int newSizeAfterRemoved = dataSize - index - 1;
                    if (newSizeAfterRemoved > 0) {
                        System.arraycopy(data, index + 1, data, index, newSizeAfterRemoved);
                        data[--dataSize] = null;
                    }
                }
                return true;
            }
        } else {
            for (int index = 0; index < dataSize; index++) {
                if (o.equals(data[index])) {
                    int newSizeAfterRemoved = dataSize - index - 1;
                    if (newSizeAfterRemoved > 0) {
                        System.arraycopy(data, index + 1, data, index, newSizeAfterRemoved);
                        data[--dataSize] = null;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Long> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Long> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override  // zrobine
    public void clear() {
        dataSize = 0;
    }

    @Override
    public Long get(int index) {
        if (index >= 0 && index < dataSize) {
            return data[index];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public Long set(int index, Long element) {
        if (index < 0 || index > dataSize) {
            throw new IndexOutOfBoundsException();
        }
        Long oldValue = data[index];
        data[index] = element;
        return oldValue;
    }

    @Override
    public void add(int index, Long element) {

        if (index>=0 && index < dataSize) {

            long[]temp=new long[dataSize++];
            System.arraycopy(data,0,temp,1,dataSize-index-1);
            data[index] = element;
            //odrazu powiekszy tablice odrazu

            // tablica się zwiększyla o jeden element
        } // jak przesunąć  elementy za indexem gdzie dodałem element o jedno w prawo
        // najpierw przekopiować elementy z indexem, potemw te miejsce wstawić nowy element

        else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Long remove(int index) {
        if (index >= 0 && index <= data.length) {
            long deletedElement = data[index];
            System.arraycopy(data, index + 1, data, index, dataSize - (index - 1));
            dataSize--;
            return deletedElement;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override      //  metoda jako parametr przyjmuje element listy i zwraca indeks pierwszego wystąpienia,
    public int indexOf(Object o) {
        int couter = 0;
        while (couter < dataSize) {
            if (data[couter] == o) {
                return couter;
            }
            couter++;
        }
        return -1;
    }

    @Override   //metoda jako parametr przyjmuje element listy i zwraca indeks ostatniego wystąpienia.
    public int lastIndexOf(Object o) {
        int couter = dataSize - 1;
        while (dataSize - 1 >= 0) {
            if (o.equals(data[couter])) {
                return couter;
            } else {
                couter--;
            }
            ;
        }
        return 0;
    }

    @Override
    public ListIterator<Long> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Long> listIterator(int index) {
        return null;
    }

//    @Override
//    public ListIterator<Long> listIterator() {
//        return null;
//    }
//
//    @Override
//    public ListIterator<Long> listIterator(int index) {
//        return null;
//    }

    @Override
    public List<Long> subList(int fromIndex, int toIndex) {
        return null;
    }
}
