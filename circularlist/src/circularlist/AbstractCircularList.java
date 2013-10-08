package circularlist;

import list.List;

import java.util.Iterator;

/**
 * Created by Travis on 10/7/13.
 */
public abstract class AbstractCircularList<E> implements CircularList<E> {

    protected List<E> list;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean add(E item) {
        return false;
    }

    @Override
    public void add(int index, E item) throws IndexOutOfBoundsException {

    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index <= 0 || size() == 0) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(newIndex(index));

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private int newIndex(int index) {
        return index % size();
    }
}
