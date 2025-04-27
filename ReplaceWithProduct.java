import java.util.Scanner;

public class ReplaceWithProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Edge case: If there's only one or two elements
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }

        // Store first element separately
        int prev = arr[0];
        arr[0] = arr[0] * arr[1];

        // Process middle elements
        for (int i = 1; i < n - 1; i++) {
            int current = arr[i];
            arr[i] = prev * arr[i + 1];
            prev = current;
        }

        // Handle last element
        arr[n - 1] = arr[n - 2] * arr[n - 1];

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}