package list;

/**
 * Uses an automatically growing array for our List
 *
 * @param <E> type of our list
 * @author Travis
 * @version 1.0.0
 */
public class ArrayList<E> implements List<E> {
    private static final int STARTING_SIZE = 1;
    private static final int EMPTY_SIZE_INDEX = -1;

    private E[] array = null;
    private int largestIndex = -1;

    public ArrayList() {
        clear();
    }

    /**
     * Adds our item to the end of the list
     *
     * @param item to add
     * @return true if successfully added
     */
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

    /**
     * Adds item to specified index
     *
     * @param index to add to
     * @param item  to add
     * @throws IndexOutOfBoundsException on negative index, or non-existent index
     */
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

    /**
     * Empties our list
     */
    @Override
    public void clear() {
        array = getArrayOfSize(STARTING_SIZE);
        largestIndex = EMPTY_SIZE_INDEX;

    }

    /**
     * Retrieve element at index
     *
     * @param index to search
     * @return element at index
     * @throws IndexOutOfBoundsException on negative index, or non-existent index
     */
    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > largestIndex) {
            throw new IndexOutOfBoundsException();
        }

        return array[index];
    }

    /**
     * Determine if our list is empty
     *
     * @return true on 0-item list
     */
    @Override
    public boolean isEmpty() {
        return largestIndex == EMPTY_SIZE_INDEX;
    }

    /**
     * Removes element at specified index
     *
     * @param index to search for
     * @return item removed at index
     * @throws IndexOutOfBoundsException on negative index, or non-existent index
     */
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

    /**
     * Get the number of elements in our list
     *
     * @return number of elements
     */
    @Override
    public int size() {
        return largestIndex + 1;
    }

    /**
     * Get a new array of size
     *
     * @param size of the new array
     * @return new array
     */
    private E[] getArrayOfSize(int size) {
        // Thanks to http://stackoverflow.com/questions/529085/how-to-generic-array-creation
        // I understood that Varkhan was trying to cast a new Array instance into one of a generic type
        // Their version was much more... aroundabout?  We can complete the same mission by simply instantiating
        // a new array in a normal fashion, rather than Array.newInstance()
        return (E[]) (new Object[size]);  // Cast an Object array into a generics array
    }

    /**
     * Copy current contents to an array twice our current size
     */
    private void copyToNewArray() {
        E[] newArray = getArrayOfSize(array.length * 2);

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }
}
