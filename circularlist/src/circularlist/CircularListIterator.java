package circularlist;

import java.util.Iterator;

/**
 * Created by Travis on 10/11/13.
 */
public class CircularListIterator<E> implements Iterator<E> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }

    @Override
    public void remove() {

    }

    public CircularListIterator(CircularList<E> circularList) {
    }
}
