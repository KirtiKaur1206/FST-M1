/*
In this exercise,
Create an ArrayList named myList of type String.
Add 5 names to the ArrayList using add() method.
Then print all the names using for loop.
Then use get() method to retrieve the 3rd name in the ArrayList.
Use contains() method to check if a name exists in the ArrayList.
Use size() method to print the number of names in the ArrayList.
Use remove() method to remove a name from the list and print the size() of the list again.

ArrayList methods:
public void add(Object)/public void add(int, Object) -
Adds an item to an ArrayList. The default version adds an item at the next available location.
The overloaded version allows you to specify a position at which to add the item.

public void remove(int)	-
Removes an item from an ArrayList at a specified location.

public void set(int, Object) -
Alters an item at a specified ArrayList location.

Object get(int)	-
Retrieves an item from a specified location in an ArrayList.

public int size() -
Returns the current ArrayList size.
 */
package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        //Adding object at specific index
        myList.add(3, "Grapes");
        myList.add(1, "Papaya");

        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }

        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + myList.size());

        myList.remove("Papaya");

        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
