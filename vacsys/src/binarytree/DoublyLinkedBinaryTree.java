package binarytree;

/**
 * @author Travis
 */
public class DoublyLinkedBinaryTree<E> {
    protected DoublyLinkedBinaryTree<E> leftChild;
    protected DoublyLinkedBinaryTree<E> rightChild;
    protected DoublyLinkedBinaryTree<E> parent;
    protected E value;

    /**
     * Are we the root of this tree?
     *
     * @return if we are the root
     */
    public boolean isRoot() {
        return this.parent == null;
    }

    /**
     * Gets the left child
     *
     * @return
     */
    public DoublyLinkedBinaryTree<E> getLeftChild() {
        return leftChild;
    }

    /**
     * Change the left child
     *
     * @param leftChild
     */
    public void setLeftChild(DoublyLinkedBinaryTree<E> leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * Get the right child
     *
     * @return
     */
    public DoublyLinkedBinaryTree<E> getRightChild() {
        return rightChild;
    }

    /**
     * Change the right child
     *
     * @param rightChild
     */
    public void setRightChild(DoublyLinkedBinaryTree<E> rightChild) {
        this.rightChild = rightChild;
    }

    /**
     * Get the parent
     *
     * @return
     */
    public DoublyLinkedBinaryTree<E> getParent() {
        return parent;
    }

    /**
     * Change the parent
     *
     * @param parent
     */
    public void setParent(DoublyLinkedBinaryTree<E> parent) {
        this.parent = parent;
    }

    /**
     * Get the value of our node
     *
     * @return
     */
    public E getValue() {
        return value;
    }

    /**
     * Set the value of our node
     *
     * @param value
     */
    public void setValue(E value) {
        this.value = value;
    }

    /**
     * Swaps our value with another Node's value
     *
     * @param otherValue
     */
    public void swap(DoublyLinkedBinaryTree<E> otherValue) {
        E theirValue = otherValue.getValue();
        otherValue.setValue(this.value);
        this.value = theirValue;

    }
}

