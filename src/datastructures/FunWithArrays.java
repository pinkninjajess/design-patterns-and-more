package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunWithArrays {

    /**
     * Arrays
     * - O(1) time to look up by index (much speed!)
     * - O(1) time to append to the end of the list
     * - O(n) time to insert or delete
     * because you gotta hop over each element to get there
     * - memory is stored sequentially (which is why look ups are so fast)
     * - Handy if you have a fixed number of elements
     */
    String[] careBearNamesArray = new String[5]; // hopefully you won't need to update this :(
    /**
     * Dynamic Array aka ArrayList (in Java)
     * - dynamic because it doesn't have a fixed size
     * - lookups are fast O(1)
     * - deletions take O(n) because of the need to scoot over other elements
     * - appending usually is quick at O(1) - worst case O(n)
     * - if the array is full, then appending to it (usually) doubles the array size
     * (each item needs to be copied over, so that is O(n)
     * - The Java implementation lists the 'add' operation at O(n)
     * - Get and Set are constant time O(1) in the Java implementation
     */
    List<String> careBearNamesArrayList;

    public static void main(String[] args) {
        FunWithArrays funWithArrays = new FunWithArrays();

        // Array
        String[] careBears = funWithArrays.careBearNamesCreationArray(new String[5]);
        System.out.println(java.util.Arrays.toString(careBears));

        // Dynamic Array
        List<String> careBearsList = funWithArrays.careBearNamesCreationArrayList();

        // O(n) time for Java implementation
        System.out.println("List contains Grumpy Bear? " + careBearsList.contains("Grumpy Bear"));

        // O(1) time to look up by index (much speed!)
        System.out.println(careBearsList.get(0));

        System.out.println(careBearsList);
    }

    public String[] careBearNamesCreationArray(String[] careBears) {
        careBears[0] = "Cheer Bear";
        careBears[1] = "Good Luck Bear";
        careBears[2] = "Tugs";
        careBears[3] = "Grumpy Bear";

        // O(1) time to look up by index (much speed!)
        System.out.println(careBears[0]);

        // O(1) time to append to the end of the list
        careBears[4] = "Grams Bear";

        // write over an existing item O(n) time to scoot over the others
        careBears[3] = "Funshine Bear";


        //  Arrays.sort uses Quick Sort when dealing with primitive values
        //  and Merge Sort for references values
        Arrays.sort(careBears);

        return careBears;
    }

    public List<String> careBearNamesCreationArrayList() {
        List<String> careBears = new ArrayList<>();

        careBears.add("Proud Heart Cat");
        careBears.add("Brave Heart Lion");
        careBears.add("Champ Bear");
        careBears.add("Wish Bear");

        // O(n) time to append to the end of the list
        careBears.add("Birthday Bear");

        // write over an existing item O(1) time in the Java ArrayList implementation
        careBears.set(0, "Friend Bear");

        //  Arrays.sort uses Quick Sort when dealing with primitive values
        //  and Merge Sort for references values
        careBears.sort(String::compareTo);

        return careBears;
    }
}
