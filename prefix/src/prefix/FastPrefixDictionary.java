package prefix;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by travis on 12/9/13.
 */
public class FastPrefixDictionary implements PrefixDictionary {

    private PrefixHashMap<Character, PrefixHashMap> prefixHashMap;

    public FastPrefixDictionary(String filename) {


        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            String line;
            String[] lineList;
            while ((line = file.readLine()) != null) {
                // TODO build from file
            }
            file.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Override
    public long sum(String prefix) {
        // TODO
        return 0;
    }
}
