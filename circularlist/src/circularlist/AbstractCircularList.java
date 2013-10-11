package circularlist;

import list.List;

import java.util.Iterator;

/**
 * Implements many of the methods for CircularList, expecting only a circularlist.list.List list field to exist
 *
 * @author Travis
 * @version 1.0.0
 */
public abstract class AbstractCircularList<E> implements CircularList<E> {

    protected List<E> list;

    /**
     * @return true if there are no elements in the list, else false
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * @return number of elements in the list
     */
    @Override
    public int size() {
        return list.size();
    }

    /**
     * empties the list
     */
    @Override
    public void clear() {
        list.clear();

    }

    /**
     * Adds item to the list
     *
     * @param item the new item to add
     * @return true because the item will always be added successfully
     */
    @Override
    public boolean add(E item) {
        return list.add(item);
    }

    /**
     * adds item to specified index
     *
     * @param index where to add the new item.  Loops around based on size()
     * @param item  the new item to add
     * @throws IndexOutOfBoundsException if index < 0
     */
    @Override
    public void add(int index, E item) throws IndexOutOfBoundsException {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        list.add(newIndex(index), item);

    }

    /**
     * Removes item at specified index
     *
     * @param index the position of the item to remove.  Loops around based on size()
     * @return removed item
     * @throws IndexOutOfBoundsException if index < 0
     */
    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || size() <= 0) {
            throw new IndexOutOfBoundsException();
        }

        return list.remove(newIndex(index));
    }

    /**
     * get an element at a specified index
     *
     * @param index the position of the item to retrieve.  Loops around based on size()
     * @return the item at index
     * @throws IndexOutOfBoundsException if index < 0
     */
    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || size() <= 0) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(newIndex(index));

    }

    /**
     * Gets an iterator on our CircularList
     *
     * @return CircularListIterator
     */
    @Override
    public Iterator<E> iterator() {
        return new CircularListIterator(this);
    }

    /**
     * Gets the new index we should use based on size()
     *
     * @param index at arbitrary max
     * @return the index we will actually go to our list with
     */
    private int newIndex(int index) {
        if (size() <= 0) {
            return 0;
        }
        return index % size();
    }
}
