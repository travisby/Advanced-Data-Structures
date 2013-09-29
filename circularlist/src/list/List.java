package list;

import java.util.Iterator;

/**
 * User: Travis Beatty
 * Date: 9/29/13
 * Time: 12:04 AM
 */
public interface List<E> {

    public boolean add(E item);

    public void add(int index, E item);

    public void clear();

    public E get(int index);

    public boolean isEmpty();

    public E remove(int index);

    public int size();

    public Iterator<E> iterator();
}
