package vacsys;

/**
 * Generic person data
 *
 * @author Travis
 */
public class Person {

    protected String name;
    protected int age;
    // We use a String for zipcodes because they seldom need numerical ordering, and will be smaller
    protected String zip;

    /**
     * Gets the name of this person
     *
     * @return this's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of this person
     * @return this's age
     */
    public int age() {
        return age;
    }

    /**
     * Gets the zip code where this person lives
     * @return this's zip code
     */
    public String zip() {
        return zip;
    }
}
