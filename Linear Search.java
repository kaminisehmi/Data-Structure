import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Declare the array with the given size
        int[] array = new int[size];

        // Accept user input to populate the array
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Prompt the user to enter the target value to search for
        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        // Perform linear search
        int result = linearSearch(array, target);

        // Display the result
        if (result == -1) {
            System.out.println("Target value " + target + " not found in the array.");
        } else {
            System.out.println("Target value " + target + " found at index " + result + ".");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }
}
