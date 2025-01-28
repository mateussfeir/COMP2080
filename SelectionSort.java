// SelectionSort ascending
// Assume you have:
// the array, numItems, etc.
public class SelectionSort {
    // Define the selectionSort method
    public static void selectionSort(int[] arr) {
        int numItems = arr.length;

        for (int start = 0; start < numItems - 1; start++) {
            // Find the location of the smallest item
            int locSmall = start;
            for (int pos = start + 1; pos < numItems; pos++) {
                if (arr[pos] < arr[locSmall]) {
                    locSmall = pos;
                }
            }
            // Swap with where we started
            int temp = arr[start];
            arr[start] = arr[locSmall];
            arr[locSmall] = temp;
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr);

        // Sort the array using Selection Sort
        selectionSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
