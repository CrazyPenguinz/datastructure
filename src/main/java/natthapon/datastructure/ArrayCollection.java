package natthapon.datastructure;

/**
 * Created by 708 on 8/10/2018.
 */
public class ArrayCollection implements Collection {

    private Object[] elementData;
    private int size;

    public ArrayCollection(int c) {
        elementData = new Object[c];
        size = 0;
    }

    public void add(Object element) {

    }

    public void remove(Object element) {

    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object element) {
        return false;
    }

    public int size() {
        return 0;
    }
}
