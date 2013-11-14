package binarytree;

/**
 * Simple interface for a Node of a BT
 *
 * @author Travis
 */
public interface Node<E> {

    /**
     * Get the parent of this node
     *
     * @return the parent of this node, null if isRoot
     */
    public Node<E> parent();

    /**
     * Get the left child of this node
     *
     * @return left child, null if none
     */
    public Node<E> leftChild();

    /**
     * Gets the right child of this node
     *
     * @return right child, null if none
     */
    public Node<E> rightChild();

    /**
     * Is this node the root of a BT?
     *
     * @return if this is the root
     */
    public boolean isRoot();

    /**
     * Gets the value of this node
     *
     * @return value
     */
    public E getValue();

    /**
     * Sets the value of this node
     *
     * @param value of our node
     */
    public void setValue(E value);

    /**
     * Swap the value of this and node
     *
     * @param node to swap with
     */
    public void swap(Node<E> node);
}
