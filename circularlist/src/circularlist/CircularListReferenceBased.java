package circularlist;

import list.LinkedList;

/**
 * User: Travis Beatty
 * Date: 9/28/13
 * Time: 6:55 PM
 */
@SuppressWarnings({"Annotation", "ClassWithoutLogger", "PublicMethodWithoutLogging", "SuppressionAnnotation", "LocalCanBeFinal", "PublicConstructor"})
public class CircularListReferenceBased<E> extends AbstractCircularList<E> {

    public CircularListReferenceBased() {
        list = new LinkedList<E>();
    }
}
