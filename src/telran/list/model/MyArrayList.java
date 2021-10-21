package telran.list.model;

import java.util.Arrays;
import java.util.Iterator;

import telran.list.interfaces.IList;

public class MyArrayList<E> implements IList<E> {
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        // elementData = new Object[10];
        this(10);
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity " + capacity);
        }
        if (capacity > MAX_ARRAY_SIZE) {
            capacity = MAX_ARRAY_SIZE;
        }
        elementData = new Object[capacity];
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public E next() {
                // TODO Auto-generated method stub
                return null;
            }
        };
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E element) {
        ensureCapacity();
        elementData[size++] = element;
        return true;
    }

    private void ensureCapacity() {
        if (size == MAX_ARRAY_SIZE) {
            throw new OutOfMemoryError();
        }
        if (size == elementData.length) {
            int newCapacity = elementData.length + elementData.length / 2 + 1;
            if (newCapacity < 0 || newCapacity > MAX_ARRAY_SIZE) {
                newCapacity = MAX_ARRAY_SIZE;
            }
            elementData = Arrays.copyOf(elementData, newCapacity);
        }

    }

    @Override
    public void clear() {
        elementData = null;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                elementData[i] = null;
                return true;
            }
        }
        return false;
    }

    //Insert
    @Override
    public boolean add(int index, E element) {
        if (index <= size) {
            ensureCapacity();
            elementData[index] = element;
            return true;
        }
        throw new IndexOutOfBoundsException(index + " out of range");
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        indexCheck(index);
        return (E) elementData[index];
    }

    private void indexCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index + " out of bounds");
        }

    }

    @Override
    public int indexOf(Object o) {
        if (o != null) {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o == elementData[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return toString().lastIndexOf((Integer) o);
    }

    @Override
    public E remove(int index) {
        for (int i = 0; i < size; i++) {
            if (elementData[index] != null && index >= 0 && index <= size) {
                elementData[index] = null;
            }
        }
        throw new IllegalArgumentException(index + "Out of range or null");
    }

    //Replace
    @Override
    public E set(int index, E element) {
        if (elementData[index] != null && index >= 0 && index <= size) {
            elementData[index] = element;
        }
        throw new IllegalArgumentException(index + "Out of range or "+ element + " is null, need add new elenebt");
    }
}
