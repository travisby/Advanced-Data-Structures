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
        Node<E> parentNode;

        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head.setData(item);
            head.setNext(new Node<E>());
        } else {
            // Set the previous Node's next to a new Node with data = item and next = previous node's old next
            parentNode = getNode(index - 1);
            parentNode.setNext(new Node(item, parentNode.getNext()));
        }
    }

    @Override
    public void clear() {
        head = new Node<E>();
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        System.out.println(size());
        System.out.println(index);

        return getNode(index).getData();
    }

    @Override
    public boolean isEmpty() {
        return head.getNext() == null;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        Node<E> removedNodeParent;
        E dataOfRemovedNode;

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            dataOfRemovedNode = head.getData();
            head = head.getNext();
        } else {
            removedNodeParent = getNode(index - 1);
            dataOfRemovedNode = removedNodeParent.getNext().getData();
            removedNodeParent.setNext(removedNodeParent.getNext().getNext());
        }

        return dataOfRemovedNode;

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
