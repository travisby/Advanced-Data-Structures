package vacsys;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.lang.Integer;

/**
 * System to regulate treatment to patients based on a number of criteria
 */
public class VacSys {

    VacSysHeap priorityQueue;
    HashMap<String, Integer> zPops;
    int tPop;

    /**
     * Create a system with an empty priority queue
     */
    public VacSys() {
        priorityQueue = new VacSysHeap();
    }

    /**
     * Create a system loaded with requests from a batch file
     * @param filename batch file
     * @throws java.io.FileNotFoundException file does not exist
     * @throws IOException Could not read file successfully
     */
    public VacSys(String filename) throws FileNotFoundException, IOException {
        BufferedReader reader;
        ArrayList<String[]> lines = new ArrayList<String[]>();
        String line;
        String[] lineItems;

        // toFile
        // build lines for each patient where [0] = name, [1] = age, [2] = zip
        reader = new BufferedReader(new FileReader(filename));
        while ((line = reader.readLine()) != null) {
            lineItems = line.split(",");
            lineItems[0] = lineItems[0].trim();
            lineItems[1] = lineItems[1].trim();
            lineItems[2] = lineItems[2].trim();
            lines.add(lineItems);
        }

        this.buildZPops(lines);
        this.buildTPop(lines);

        priorityQueue = new VacSysHeap();

        Iterator<String[]> iter = lines.iterator();
        while(iter.hasNext()) {
            lineItems = iter.next();
            String name = lineItems[0].trim();
            int age = Integer.parseInt(lineItems[1].trim());
            String zip = lineItems[2].trim();
            insert(name, age, zip);
        }
    }

    /**
     * Sets the tPop field to the total population of the file
     * @param lines
     */
    private void buildTPop(ArrayList<String[]> lines) {
        this.tPop = lines.size();
    }

    /**
     * Sets the zPops hashmap for easy searchability
     * @param lines
     */
    private void buildZPops(ArrayList<String[]> lines) {
        String key;
        zPops = new HashMap<String, Integer>();
        // iterate through lines
        for (int i = 0; i < lines.size(); i++) {
            key = lines.get(i)[2];
            // Set the key's value to zero if it does not exist
            if (!this.zPops.containsKey(key)) {
                this.zPops.put(key, 0);
            }
            // Increment the key
            this.zPops.put(key, this.zPops.get(key) + 1);
        }
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
        return priorityQueue.add(new Patient(name, age, zip, this.getPopConstant(zip)));
    }

    /**
     * Gets the population constant for a particular zip code
     *
     * @param zip code in question
     * @return population constant
     */
    private int getPopConstant(String zip) {
        float zpop = this.zPops.get(zip);
        float tpop = this.tPop;
        return (int) (zpop / tpop * 10);
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
        ArrayDeque<String> results = new ArrayDeque<String>(num);

        while (num > 0) {
            results.add(remove());
            num--;
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            while (!results.isEmpty()) {
                writer.write(results.poll());
                writer.newLine();
            }
            writer.flush();
        } catch (IOException x) {
            return false;
        } catch (ArrayIndexOutOfBoundsException x) {
            return false;
        }
        return true;
    }
}
