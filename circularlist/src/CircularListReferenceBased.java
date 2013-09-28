import java.util.Iterator;

/**
 * User: Travis Beatty
 * Date: 9/28/13
 * Time: 6:55 PM
 */
@SuppressWarnings({"Annotation", "ClassWithoutLogger", "PublicMethodWithoutLogging", "SuppressionAnnotation"})
public class CircularListReferenceBased<E> implements CircularList<E> {
    public CircularListReferenceBased() {
    }

    /**
     * Determines whether a list is empty.
     *
     * @return true if the list is empty, otherwise false
     */
    @Override
    public final boolean isEmpty() {
        // TODO
        return false;
    }

    /**
     * Determines the length of a list.
     *
     * @return the number of elements in the list without wrapping
     */
    @Override
    public final int size() {
        // TODO
        return 0;
    }

    /**
     * Removes all elements from the list.
     */
    @Override
    public final void clear() {
        // TODO

    }

    /**
     * Adds a new item to the end of the list.
     *
     * @param item the new item to add
     * @return true if the list was modified
     */
    @Override
    public final boolean add(E item) {
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
    public final void add(int index, E item) throws IndexOutOfBoundsException {
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
    public final E remove(int index) throws IndexOutOfBoundsException {
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
    public final E get(int index) throws IndexOutOfBoundsException {
        // TODO
        return null;
    }

    /**
     * Generate an iterator for the list.  The iterator should
     * visit the items in a circular pattern.  As long as the
     * list is not empty, it should never stop.
     */
    @Override
    public final Iterator<E> iterator() {
        // TODO
        return null;
    }
}
