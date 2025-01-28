// Create a new class called LinearSearch
public class LinearSearch {
    // Declaring a method class linearSearch that takes the array and targe as arguments
    public static int linearSearch(int[] arr, int target) {
        // Create a loop to itarate in the array and check if the target is equeal the 
        // element in the current index position
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Main class
    public static void main(String[] args) {
        // Defe an array
        int[] arr = {10, 20, 30, 40, 50};
        // Declare the target
        int target = 30;

        // Call the method passing the two arguemnts (array and the target)
        int result = linearSearch(arr, target);

        // Print the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
