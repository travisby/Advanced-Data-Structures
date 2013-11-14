package binarytree;

import java.util.Collection;

/**
 * Simple BT interface
 *
 * @author Travis
 */
public interface BinaryTree<E> extends Collection<E> {

    /**
     * Get the root of our tree
     *
     * @return root
     */
    public Node<E> getRoot();
}
