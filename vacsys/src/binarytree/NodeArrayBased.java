package binarytree;

/**
 * Simple Node for an ArrayBased Tree
 *
 * @author Travis
 */
public class NodeArrayBased<E> implements Node<E> {
    /**
     * Get the parent of this node
     *
     * @return the parent of this node, null if isRoot
     */
    @Override
    public Node<E> parent() {
        // TODO
        return null;
    }

    /**
     * Get the left child of this node
     *
     * @return left child, null if none
     */
    @Override
    public Node<E> leftChild() {
        // TODO
        return null;
    }

    /**
     * Gets the right child of this node
     *
     * @return right child, null if none
     */
    @Override
    public Node<E> rightChild() {
        // TODO
        return null;
    }

    /**
     * Is this node the root of a BT?
     *
     * @return if this is the root
     */
    @Override
    public boolean isRoot() {
        // TODO
        return false;
    }

    /**
     * Gets the value of this node
     *
     * @return value
     */
    @Override
    public E getValue() {
        // TODO
        return null;
    }

    /**
     * Sets the value of this node
     *
     * @param value of our node
     */
    @Override
    public void setValue(E value) {
        // TODO

    }

    /**
     * Swap the value of this and node
     *
     * @param node to swap with
     */
    @Override
    public void swap(Node<E> node) {
        // TODO

    }
}
