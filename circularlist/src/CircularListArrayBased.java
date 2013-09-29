import java.util.Iterator;

/**
 * User: Travis Beatty
 * Date: 9/28/13
 * Time: 6:51 PM
 */
@SuppressWarnings({"Annotation", "ClassWithoutLogger", "PublicMethodWithoutLogging", "SuppressionAnnotation", "LocalCanBeFinal"})

public class CircularListArrayBased<E> implements CircularList<E> {

    public CircularListArrayBased() {
    }

    /**
     * Determines whether a list is empty.
     *
     * @return true if the list is empty, otherwise false
     */
    @Override
    public boolean isEmpty() {
        // TODO
        return false;
    }

    /**
     * Determines the length of a list.
     *
     * @return the number of elements in the list without wrapping
     */
    @Override
    public int size() {
        // TODO
        return 0;
    }

    /**
     * Removes all elements from the list.
     */
    @Override
    public void clear() {
        // TODO

    }

    /**
     * Adds a new item to the end of the list.
     *
     * @param item the new item to add
     * @return true if the list was modified
     */
    @Override
    public boolean add(E item) {
        // TODO
        return false;
    }

    /**
     * Adds a new item to the list at position index.
     * Other items are shifted, not overwritten.
     *
     * @param index where to add the new item
     * @param item  the new item to add
     * @throws IndexOutOfBoundsException if index is negative
     */
    @Override
    public void add(int index, E item) throws IndexOutOfBoundsException {
        // TODO

    }

    /**
     * Remove and return the item at the given index.
     *
     * @param index the position of the item to remove
     * @return the item that was removed
     * @throws IndexOutOfBoundsException if index is negative
     */
    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        // TODO
        return null;
    }

    /**
     * Retrieve the item at the given index without altering the list.
     *
     * @param index the position of the item to retrieve
     * @return the item at position index
     * @throws IndexOutOfBoundsException if index is negative
     */
    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        // TODO
        return null;
    }

    /**
     * Generate an iterator for the list.  The iterator should
     * visit the items in a circular pattern.  As long as the
     * list is not empty, it should never stop.
     */
    @Override
    public Iterator<E> iterator() {
        // TODO
        return null;
    }
}
