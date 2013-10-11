package list;

/**
 * User: Travis Beatty
 * Date: 9/29/13
 * Time: 12:08 AM
 */
public class ArrayList<E> implements List<E> {
    private static final int STARTING_SIZE = 1;
    private static final int EMPTY_SIZE_INDEX = -1;

    private E[] array = null;
    private int largestIndex = -1;

    public ArrayList() {
        clear();
    }

    @Override
    public boolean add(E item) {
        // Worry about resizing only when we are ALREADY full
        // Premature optimization is the root of all evil!
        // We do not know if the list will ever be added to again.  It would be unwise to resize it upon filling
        if (largestIndex >= array.length - 1) {
            copyToNewArray();
        }

        array[++largestIndex] = item;

        return true;
    }

    @Override
    public void add(int index, E item) throws IndexOutOfBoundsException {
        if (index < 0 || index > largestIndex + 1) {
            throw new IndexOutOfBoundsException();
        }

        // Nice base case we can revert to
        if (index == largestIndex + 1) {
            add(item);
            return;
        }

        // reindex around index
        largestIndex++;
        for (int i = largestIndex; i >= index; i--) {
            array[i + 1] = array[i];
        }

        // finally add our item
        array[index] = item;
    }

    @Override
    public void clear() {
        array = getArrayOfSize(STARTING_SIZE);
        largestIndex = EMPTY_SIZE_INDEX;

    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > largestIndex) {
            throw new IndexOutOfBoundsException();
        }

        return array[index];
    }

    @Override
    public boolean isEmpty() {
        return largestIndex == EMPTY_SIZE_INDEX;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        E value = null;

        if (index < 0 || index > largestIndex) {
            throw new IndexOutOfBoundsException();
        }

        value = array[index];

        for (int i = index; i < largestIndex; i++) {
            array[i] = array[i + 1];
        }

        largestIndex--;
        return value;
    }

    @Override
    public int size() {
        return largestIndex + 1;
    }

    private E[] getArrayOfSize(int size) {
        // Thanks to http://stackoverflow.com/questions/529085/how-to-generic-array-creation
        // I understood that Varkhan was trying to cast a new Array instance into one of a generic type
        // Their version was much more... aroundabout?  We can complete the same mission by simply instantiating
        // a new array in a normal fashion, rather than Array.newInstance()
        return (E[]) (new Object[size]);  // Cast an Object array into a generics array
    }

    private void copyToNewArray() {
        E[] newArray = getArrayOfSize(array.length * 2);

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }
}
