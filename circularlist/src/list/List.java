package list;

/**
 * User: Travis Beatty
 * Date: 9/29/13
 * Time: 12:04 AM
 */
public interface List<E> {

    public boolean add(E item);

    public void add(int index, E item) throws IndexOutOfBoundsException;

    public void clear();

    public E get(int index) throws IndexOutOfBoundsException;

    public boolean isEmpty();

    public E remove(int index) throws IndexOutOfBoundsException;

    public int size();
}
