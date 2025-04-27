import java.util.Scanner;

public class HappyNumberChecker {
    
    public static long sumOfSquares(long num) {
        long sum = 0;
        while (num > 0) {
            long digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();

        if (num < 1 || num > 1000000000000000L) {
            System.out.println("Invalid input. Number must be between 1 and 10^15.");
            return;
        }

        long slow = num;
        long fast = num;

        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        if (slow == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("UnHappy Number");
        }

        scanner.close();
    }
}