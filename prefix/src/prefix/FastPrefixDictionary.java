package prefix;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by travis on 12/9/13.
 */
public class FastPrefixDictionary implements PrefixDictionary {

    private PrefixHashMap<Character, PrefixHashMap> prefixHashMap;

    public FastPrefixDictionary(String filename) {
        prefixHashMap = new PrefixHashMap<Character, PrefixHashMap>();

        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            String line;
            String[] lineList;
            while ((line = file.readLine()) != null) {
                String word = line.split(",")[0];
                int value = Integer.parseInt(line.split(",")[1]);
                char[] letters = word.toCharArray();
                PrefixHashMap<Character, PrefixHashMap> hashMapHandle = prefixHashMap;

                // go to our place a in the hashmap
                for (int i = 0; i < letters.length; i++) {
                    // increment this hashmap's value to include our new value that will be underneath it
                    hashMapHandle.incValue(value);
                    Character letter = new Character(letters[i]);

                    // if the letter did not exist... create it
                    if (!hashMapHandle.containsKey(letter)) {
                        hashMapHandle.put(letter, new PrefixHashMap<Character, PrefixHashMap>());
                    }
                    hashMapHandle = (PrefixHashMap<Character, PrefixHashMap>) hashMapHandle.get(letter);
                }
                // and set the value
                hashMapHandle.incValue(value);
            }
            file.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Override
    public long sum(String prefix) {
        // find the handle where we are located
        return prefixHashMap.sum(prefix);
    }
}
