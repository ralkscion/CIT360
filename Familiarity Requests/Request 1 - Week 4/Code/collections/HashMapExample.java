// This class is an implementation of the Map interface in the Java Collections Framework, although Map is not technically a collection.
package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    
    public static void main(String args[]) {
        // HashMap constructor. It takes two arguments in the diamond operator to specify object data types.
        Map<String, Double> map = new HashMap<String, Double>();
        
        // Add elements to the HashMap with the put() method inherited from the Map class.
        map.put("Ciphertext", new Double(1975));
        map.put("Block Cipher", new Double(1976));
        map.put("Stream Cipher", new Double(1984));
        map.put("AES", new Double(1911));
        map.put("MD5 Hash", new Double(1977));
        map.put("DES", new Double(1998));
        
        // Display the contents of the HashMap.
        System.out.println(map + "\n");
        
        // Get a set of entries from the HashMap.
        Set<?> set = map.entrySet();
        
        // Get an iterator from the Set.
        Iterator<?> i = set.iterator();
        
        // Display elements of the HashMap, by referencing key and value one at a time.
        while(i.hasNext()) {
            @SuppressWarnings("unchecked")
            Map.Entry<String, Double> entry = (Map.Entry<String, Double>)i.next();
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
        
        /* Documentation on the Map class can be found at: https://docs.oracle.com/javase/7/docs/api/java/util/Map.html
         * Documentation on the HashMap class can be found at: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html 
         * Additional HashMap documentation and examples can be found at: https://www.tutorialspoint.com/java/java_hashmap_class.htm
         * Documentation on the Set class can be found at: https://docs.oracle.com/javase/7/docs/api/java/util/Set.html
         * Documentation on the Iterator class can be found at: https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
         * Additional Iterator usage documentation can be found at: https://www.tutorialspoint.com/java/java_using_iterator.htm */
    }
}
