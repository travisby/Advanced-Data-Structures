package prefix;

import java.util.HashMap;

/**
 * Created by travis on 12/9/13.
 */
public class PrefixHashMap<T, Y> extends HashMap {

    private int value;

    public PrefixHashMap() {
        super(26);
        value = 0;
    }

    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }
}
