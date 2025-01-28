// Declare the class
public class BinarySearch {
    // Create a method
    public int binarySearch(int key) {
        // Define and initialize the integer variables
        int lo = 0, hi = arr.length - 1, mid;

        // Condition to stop looping is if (lo !<= hi)
        while (lo <= hi) {
            mid = (lo + hi) / 2; // Calculate the middle index

            if (arr[mid] == key) {
                return mid; // Return the index if the key is found
            }
            if (key < arr[mid]) {
                hi = mid - 1; // Narrow down to the left half
            } else {
                lo = mid + 1; // Narrow down to the right half
            }
        }

        return -1; // Return -1 if the key is not found
    }

    // Example to test the binarySearch method
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {10, 20, 30, 40, 50, 60, 70}; // Sorted array
        bs.arr = arr; // Assign array to the instance

        int key = 30; // Key to search for
        int result = bs.binarySearch(key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    private int[] arr; // Instance variable to hold the array
}
