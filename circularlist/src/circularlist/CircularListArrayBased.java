package circularlist;

import list.ArrayList;

/**
 * User: Travis Beatty
 * Date: 9/28/13
 * Time: 6:51 PM
 */
@SuppressWarnings({"Annotation", "ClassWithoutLogger", "PublicMethodWithoutLogging", "SuppressionAnnotation", "LocalCanBeFinal", "PublicConstructor"})

public class CircularListArrayBased<E> extends AbstractCircularList<E> {

    public CircularListArrayBased() {

        list = new ArrayList<E>();
    }
}
