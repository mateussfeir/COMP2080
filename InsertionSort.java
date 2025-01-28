import java.util.Arrays;

public class InsertionSort {

    // Method to perform Insertion Sort in ascending order
    public static void insertionSortAsc(int[] arr, int numItems) {
        for (int i = 1; i < numItems; i++) {
            int key = arr[i];  // The element to be inserted
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at the correct position
            arr[j + 1] = key;
        }
    }

    // Method to perform Insertion Sort in descending order
    public static void insertionSortDesc(int[] arr, int numItems) {
        for (int i = 1; i < numItems; i++) {
            int key = arr[i];  // The element to be inserted
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are smaller than key to one position ahead
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at the correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {12, 11, 13, 5, 6};
        int[] array2 = {12, 11, 13, 5, 6};  // Copy of the original array for descending order
        int numItems = array1.length;  // Define numItems based on array size

        System.out.println("Original Array: " + Arrays.toString(array1));

        // Sorting in ascending order
        insertionSortAsc(array1, numItems);
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(array1));

        // Sorting in descending order
        insertionSortDesc(array2, numItems);
        System.out.println("Sorted Array (Descending): " + Arrays.toString(array2));
    }
}
