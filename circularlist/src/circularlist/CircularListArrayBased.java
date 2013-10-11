package circularlist;

import list.ArrayList;

/**
 * Implementation of AbstractCircularList.  Uses circularlist.list.ArrayList as the underlying data structure
 *
 * @param <E> type of elements in list
 * @author Travis
 * @version 1.0.0
 */
@SuppressWarnings({"Annotation", "ClassWithoutLogger", "PublicMethodWithoutLogging", "SuppressionAnnotation", "LocalCanBeFinal", "PublicConstructor"})

public class CircularListArrayBased<E> extends AbstractCircularList<E> {

    public CircularListArrayBased() {

        list = new ArrayList<E>();
    }
}
