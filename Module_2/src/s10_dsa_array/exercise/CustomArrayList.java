package s10_dsa_array.exercise;

import java.util.Arrays;

public class CustomArrayList<E> implements Cloneable {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public CustomArrayList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int initCapacity) {
        elements = (E[]) new Object[initCapacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        ensureCapacity();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E[] temp = (E[]) new Object[size - 1];
        E res = elements[index];
        for (int i = 0, j = 0; i < size; i++) {
            if (i != index) temp[j++] = elements[i];
        }
        elements = temp;
        size--;
        return res;
    }

    int size() {
        return size;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public E get(int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(e)) return true;
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(e)) return i;
        }
        return -1;
    }
    public void clear() {
        size = 0;
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity() {
        if (size >= elements.length) elements = Arrays.copyOf(elements, elements.length * 3 / 2);
    }
}
