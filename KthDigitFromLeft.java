import java.util.Scanner;

public class KthDigitFromLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        long number = scanner.nextLong();
        int k = scanner.nextInt();
        String numStr = Long.toString(number);
        if (k <= 0 || k > numStr.length()) {
            System.out.println("Invalid position");
        } else {
            char digit = numStr.charAt(k - 1);
            System.out.println(digit);
        }

        scanner.close();
    }
}