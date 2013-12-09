package prefix;

import java.util.HashMap;

/**
 * Created by travis on 12/9/13.
 */
public class PrefixHashMap<T, Y> extends HashMap {
    private int value;

    public PrefixHashMap(int myValue) {
        super(26);
        value = myValue;
    }

    public int getValue() {
        return value;
    }
}
