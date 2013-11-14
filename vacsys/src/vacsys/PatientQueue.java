package vacsys;

import java.util.ArrayDeque;

/**
 * @author Travis
 */
public class PatientQueue extends ArrayDeque<Patient> {

    int priorityValue;

    public PatientQueue(int priorityValue) {
        super();
        this.priorityValue = priorityValue;
    }

    public int priorityValue() {
        return priorityValue;
    }
}
