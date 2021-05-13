package datastructures;


/**
 * A way to measure how well a computer algorithm scales as the amount of data involved increases
 * (Doesn't necessarily have to do with speed)
 * <p>
 * Code and information based on "Big O Notations" video by Derek Banas - see README for link
 */
public class BigONotation {

    /**
     * Define the part of the algorithm that has the biggest effect on the final answer,
     * and forget about the rest (especially constants)
     * <p>
     * 45n^3 + 20n^2 + 19 = 84 (n=1)
     * 45n^3 + 20n^2 + 19 = 459 (n=2)
     * 45n^3 + 20n^2 + 19 = 47,019 (n=10)
     * // you can see that 20n^2 + 19 have very little to do with the final answer when:
     * 45n^3 = 45,000
     * // the part that has the most to do with the answer as the dataset scales,
     * is not the 45, but it's the n^3
     * O(n^3) aka order of N cubed
     */


    private final int[] theArray;
    private final int arraySize;
    private int itemsInArray = 0;

    public BigONotation(int size) {
        arraySize = size;
        theArray = new int[size];
    }

    public static void main(String[] args) {
        BigONotation testAlgo1 = new BigONotation(10000);
        testAlgo1.generateRandomArray();

        BigONotation testAlgo2 = new BigONotation(15000);
        testAlgo2.generateRandomArray();

        BigONotation testAlgo3 = new BigONotation(20000);
        testAlgo3.generateRandomArray();

        BigONotation testAlgo4 = new BigONotation(4000000);
        testAlgo4.generateRandomArray();

        // you can see that the time scales as the number of elements is also scaling in linear search
        testAlgo1.linearSearchForValue(20);
        testAlgo2.linearSearchForValue(20);
        testAlgo3.linearSearchForValue(20);
        testAlgo4.linearSearchForValue(20);


        // measuring the time doesn't show you a lot with efficient algorithms + Big O Notation tells you a lot more
        // than how long it took for an algorithm to run
        testAlgo2.bubbleSort();
        testAlgo3.bubbleSort();

        testAlgo2.binarySearchForValue(20); // searching through 15,000 items and only went through _ times
        testAlgo3.binarySearchForValue(20); // searching through 20,000 items*/


        long startTime = System.nanoTime();
        testAlgo4.quickSort(0, testAlgo4.itemsInArray);
        long endTime = System.nanoTime();
        System.out.println("Time for quick sort - cycled through 4,000,000 items in: " + (endTime - startTime));
    }

    /**
     * O(1) - Order of 1
     * Executes in the same amount of time, no matter the amount of data (or size of array)
     */
    public void addItemToArray(int newItem) {
        theArray[itemsInArray++] = newItem;
    }

    /**
     * O(N) Order of N
     * Time to complete grows in direct proportion to the amount of data
     * -> Linear search is a good example (searching for an element in a list in sequential order)
     * worst case: we may need to search every value to find the one we are looking for
     */
    public void linearSearchForValue(int value) {
        long startTime = System.nanoTime();

        boolean valueInArray = false;
        StringBuilder indicesWithValue = new StringBuilder();

        // Big O is not about monitoring speed, this is just a demo of how long things take to execute
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                valueInArray = true;
                indicesWithValue.append(i).append(" ");
            }
        }
        System.out.println("Value found: " + valueInArray);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Linear search took: " + duration);
        System.out.println("======");
    }

    /**
     * O(N^2)
     * tends to happen in algorithms with nested iterations (like Bubble sort)
     * each pass through outer limit, forces you to go through an entire list again
     */
    public void bubbleSort() {
        long startTime = System.nanoTime();

        for (int i = arraySize - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (theArray[j] > theArray[j + 1]) {
                    swapValues(j, j + 1);
                }
            }
        }

        long endTime = System.nanoTime();
        System.out.println("BubbleSort took " + (endTime - startTime));
        System.out.println("====");
    }

    private void swapValues(int j, int i) {
        int oldJValue = theArray[j];
        int oldIValue = theArray[i];
        theArray[i] = oldJValue;
        theArray[j] = oldIValue;
    }

    /**
     * O(log N)
     * Data being used is being decreased roughly 50% each time it goes through the algorithm
     * - very efficient, adding data doesn't make a big impact
     * Binary Search (expects data to already be sorted)
     */
    public void binarySearchForValue(int value) {
        long startTime = System.nanoTime();

        int lowIndex = 0;
        int highIndex = arraySize - 1;

        int timesThrough = 0;

        while (lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;

            if (theArray[middleIndex] < value) {
                lowIndex = middleIndex + 1;
            } else if (theArray[middleIndex] > value) {
                highIndex = middleIndex - 1;
            } else {
                System.out.println("Found match in index " + middleIndex);
                lowIndex = highIndex + 1;
            }
            timesThrough++;
        }

        long endTime = System.nanoTime();
        System.out.println("Binary search took " + (endTime - startTime));
        System.out.println("Times through: " + timesThrough);
        System.out.println("====");
    }

    /**
     * O(N log N)
     * O(N) most sorts - because you need to go through each element at least once
     * Quick Sort - comparing values efficiently without shifting (values are only compared once)
     * each comparison reduces the final sorted list in half
     */
    public void quickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = theArray[right];
            int pivotLocation = partitionArray(left, right, pivot);
            quickSort(left, pivotLocation - 1);
            quickSort(pivotLocation + 1, right);
        }
    }

    public int partitionArray(int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;

        while (true) {
            while (theArray[++leftPointer] < pivot)
                ;
            while (rightPointer > 0 && theArray[--rightPointer] > pivot)
                ;
            if (leftPointer >= rightPointer) {
                break;
            } else {
                swapValues(leftPointer, rightPointer);
            }
        }
        swapValues(leftPointer, right);
        return leftPointer;
    }

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 1000) + 10;
        }
        itemsInArray = arraySize - 1;
    }

}
