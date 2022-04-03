/*
In this exercise,
Create a HashSet named hs.
Add 6 objects using add() method to the HashSet.
Then print the size of the HashSet using the size() method.
Remove an element using the remove() method.
Also try to remove an element that is not present in the Set.
Use the contains() method to check if an item is in the Set or not.
Print the updated set.

HashSet methods:
public boolean add(Object o): Adds an object to a HashSet if already not present in HashSet.
public boolean remove(Object o): Removes an object from a HashSet if found in HashSet.
public boolean contains(Object o):	Returns true if object found else return false
public boolean isEmpty():	Returns true if HashSet is empty else return false
public int size():	Returns number of elements in the HashSet
 */

package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("M");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("M");
        hs.add("X");

        //Print HashSet
        System.out.println("Original HashSet: " + hs);
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());

        //Remove element
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        //Remove element that is not present
        if(hs.remove("Z")) {
            System.out.println("Z removed from the Set");
        } else {
            System.out.println("Z is not present in the Set");
        }

        //Search for element
        System.out.println("Checking if M is present: " + hs.contains("M"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}
