package vacsys;

import java.util.ArrayDeque;

/**
 * Individual Queue of patients that contains priority
 * @author Travis
 */
public class PatientQueue extends ArrayDeque<Patient> {

    int priorityValue;

    /**
     * Create a new Queue with this priority value
     * @param priorityValue to store
     */
    public PatientQueue(int priorityValue) {
        super();
        this.priorityValue = priorityValue;
    }

    /**
     * Gets the priority value of this Queue
     * @return
     */
    public int priorityValue() {
        return priorityValue;
    }
}
