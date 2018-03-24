package pl.coderstrust.myOwnAarrayList;

import java.util.*;

public class MyArrayList implements List<Long> {
    private Long data[];
    private int dataSize = 0;
    private Object[] internalArray;

    public MyArrayList() {
        this.data = new Long[7];
    }

    @Override
    public int size() {
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
    public boolean contains(Object o) {
        return indexOf(o) > -1;
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
            //void remove();//Służy do usunięcia z niej elementu, który był jako ostatni przekazany jako wynik metody next
        };
    }


    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Long aLong) {
        if (dataSize < data.length) {
            data[dataSize] = aLong;
            dataSize++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) { //przeszukać tablice czy zawiera ten element, jak tak to usuwa go


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

    @Override
    public void clear() {

    }

    @Override
    public Long get(int index) {
        return data[index];
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

    }

    @Override
    public Long remove(int index) {        // to
        if (index >= 0 && index <= data.length) {
            long deletedElement = data[index];
            System.arraycopy(data, index + 1, data, index, dataSize - (index - 1));
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

    @Override
    public List<Long> subList(int fromIndex, int toIndex) {
        return null;
    }
}
