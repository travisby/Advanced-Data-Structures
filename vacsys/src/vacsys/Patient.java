package vacsys;

/**
 * Person that has a priorityValue to order compared to other patients
 *
 * @author Travis
 */
public class Patient implements Comparable<Patient> {

    public String getName() {
        // TODO
        return "";
    }

    public int age() {
        // TODO
        return 0;
    }

    // We use a String for zipcodes because they seldom need numerical ordering, and will be smaller
    public String zip() {
        // TODO
        return "";
    }

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
