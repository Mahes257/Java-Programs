import java.util.Scanner;

public class KthDigitFromLeft_Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number and position
        long number = scanner.nextLong();
        int k = scanner.nextInt();

        // Count the number of digits
        int digits = 0;
        long temp = number;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Check if k is valid
        if (k <= 0 || k > digits) {
            System.out.println("Invalid position");
            return;
        }

        // Remove (digits - k) digits from the end
        long divisor = (long)Math.pow(10, digits - k);
        long result = (number / divisor) % 10;

        System.out.println(result);

        scanner.close();
    }
}