import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Create an array of size n
        int sum = 0;

        // Input elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; // Add each element to sum
        }

        // Display the sum
        System.out.println("The sum of the array elements is: " + sum);

        sc.close();
    }
}