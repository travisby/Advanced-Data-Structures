package vacsys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * System to regulate treatment to patients based on a number of criteria
 */
public class VacSys {

    VacSysHeap priorityQueue;

    /**
     * Create a system with an empty priority queue
     */
    public VacSys() {
        priorityQueue = new VacSysHeap();
    }

    /**
     * Create a system loaded with requests from a batch file
     *
     * @param filename batch file
     */
    public VacSys(String filename) {
        // TODO Create a system loaded with requests from the batch ﬁle given by ﬁlename
    }

    /**
     * Add a new request to the system
     *
     * @param name of the new patient
     * @param age  of the new patient
     * @param zip  of the new patient
     * @return successful?
     */
    public boolean insert(String name, int age, String zip) {
        return priorityQueue.add(new Patient(name, age, zip));
    }

    /**
     * Remove the next request from the system
     * @return Comma-Delimited String on Patient Fields name, age, zip
     */
    public String remove() {
        return priorityQueue.poll().toString();
    }

    /**
     * Remove num requests and store them in a CSV format
     *
     * @param num      of records to save
     * @param filename to save in
     * @return success
     */
    public boolean remove(int num, String filename) {
        ArrayBlockingQueue<String> results = new ArrayBlockingQueue<String>(num) {
        };

        while (num > 0) {
            results.add(priorityQueue.poll().toString());
            num--;
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            while (!results.isEmpty()) {
                writer.write(results.poll());
            }
        } catch (IOException x) {
            return false;
        } catch (ArrayIndexOutOfBoundsException x) {
            return false;
        }
        return true;
    }
}