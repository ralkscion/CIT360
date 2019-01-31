// This class is an implementation of the Set interface in the Java Collections Framework.

package presentation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    
    public static void main(String args[]) {
        createSetAndQueue();
    }
    
    /* 
     * If you want to call createSetAndQueue from another class, just create an instance of the HashSetExample class, and then call it's main method.
     * 
     * HashSetExample hash = new HashSetExample();
     * hash.main();
     * 
     * main(), as you can see above, automatically calls createSetAndQueue()
     */
    public static void createSetAndQueue() {
        // HashSet constructor.
        Set<String> hash = new HashSet<String>();
        
        String word = "Break";
        
        // Add elements to the HashSet.
        hash.add("Fragment");
        hash.add("Break");
        hash.add(word);
        hash.add("Hail");
        hash.add("Diminish");
        hash.add("Eliminate");
        hash.add("Gate");
        hash.add("Crumble");
        hash.add("Invalidate");
        hash.add("Juxtapose");
        hash.add("Kludge");
        
        // Display the contents of the HashSet. Note that you can't add duplicate elements in a set. Although I tried adding it twice, it only adds once in reality.
        System.out.println("HashSet: " + hash + "\n");
        
        // Create a copy of the HashSet as a Queue (LinkedList implementation) instead.
        List<String> queue = new LinkedList<String>(hash);
        
        // Use offer() method to insert a new element into the queue, print the value returned by offer().
        System.out.println("Offer: " + ((LinkedList<String>) queue).offer("Break"));
        
        // Clear the queue, try to remove() a specific object (word), then try to use poll(). Note that poll() returns null when ran on an empty queue, while remove() returns false.
        queue.clear();
        System.out.println("Remove:" + queue.remove(word));
        System.out.println("Poll: " + ((LinkedList<String>) queue).poll());
        System.out.println("Peek: " + ((LinkedList<String>) queue).peek());
        
        // Display the contents of the LinkedList / Queue.
        System.out.println("\nQueue: " + queue);
        
        // More documentation and HashSet methods can be found at: https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
    }
}
