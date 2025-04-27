import java.util.*;

public class GCDPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n (size of permutation): ");
        int n = scanner.nextInt();
        System.out.print("Enter GCD value k: ");
        int k = scanner.nextInt();
        System.out.println("GCD Permutation:");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * k) + " ");
        }
        scanner.close();
    }
}

