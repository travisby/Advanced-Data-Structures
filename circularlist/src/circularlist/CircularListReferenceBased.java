package circularlist;

import list.LinkedList;

/**
 * Implementation of AbstractCircularList.  Uses circularlist.list.LinkedList as the underlying data structure
 *
 * @param <E> type of elements in list
 * @author Travis
 * @version 1.0.0
 */
@SuppressWarnings({"Annotation", "ClassWithoutLogger", "PublicMethodWithoutLogging", "SuppressionAnnotation", "LocalCanBeFinal", "PublicConstructor"})
public class CircularListReferenceBased<E> extends AbstractCircularList<E> {

    public CircularListReferenceBased() {
        list = new LinkedList<E>();
    }
}
