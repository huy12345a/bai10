package TrienkhaiArraylist;

public class MyLists<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    static Object[] elements;
    public MyLists() {}

    public MyLists(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index, E element) {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newElements = new Object[newCapacity];
        }
    }
    public E remove(int index) {
        E element = (E) elements[index];
        elements[index] = null;
        return element;
    }

    public int size(){
        return size;
    }
    public E clone(){
        E element = (E) elements[size];
        return element;
    }
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }return -1;
    }
    public boolean add(E e) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
        }
        return false;
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newElements = new Object[newCapacity];
        }
    }
    public E get(int index) {
        return (E) elements[index];
    }
    public void clear(){
        elements = new Object[DEFAULT_CAPACITY];
    }
}