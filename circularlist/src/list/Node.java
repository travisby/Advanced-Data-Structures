package list;

/**
 * Created by Travis on 10/7/13.
 */
class Node<E> {

    E data;
    Node next;

    Node() {
        next = null;
        data = null;
    }

    Node(E newData) {
        next = null;
        data = newData;
    }

    Node(Node<E> newNext) {
        next = newNext;
        data = null;
    }

    Node(E newData, Node<E> newNext) {
        next = newNext;
        data = newData;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
