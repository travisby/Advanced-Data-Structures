package circularlist;

import java.util.Iterator;

/**
 * Iterator for a CircularList
 *
 * @param <E> type of our underlying list
 * @author Travis
 * @version 1.0.0
 */
public class CircularListIterator<E> implements Iterator<E> {

    private CircularList<E> list;
    private int currentIndex;

    /**
     * Tells us if there is an extra element available
     *
     * @return true, unless list is empty
     */
    @Override
    public boolean hasNext() {

        // The only time we cannot iterate is if our list is empty
        if (list.size() == 0) {
            return false;
        }
        return true;
    }

    /**
     * Get the next element in our CircularList
     *
     * @return the next element
     */
    @Override
    public E next() {
        return list.get(currentIndex++);
    }

    /**
     * Nothing!
     */
    @Override
    public void remove() {
        // This page intentionally left blank
    }

    /**
     * Instantiates an iterator
     *
     * @param circularList to iterate on
     */
    public CircularListIterator(CircularList<E> circularList) {
        list = circularList;
        currentIndex = 0;
    }
}
