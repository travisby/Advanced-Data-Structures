package circularlist;

import java.util.Iterator;

/**
 * Created by Travis on 10/11/13.
 */
public class CircularListIterator<E> implements Iterator<E> {

    private CircularList<E> list;
    private int currentIndex;

    @Override
    public boolean hasNext() {

        // The only time we cannot iterate is if our list is empty
        if (list.size() == 0) {
            return false;
        }
        return true;
    }

    @Override
    public E next() {
        return list.get(currentIndex++);
    }

    @Override
    public void remove() {
        // This page intentionally left blank
    }

    public CircularListIterator(CircularList<E> circularList) {
        list = circularList;
        currentIndex = 0;
    }
}
