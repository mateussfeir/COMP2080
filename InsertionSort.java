import java.util.Arrays;

public class InsertionSort {

    // Method to perform Insertion Sort in ascending order
    public static void insertionSortAsc(int[] list, int numItems) {
        for (int start = 1; start < numItems; start++) {
            int temp = list[start];  // The element to be inserted
            int prev = start - 1;

            // Shift elements of list[0..start-1] that are greater than temp to one position ahead
            while (prev >= 0 && list[prev] > temp) {
                list[prev + 1] = list[prev];
                prev--;
            }

            // Insert temp at the correct position
            list[prev + 1] = temp;
        }
    }

    // Method to perform Insertion Sort in descending order
    public static void insertionSortDsc(int[] list, int numItems) {
        for (int start = 1; start < numItems; start++) {
            int temp = list[start];  // The element to be inserted
            int prev = start - 1;

            // Shift elements of list[0..start-1] that are smaller than temp to one position ahead
            while (prev >= 0 && list[prev] < temp) {
                list[prev + 1] = list[prev];
                prev--;
            }

            // Insert temp at the correct position
            list[prev + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] list1 = {12, 11, 13, 5, 6};
        int[] list2 = {12, 11, 13, 5, 6};  // Copy of the original array for descending order
        int numItems = list1.length;  // Define numItems based on array size

        System.out.println("Original Array: " + Arrays.toString(list1));

        // Sorting in ascending order
        insertionSortAsc(list1, numItems);
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(list1));

        // Sorting in descending order
        insertionSortDsc(list2, numItems);
        System.out.println("Sorted Array (Descending): " + Arrays.toString(list2));
    }
}
