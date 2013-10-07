package list;

import java.util.Iterator;

/**
 * User: Travis Beatty
 * Date: 9/29/13
 * Time: 12:08 AM
 */
public class LinkedList<E> implements List<E> {
    /* An empty list is an instantiated head node.  The "last" element is where the next piece of data should be added,
     * not the last element already in the list.
     */
    private Node<E> head;
    private Node<E> last;

    public LinkedList() {
        clear();
    }

    @Override
    public boolean add(E item) {
        add(size(), item);
        return true;
    }

    @Override
    public void add(int index, E item) throws IndexOutOfBoundsException {

        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        // Set the previous Node's next to a new Node with data = item and next = previous node's old next
        getNode(index - 1).setNext(new Node(item, getNode(index - 1).getNext()));
    }

    @Override
    public void clear() {
        head = new Node<E>();
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        return getNode(index).getData();
    }

    @Override
    public boolean isEmpty() {
        return head.getNext() == null;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        // TODO
        return null;
    }

    @Override
    public int size() {
        int counter;
        Node<E> pointer = head;

        for (counter = 0; pointer.getNext() != null; counter++) {
            pointer = pointer.getNext();
        }

        return counter;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO
        return null;
    }

    private Node<E> getNode(int index) {
        Node<E> pointer = head;
        for (int i = index; i > 0; i--) {
            pointer = pointer.getNext();
        }
        return pointer;
    }
}
