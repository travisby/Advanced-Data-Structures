package vacsys;

/**
 * Person that has a priorityValue to order compared to other patients
 *
 * @author Travis
 */
public class Patient extends Person implements Comparable<Patient> {

    public int priorityValue() {
        // TODO
        return 0;
    }

    @Override
    public int compareTo(Patient o) {
        // TODO compare to another Patient
        return 0;
    }
}
