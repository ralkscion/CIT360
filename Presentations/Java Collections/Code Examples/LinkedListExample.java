// This class is an implementation of the elements and List interface in the Java Collections Framework.

package presentation;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String args[]) {
        /* LinkedList constructor.
         * LinkedList is an implementation that inherits from both the List and elements interfaces.
         * Left side of this statement references one of the corresponding
         * interfaces of a LinkedList, for sake of meeting coding practices / standards.
         */
        Queue<String> elements = new LinkedList<String>();
        String word = "Break";
        
        // Add elements to LinkedList.
        elements.add("Hydrogen");
        elements.add("Helium");
        elements.add("Lithium");
        elements.add("Beryllium");
        elements.add("Boron");
        elements.add("Carbon");
        elements.add("Nitrogen");
        elements.add("Oxygen");
        elements.add("Fluorine");
        elements.add("Neon");
        
        // Use offer() method to insert a new element into the elements, print the value returned by offer().
        System.out.println("Offer: " + ((LinkedList<String>) elements).offer("Break"));
        
        // Display the contents of the LinkedList / elements.
        System.out.println("\nLinkedList: " + elements + "\n");

        // Clear the elements, try to remove() a specific object (word), then try to use poll(). Note that poll() returns null when ran on an empty elements, while remove() returns false.
        elements.clear();
        System.out.println("Remove:" + elements.remove(word));
        System.out.println("Poll: " + ((LinkedList<String>) elements).poll());
        System.out.println("Peek: " + ((LinkedList<String>) elements).peek());
        
        
        // Display the contents of the LinkedList.
        System.out.println("\nLinkedList after emptying the queue: " + elements);
        
        /*
         * Documentation on the elements interface can be found at https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html
         * Additional documentation on the elements interface can be found at: http://www.codejava.net/java-core/collections/java-queue-collection-tutorial-and-examples
         * Documentation on the LinkedList implementation can be found at: https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
         */
    }
}
