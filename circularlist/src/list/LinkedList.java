package list;

import java.util.Iterator;

/**
 * User: Travis Beatty
 * Date: 9/29/13
 * Time: 12:08 AM
 */
public class LinkedList<E> implements List<E> {
    private Node<E> head;

    public LinkedList() {
        head = new Node<E>();
    }

    @Override
    public boolean add(E item) {
        // TODO
        return false;
    }

    @Override
    public void add(int index, E item) throws IndexOutOfBoundsException {
        // TODO

    }

    @Override
    public void clear() {
        // TODO

    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        // TODO
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO
        return false;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        // TODO
        return null;
    }

    @Override
    public int size() {
        // TODO
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO
        return null;
    }
}
