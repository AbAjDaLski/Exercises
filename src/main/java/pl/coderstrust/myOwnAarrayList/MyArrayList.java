package pl.coderstrust.myOwnAarrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        Iterator<Long> data = iterator();
        if (o==null) {
            while (data.hasNext())
                if (data.next()==null)
                    return true;
        } else {
            while (data.hasNext())
                if (o.equals(data.next()))
                    return true;
        }
        return false;
    }

    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Long next() {
                return null;
            }
        };
    }

    public static void main(String[] args) {                // to test
        Iterator<Long> it = new MyArrayList().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (Long longNumber : new MyArrayList()) { //syntactic sugar

        }
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
            data[index] = null;
        }
        return null;
    }

    @Override      //  metoda jako parametr przyjmuje element listy i zwraca indeks pierwszego wystąpienia,
    public int indexOf(Object o) {
//        for(int i=0;i<dataSize;i++){
//            if (data[i]==o){
//                return i;
//            }
//        }
        int couter=0;
        while (couter<dataSize){
            if (data[couter]==o){
                return couter;
            }else {
                couter++;
            };
        }
        return 0;
    }

    @Override   //metoda jako parametr przyjmuje element listy i zwraca indeks ostatniego wystąpienia.
    public int lastIndexOf(Object o) {
        int couter=dataSize-1;
        while (dataSize-1>=0){
            if (o.equals(data[couter])){
                return couter;
            }else {
                couter--;
            };
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
