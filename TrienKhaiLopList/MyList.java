package TrienKhaiLopList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];
    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        if (element.length > DEFAULT_CAPACITY) {
            int newsize = element.length*2;
            Object[] newelement = new Object[newsize];
        }
    }
    public void add(E e) {
        ensureCapa();
        element[size++] = e;
    }
    public E get (int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (E) element[index];
    }

}
