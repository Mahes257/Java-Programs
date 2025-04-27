import java.util.Arrays;
import java.util.Scanner;

public class SecondGreatestBuiltIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr); 
        int first = arr[n - 1];
        int second = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != first) {
                second = arr[i];
                break;
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second greatest (all elements may be the same).");
        } else {
            System.out.println("Second greatest element: " + second);
        }
        scanner.close();
    }
}
